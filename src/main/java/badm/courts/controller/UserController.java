package badm.courts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import badm.courts.domain.UserDTO;
import badm.courts.service.UserService;

@RestController
@RequestMapping("users")

public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public ResponseEntity<Void> addUser(@RequestBody UserDTO userDTO){
		userService.addUser(userDTO);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<UserDTO> getUserById(@PathVariable ("id") Long id){
		userService.findUserById(id);
		return new ResponseEntity<UserDTO>(HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<UserDTO>> getAllUsers(){
		return new ResponseEntity<List<UserDTO>>(userService.findAllUsers(), HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Void> updateUser(@PathVariable ("id") Long id, @RequestBody UserDTO dto){
		dto.setId(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable ("id") Long id){
		userService.deleteUserById(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import badm.courts.domain.GroupPlayingPracticeDTO;
import badm.courts.service.GroupPlayingPracticeService;

@RestController
@RequestMapping("gpp")

public class GroupPlayingPracticeController {
	
	@Autowired
	private GroupPlayingPracticeService groupPlayingPracticeService;
	
	@PostMapping("/add")
	public ResponseEntity<Void> addGpp(GroupPlayingPracticeDTO dto){
		groupPlayingPracticeService.addGPP(dto);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<GroupPlayingPracticeDTO>> getAll(){
		return new ResponseEntity<List<GroupPlayingPracticeDTO>>(groupPlayingPracticeService.getAllGpp(), HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<GroupPlayingPracticeDTO> getGppById(@PathVariable ("id") Long id){
		groupPlayingPracticeService.getGppById(id);
		return new ResponseEntity<GroupPlayingPracticeDTO>(HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Void> updateGPP(GroupPlayingPracticeDTO dto, @PathVariable ("id") Long id){
		dto.setId(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteGpp(@PathVariable ("id") Long id){
		groupPlayingPracticeService.deleteGpp(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}

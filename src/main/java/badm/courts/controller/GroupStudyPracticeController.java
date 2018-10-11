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

import badm.courts.domain.GroupStudyPracticeDTO;
import badm.courts.service.GroupStudyPracticeService;

@RestController
@RequestMapping("gsp")

public class GroupStudyPracticeController {
	
	@Autowired
	private GroupStudyPracticeService groupStudyPracticeService;
	
	@PostMapping("/add")
	public ResponseEntity<Void> addGsp(@RequestBody GroupStudyPracticeDTO dto){
		groupStudyPracticeService.addGsp(dto);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<GroupStudyPracticeDTO>> getAll(){
		
		return new ResponseEntity<List<GroupStudyPracticeDTO>>(groupStudyPracticeService.getAllGsp(), HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<GroupStudyPracticeDTO> getGspById(@PathVariable ("id") Long id){
		groupStudyPracticeService.getGspById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Void> updateGsp(@PathVariable ("id") Long id, @RequestBody GroupStudyPracticeDTO dto){
		dto.setId(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteGSP(@PathVariable ("id") Long id){
		groupStudyPracticeService.deleteGspById(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}

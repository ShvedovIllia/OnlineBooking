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

import badm.courts.domain.CourtDTO;
import badm.courts.service.CourtService;

@RestController
@RequestMapping("court")

public class CourtController {
	
	@Autowired
	private CourtService courtService;

	@PostMapping("/add")
	public ResponseEntity<Void> addCourt(CourtDTO courtDTO){
		courtService.addCourt(courtDTO);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@GetMapping("/getCourt/{id}")
	public ResponseEntity<CourtDTO> getCourtById(@PathVariable ("id") Long id){
		
		courtService.getCourtById(id);
		return new ResponseEntity<CourtDTO>(HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<CourtDTO>> getAllCourts(){
		return new ResponseEntity<List<CourtDTO>>(courtService.getAllCourts(), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteCourt(@PathVariable ("id") Long id) {
		courtService.deleteCourtById(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Void> updateCourt(@PathVariable ("id") Long id, CourtDTO courtDTO){
		courtDTO.setId(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}

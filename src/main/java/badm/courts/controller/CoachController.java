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

import badm.courts.domain.CoachDTO;
import badm.courts.entity.Coach;
import badm.courts.service.CoachService;

@RestController
@RequestMapping("coach")

public class CoachController {

	@Autowired
	private CoachService coachService;

	@PostMapping("/add")
	public ResponseEntity<Void> addCoach(@RequestBody CoachDTO coachDTO) {
		coachService.addCoach(coachDTO);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<CoachDTO>> getAllCoaches() {
		return new ResponseEntity<List<CoachDTO>>(coachService.findAllCoaches(), HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<CoachDTO> getCoachById(Long id) {
		return new ResponseEntity<CoachDTO>(coachService.findCoachById(id), HttpStatus.OK);

	}

	@PutMapping
	public ResponseEntity<Void> updateCoach(@PathVariable Long id, @RequestBody CoachDTO coachDTO) {
		coachDTO.setId(id);
		coachService.addCoach(coachDTO);

		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteCoach(@PathVariable("id") Long id) {
			coachService.deleteCoachById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}

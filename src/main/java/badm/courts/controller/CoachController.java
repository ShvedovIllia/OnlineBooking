package badm.courts.controller;

import java.util.List;
import java.util.Objects;

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
import badm.courts.exception.CoachNotFoundException;
import badm.courts.service.CoachService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
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
		log.info("get all coaches");
		//throw new BadRequestException("bad request");
		return new ResponseEntity<List<CoachDTO>>(coachService.findAllCoaches(), HttpStatus.OK);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<CoachDTO> getCoachById(@PathVariable ("id") Long id) {
		log.info("come request to get user by id {}", id);
		CoachDTO coachDTO = coachService.findCoachById(id);
		if(Objects.isNull(coachDTO)) {
			throw new CoachNotFoundException(id, "Coach not found");
		} else 
		{
		return new ResponseEntity<CoachDTO>(coachService.findCoachById(id), HttpStatus.OK);
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Void> updateCoach(@PathVariable Long id, @RequestBody CoachDTO coachDTO) {
		log.info("update coach with id {}", id);
		coachDTO.setId(id);
		coachService.addCoach(coachDTO);
		if(Objects.isNull(coachDTO)) {
			log.warn("coach with id {} not found", id);
			throw new CoachNotFoundException(id, "Coach not found");
		} else 
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteCoach(@PathVariable("id") Long id) {
		coachService.deleteCoachById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}

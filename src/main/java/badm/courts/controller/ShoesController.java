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

import badm.courts.domain.ShoesDTO;
import badm.courts.service.ShoesService;

@RestController
@RequestMapping("shoes")

public class ShoesController {

	@Autowired
	private ShoesService shoesService;

	@PostMapping
	public ResponseEntity<Void> addShoes(ShoesDTO dto) {
		shoesService.addShoes(dto);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<ShoesDTO> getShoesById(@PathVariable("id") Long id) {
		shoesService.getShoesById(id);
		return new ResponseEntity<ShoesDTO>(HttpStatus.OK);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<ShoesDTO>> getAllShoes() {
		return new ResponseEntity<List<ShoesDTO>>(shoesService.getAllShoes(), HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Void> updateShoes(@PathVariable("id") Long id, ShoesDTO dto) {
		dto.setId(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteShoes(@PathVariable("id") Long id) {
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}

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

import badm.courts.domain.WaterDTO;
import badm.courts.service.WaterService;

@RestController
@RequestMapping("water")

public class WaterController {
	
	@Autowired
	private WaterService waterService;
	
	@PostMapping("/add")
	public ResponseEntity<Void> addWater(@RequestBody WaterDTO waterDTO){
		waterService.addItem(waterDTO);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<WaterDTO> getWaterById(@PathVariable ("id") Long id){
		waterService.getWaterById(id);
		return new ResponseEntity<WaterDTO>(HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<WaterDTO>> getAllWater(){
		return new ResponseEntity<List<WaterDTO>>(waterService.getAllWater(), HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Void> updateWater(@PathVariable ("id") Long id, @RequestBody WaterDTO dto){
		dto.setId(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteWater(@PathVariable ("id") Long id){
		waterService.deleteWaterById(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}

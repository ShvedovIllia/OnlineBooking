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

import badm.courts.domain.CostDTO;
import badm.courts.service.CostService;

@RestController
@RequestMapping("cost")

public class CostController {
	
	@Autowired
	private CostService costService;

	@PostMapping("/add")
	public ResponseEntity<Void> addCost(@RequestBody CostDTO costDTO){
		costService.createCost(costDTO);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<CostDTO> getCostById(@PathVariable ("id") Long id){
		return new ResponseEntity<CostDTO>(costService.getCostById(id), HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<CostDTO>> getAllCosts(){
		return new ResponseEntity<List<CostDTO>>(costService.getAllCosts(),HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Void> updateCost(@PathVariable("id") Long id, @RequestBody CostDTO costDTO){
		costDTO.setId(id);
		costService.createCost(costDTO);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteCost(@PathVariable ("id") Long id){
		costService.deleteCostById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}

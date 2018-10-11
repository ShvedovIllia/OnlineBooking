package badm.courts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import badm.courts.domain.EquipmentDTO;
import badm.courts.service.EquipmentService;

@RestController
@RequestMapping("equipment")

public class EquipmentController {
	
	@Autowired
	private EquipmentService equipmentService;

	@PostMapping("/add")
	public ResponseEntity<Void> addEquipment(@RequestBody EquipmentDTO dto){
		equipmentService.addItem(dto);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<EquipmentDTO>> getAllEquipments(){
		return new ResponseEntity<List<EquipmentDTO>>(equipmentService.getAllEquipments(), HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<EquipmentDTO> getById(@PathVariable ("id") Long id){
		equipmentService.getEquipmentById(id);
		return new ResponseEntity<EquipmentDTO>(HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteEquipment(@PathVariable ("id") Long id){
		equipmentService.deleteEquipment(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}

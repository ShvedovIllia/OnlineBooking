package badm.courts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import badm.courts.service.EquipmentService;

@RestController
@RequestMapping("equipment")

public class EquipmentController {
	
	@Autowired
	private EquipmentService equipmentService;

}

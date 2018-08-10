package badm.courts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import badm.courts.service.ShoesService;

@RestController
@RequestMapping("shoes")

public class ShoesController {

	@Autowired
	private ShoesService shoesService;
}

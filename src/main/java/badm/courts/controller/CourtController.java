package badm.courts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import badm.courts.service.CourtService;

@RestController
@RequestMapping("court")

public class CourtController {
	
	@Autowired
	private CourtService courtService;

}

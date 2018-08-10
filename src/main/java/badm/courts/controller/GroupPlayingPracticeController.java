package badm.courts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import badm.courts.service.GroupPlayingPracticeService;

@RestController
@RequestMapping("gpp")

public class GroupPlayingPracticeController {
	
	@Autowired
	private GroupPlayingPracticeService groupPlayingPracticeService;

}

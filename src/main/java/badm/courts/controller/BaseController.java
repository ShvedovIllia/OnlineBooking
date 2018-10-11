/*package badm.courts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import badm.courts.domain.mail.Mail;
import badm.courts.service.EmailService;

@RestController

public class BaseController {
	@Autowired
	private EmailService emailService;
	
	@GetMapping("test-message")
	public ResponseEntity<Void> sendTestMessage(@RequestParam("email") String email){
		
		Mail mail = Mail.builder().to(email).subject("TEST").content("mail mail mail").build();
		emailService.sendMessage(mail);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
*/
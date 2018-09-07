package badm.courts.controller;

import javax.ws.rs.BadRequestException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import badm.courts.exception.CoachNotFoundException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@ControllerAdvice
public class ExceptionHandlerController extends ResponseEntityExceptionHandler{
 
	@ExceptionHandler(BadRequestException.class)
	public ResponseEntity<?> handleException(BadRequestException e){
		log.warn("Yakas hernia");
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(CoachNotFoundException.class)
	public ResponseEntity<?> handleException(CoachNotFoundException e){
		log.warn("Yakas hernia");
		return new ResponseEntity<>(e.getMessage()+ " " + e.getId(),HttpStatus.BAD_REQUEST);
	}

	
}

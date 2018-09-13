package badm.courts.exception;

import lombok.Getter;

@Getter

public class UserNotFoundException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3518954408844048921L;
	private Long id;

	public UserNotFoundException(Long id, String message) {
		super(message);
		this.id = id;
	}
	

}

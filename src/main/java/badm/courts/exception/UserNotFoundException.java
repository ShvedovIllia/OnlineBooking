package badm.courts.exception;

import lombok.Getter;

@Getter

public class UserNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -984650309077606640L;

	private Long id;

	public UserNotFoundException(Long id, String message) {
		super(message);
		this.id = id;
	}

}

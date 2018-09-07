package badm.courts.exception;

import lombok.Getter;

@Getter
public class CoachNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2467783192678108327L;
	private Long id;

	public CoachNotFoundException(Long id, String message) {
		super(message);
		this.id = id;
	}
}

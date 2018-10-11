package badm.courts.exception;

import lombok.Getter;

@Getter

public class OrderNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4984581527985104797L;
	private Long id;

	public OrderNotFoundException(Long id, String message) {
		super(message);
		this.id = id;
	}
	
	

}

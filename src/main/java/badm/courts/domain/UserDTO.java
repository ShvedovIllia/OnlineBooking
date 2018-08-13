package badm.courts.domain;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserDTO {
	
	private Long id;

	private String firstName;

	private String lastName;

	private LocalDate birthDate;

	private String email;
	
	private String phoneNumber;

	
}

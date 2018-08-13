package badm.courts.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class CoachDTO {

	private Long id;
	private String firstName;
	private String lastName;
	private Integer age;
	private String category;
}

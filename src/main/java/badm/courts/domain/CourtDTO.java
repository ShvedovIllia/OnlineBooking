package badm.courts.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class CourtDTO {
	
	private Long id;
	private String numberOfCourt;
	private String typeOfCourt;
	private Integer hall;
}

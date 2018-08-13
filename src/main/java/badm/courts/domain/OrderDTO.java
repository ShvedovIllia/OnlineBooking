package badm.courts.domain;

import java.time.LocalDate;
import java.time.LocalTime;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class OrderDTO {
	
	private Long id;
	
	private LocalDate date;

	private LocalTime timeStart;

	private LocalTime timeEnd;

	private String description;

	private boolean withCoach;

}

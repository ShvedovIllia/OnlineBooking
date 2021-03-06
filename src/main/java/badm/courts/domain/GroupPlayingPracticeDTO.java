package badm.courts.domain;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class GroupPlayingPracticeDTO {
	
	private Long id;

	private String title;
	private BigDecimal price;
}

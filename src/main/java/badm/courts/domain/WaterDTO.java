package badm.courts.domain;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class WaterDTO {

	private Long id;
	private String title;
	private BigDecimal capacity;
	private boolean isCarbonated;
}

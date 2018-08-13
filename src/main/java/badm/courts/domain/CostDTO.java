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

public class CostDTO {
	
	private Long id;
	private String type;
	private BigDecimal priceForHalfHour;
}

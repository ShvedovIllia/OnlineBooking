package badm.courts.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Cost extends IdEntity{
	
	@Column(name="type", nullable=false)
	private String type;
	@Column(name="price_in_half_hour", columnDefinition="DECIMAL(5,2)")
	private BigDecimal priceInHalfHour;

}

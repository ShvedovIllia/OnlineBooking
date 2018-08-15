package badm.courts.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "water")
public class Water extends IdEntity{
	
	@Column(name="title", nullable = false)
	private String title;
	
	@Column(name="capacity", nullable=false, columnDefinition="DECIMAL(3,2)")
	private BigDecimal capacity;
	
	@Column(name="isCarbonared", nullable=false, columnDefinition="BOOLEAN")
	private boolean isCarbonated;
}

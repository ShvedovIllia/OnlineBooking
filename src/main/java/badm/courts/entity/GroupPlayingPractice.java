package badm.courts.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
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
@Table(name = "group_playing_practice")

public class GroupPlayingPractice extends IdEntity{
	
	@Column(name="title", nullable=false)
	private String title;
	@Column(name="price", nullable=false, columnDefinition="DECIMAL(5,2)")
	private BigDecimal price;
	@OneToOne
	private Coach coach;

}

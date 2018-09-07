package badm.courts.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
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
@Table(name = "court")

public class Court extends IdEntity{

	@Column(name="number_of_court", nullable=false, unique=true)
	private String numberOfCourt;
	
	@Column(name="typeOfCourt", nullable=false, unique=true)
	private String typeOfCourt;
	
	@Column(name="hall", nullable=false, unique=true)
	private Integer hall;
	
	@ManyToMany
	private List<Court> courts;
}

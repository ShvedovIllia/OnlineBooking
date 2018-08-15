package badm.courts.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
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
@Table(name = "orders")

public class Orders extends IdEntity {

	@Column(name = "date", nullable = false)
	private LocalDate date;

	@Column(name = "time_start", nullable = false)
	private LocalTime timeStart;

	@Column(name = "time_end", nullable = false)
	private LocalTime timeEnd;

	@Column(name = "description", nullable = false)
	private String description;

	@Column(name = "with_coach", nullable = false, columnDefinition = "BOOLEAN")
	private boolean withCoach;
	
	@ManyToMany
	@JoinColumn(name="court_id")
	private List<Court> courts;
	
	@ManyToMany
	private List<Coach> coaches;
	
	@ManyToMany
	private List<Equipment> equipments;
	
	@ManyToMany
	private List<Shoes> shoes;
	
	@ManyToMany
	private List<Water> water;

}

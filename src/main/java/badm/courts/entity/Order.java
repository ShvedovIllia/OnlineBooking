package badm.courts.entity;

import java.time.LocalDate;
import java.time.LocalTime;

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
@Table(name = "users_order")

public class Order extends IdEntity {

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
}

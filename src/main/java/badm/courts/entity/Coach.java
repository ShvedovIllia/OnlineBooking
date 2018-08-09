package badm.courts.entity;

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
@Table(name = "coach")

public class Coach extends IdEntity{
	
	@Column(name="firstName", nullable=false)
	private String firstName;
	@Column(name="lastName", nullable=false)
	private String lastName;
	@Column(name="age", nullable=false)
	private Integer age;
	@Column(name="category", nullable=false)
	private String category;
	
}

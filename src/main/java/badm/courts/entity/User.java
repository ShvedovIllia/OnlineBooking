package badm.courts.entity;

import java.time.LocalDate;

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
@Table(name = "users")
public class User extends IdEntity {

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "lsat_name", nullable = false)
	private String lastName;

	@Column(name = "birth_date", nullable = false)
	private LocalDate birthDate;

	@Column(name = "email", nullable = false, unique = true)
	private String email;
	
	@Column(name="phone_number", unique=true, nullable=false   )
	private String phoneNumber;

}

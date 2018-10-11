package badm.courts.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import badm.courts.entity.enums.UserRoles;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "users")
public class User extends IdEntity {
	
	@Column (nullable=false, unique=true)
	private String username;
	
	@Column(nullable=false)
	private String password;

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
	
	@Enumerated(EnumType.ORDINAL)
	private UserRoles role;

}

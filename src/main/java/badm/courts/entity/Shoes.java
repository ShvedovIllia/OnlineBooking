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
@Table(name = "shoes")

public class Shoes extends IdEntity {

	@Column(name = "size", nullable = false)
	private Integer size;
	@Column(name = "model", nullable = false)
	private String model;

}

package badm.courts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import badm.courts.entity.Water;

@Repository

public interface WaterRepository extends JpaRepository<Water, Long>{
	
}

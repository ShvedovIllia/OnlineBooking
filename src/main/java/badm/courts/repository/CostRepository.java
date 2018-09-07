package badm.courts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import badm.courts.entity.Cost;

@Repository

public interface CostRepository extends JpaRepository<Cost, Long>, JpaSpecificationExecutor<Cost> {

}

package badm.courts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import badm.courts.entity.Coach;

@Repository

public interface CoachRepository extends JpaRepository<Coach, Long>, JpaSpecificationExecutor<Coach> {

}

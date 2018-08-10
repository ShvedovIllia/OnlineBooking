package badm.courts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import badm.courts.entity.Court;

@Repository

public interface CourtRepository extends JpaRepository<Court, Long>, JpaSpecificationExecutor<Court> {

}

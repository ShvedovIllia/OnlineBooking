package badm.courts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import badm.courts.entity.Shoes;

@Repository

public interface ShoesRepository extends JpaRepository<Shoes, Long>, JpaSpecificationExecutor<Shoes> {

}

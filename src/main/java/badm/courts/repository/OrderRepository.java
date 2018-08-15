package badm.courts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import badm.courts.entity.Orders;

@Repository

public interface OrderRepository extends JpaRepository<Orders, Long>, JpaSpecificationExecutor<Orders> {

}

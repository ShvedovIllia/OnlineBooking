package badm.courts.service;

import java.util.List;

import badm.courts.domain.OrderDTO;

public interface OrderService {

	void addOrder(OrderDTO orderDTO);
	
	OrderDTO getOrderById(Long id);
	
	List<OrderDTO> getAllOrders();
	
	void deleteOrderById(Long id);
	
	void updateOrderById(Long id);
	
	
}

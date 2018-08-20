package badm.courts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import badm.courts.domain.OrderDTO;
import badm.courts.entity.Orders;
import badm.courts.repository.OrderRepository;
import badm.courts.service.OrderService;
import badm.courts.service.utils.ObjectMapperUtils;

@Service

public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ObjectMapperUtils modelMapper;


	@Override
	public void addOrder(OrderDTO orderDTO) {
		orderRepository.save(modelMapper.map(orderDTO, Orders.class));
	}

	@Override
	public OrderDTO getOrderById(Long id) {
		return modelMapper.map(orderRepository.findById(id), OrderDTO.class);
	}

	@Override
	public List<OrderDTO> getAllOrders() {
		return modelMapper.mapAll(orderRepository.findAll(), OrderDTO.class);
	}

	@Override
	public void deleteOrderById(Long id) {
		orderRepository.deleteById(id);
	}
}

package badm.courts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import badm.courts.domain.OrderDTO;
import badm.courts.service.OrderService;

@RestController
@RequestMapping("order")

public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/add")
	public ResponseEntity<Void> createOrder(@RequestBody OrderDTO dto){
		orderService.addOrder(dto);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<OrderDTO>> getAll(){
		return new ResponseEntity<List<OrderDTO>>(orderService.getAllOrders(), HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<OrderDTO> getOrderById(@PathVariable ("id") Long id){
		orderService.getOrderById(id);
		return new ResponseEntity<OrderDTO>(HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Void> updateOrder(@PathVariable ("id") Long id, @RequestBody OrderDTO dto){
		dto.setId(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteOrder(@PathVariable ("id") Long id){
		orderService.deleteOrderById(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}

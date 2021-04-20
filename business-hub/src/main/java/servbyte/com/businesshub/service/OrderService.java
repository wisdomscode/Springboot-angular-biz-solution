//package servbyte.com.businesshub.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import servbyte.com.businesshub.model.Order;
//import servbyte.com.businesshub.repository.OrderRepository;
//
//import java.util.List;
//
//@Service
//public class OrderService {
//    public final OrderRepository orderRepository;
//
//    @Autowired
//    public OrderService(OrderRepository orderRepository) {
//        this.orderRepository = orderRepository;
//    }
//
//    public Order addOrder(Order order) {
//        order.setId(order.getId());
//        return orderRepository.save(order);
//    }
//
//    public List<Order> findAllOrder() {
//        return orderRepository.findAll();
//    }
//
////    public Order findOrderById(Integer id) {
////        return orderRepository.findOrderById(id);
////    }
//
//}

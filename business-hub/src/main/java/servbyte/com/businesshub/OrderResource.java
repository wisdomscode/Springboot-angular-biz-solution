//package servbyte.com.businesshub;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import servbyte.com.businesshub.model.Order;
//import servbyte.com.businesshub.service.OrderService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/orders")
//public class OrderResource {
//    private final OrderService orderService;
//
//    public OrderResource(OrderService orderService) {
//        this.orderService = orderService;
//    }
//
//
//    @PostMapping("/add")
//    public ResponseEntity<Order> addOrder(@RequestBody Order order) {
//        Order newOrder = orderService.addOrder(order);
//        return new ResponseEntity<>(newOrder, HttpStatus.CREATED);
//    }
//
//
//    @GetMapping("/all")
//    public ResponseEntity<List<Order>> getAllOrder() {
//        List<Order> order = orderService.findAllOrder();
//        return new ResponseEntity<>(order, HttpStatus.OK);
//    }
//
////    @GetMapping("/find/{id}")
////    public ResponseEntity<Order> getOrderById(@PathVariable("id") Integer id) {
////        Order order = orderService.findOrderById(id);
////        return new ResponseEntity<>(order, HttpStatus.OK);
////    }
//
//}
//

//package servbyte.com.businesshub.model;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import java.io.Serializable;
//
//@Entity
//public class Order implements Serializable {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    @ManyToOne
//    @JoinColumn(name = "menu_id")
//    private Menu food;
//
//    private String customerName;
//    private String customerPhone;
//
//    public Order() {
//    }
//
//    public Order(Menu food, String customerName, String customerPhone) {
//        this.food = food;
//        this.customerName = customerName;
//        this.customerPhone = customerPhone;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public Menu getFood() {
//        return food;
//    }
//
//    public void setFood(Menu food) {
//        this.food = food;
//    }
//
//    public String getCustomerName() {
//        return customerName;
//    }
//
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public String getCustomerPhone() {
//        return customerPhone;
//    }
//
//    public void setCustomerPhone(String customerPhone) {
//        this.customerPhone = customerPhone;
//    }
//}

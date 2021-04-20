package servbyte.com.businesshub.model;

import javax.persistence.*;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String customerName;
    private String customerAddress;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu food;
    @Column(nullable = false, updatable = false)
    private String transaction_ref;

    public Payment() {
    }

    public Payment(String customerName, String customerAddress, Menu food, String transaction_ref) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.food = food;
        this.transaction_ref = transaction_ref;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Menu getFood() {
        return food;
    }

    public void setFood(Menu food) {
        this.food = food;
    }

    public String getTransaction_ref() {
        return transaction_ref;
    }

    public void setTransaction_ref(String transaction_ref) {
        this.transaction_ref = transaction_ref;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", food=" + food +
                ", transaction_ref='" + transaction_ref + '\'' +
                '}';
    }
}

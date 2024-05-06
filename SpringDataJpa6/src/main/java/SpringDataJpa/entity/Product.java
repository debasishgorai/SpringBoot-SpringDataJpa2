package SpringDataJpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ptbl")
public class Product {
	@Id
	@Column(name="id")
private Integer pid;
	@Column(name="name")
private String pname;
	@Column(name="price")
private double Price;
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", Price=" + Price + "]";
}
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public double getPrice() {
	return Price;
}
public void setPrice(double price) {
	Price = price;
}

}

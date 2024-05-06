package SpringDataJpa7.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empaddtbl")
public class Address {
	@Id
	@Column(name="addid")
private  Integer addid;
@Column(name="city")
private String city;
	
	public Address() {
	super();
	// TODO Auto-generated constructor stub
}
	public Address(Integer addid, String city, String state, Integer pincode, String country, Integer empid) {
	//super();
	this.addid = addid;
	this.city = city;
	this.state = state;
	this.pincode = pincode;
	this.country = country;
	this.empid = empid;
}
	@Override
public String toString() {
	return "Address [addid=" + addid + ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", country="
			+ country + ", empid=" + empid + "]";
}
	public Integer getAddid() {
	return addid;
}
public void setAddid(Integer addid) {
	this.addid = addid;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public Integer getPincode() {
	return pincode;
}
public void setPincode(Integer pincode) {
	this.pincode = pincode;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public Integer getEmpid() {
	return empid;
}
public void setEmpid(Integer empid) {
	this.empid = empid;
}
@Column(name="state")
private String state;
	@Column(name="pincode")
private Integer pincode;
	@Column(name="country")
private String country;
@Column(name="empid")
private Integer empid;




}

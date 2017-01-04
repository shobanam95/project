package com.urwardrobe.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cart {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int cart_Id;

private double total;
private int quantity;

private String price;

private String name;
public String getPrice() {
	return price;
}
public void setPrice(String string) {
	this.price = string;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getCart_Id() {
	return cart_Id;
}
public void setCart_Id(int cart_Id) {
	this.cart_Id = cart_Id;
}
public double getTotal() {
	return total;
}


public void setTotal(double total) {
	this.total = total;
}
public void setTotal(int total) {
	this.total = total;
}


}

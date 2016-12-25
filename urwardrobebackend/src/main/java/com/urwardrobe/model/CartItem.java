package com.urwardrobe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class CartItem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int cartitem_Id;
private int cartitem_Quantity;
private double cartitem_TotalPrice;


public int getCartitem_Id() {
	return cartitem_Id;
}
public void setCartitem_Id(int cartitem_Id) {
	this.cartitem_Id = cartitem_Id;
}
public int getCartitem_Quantity() {
	return cartitem_Quantity;
}
public void setCartitem_Quantity(int cartitem_Quantity) {
	this.cartitem_Quantity = cartitem_Quantity;
}
public double getCartitem_TotalPrice() {
	return cartitem_TotalPrice;
}
public void setCartitem_TotalPrice(double cartitem_TotalPrice) {
	this.cartitem_TotalPrice = cartitem_TotalPrice;
}



}

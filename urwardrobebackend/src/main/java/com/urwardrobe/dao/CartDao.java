package com.urwardrobe.dao;

import com.urwardrobe.model.AddressDetails;
import com.urwardrobe.model.Cart;
import com.urwardrobe.model.CartItem;
import com.urwardrobe.model.Customer;

public interface CartDao {
	public void save(Cart cart);
	public void update(Cart cart);
	public void getCartById(int cart_Id);
	public void save(Customer cus);
	public void save(AddressDetails add);
	public void save(CartItem ci);
}

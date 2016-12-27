package controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.urwardrobe.dao.CartDao;
import com.urwardrobe.model.Cart;
import com.urwardrobe.model.UserForm;


@Controller
public class CartController {

	
	private CartDao cartbean;
	

	public CartDao getCartbean() {
		return cartbean;
	}


	public void setCartbean(CartDao cartbean) {
		this.cartbean = cartbean;
	}
	
	public CartController(){
	
	@SuppressWarnings("resource")
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	context.scan("com.urwardrobe.confiig");
	context.refresh();
	}


	@RequestMapping(value="viproduct/buynow")
	public String buy(HttpServletRequest req){
		HttpSession session = req.getSession(true);
		System.out.println(session);
		UserForm user = (UserForm) session.getAttribute("username");
		System.out.println(user);
		if(user!=null){
			return "listprdt";
		}
		else
  		return "loginpage";
	}
	@RequestMapping(value="viproduct/Cart",method = RequestMethod.GET)
	public String cart(ModelMap model){
		Cart add = new Cart();
		model.addAttribute("cartitem", add);
		return "Cart";
	}
	
@RequestMapping(value="/addcart",method = RequestMethod.POST)
public String addcart(@ModelAttribute("value=cartitem")Cart cart)throws IOException{
	cartbean.save(cart);
	return null;
	
}

}

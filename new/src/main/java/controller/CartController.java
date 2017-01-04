package controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.urwardrobe.dao.CartDao;
import com.urwardrobe.dao.Daoimpl;
import com.urwardrobe.model.Cart;
import com.urwardrobe.model.Product;
import com.urwardrobe.model.UserForm;


@Controller
public class CartController {

	
	private CartDao cartbean;
	private Daoimpl prdtbean;

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
		else{
  		return "loginpage";
	}
	}
	 @RequestMapping(value ="viproduct/addcart", method = RequestMethod.GET)
	 public String save1(ModelMap model) {
		
		Cart crt = new Cart();
		model.addAttribute("add",crt);
		System.out.println("addcart");
		System.out.println(model);
	    return "Cart";
	
	 }
	 
	
		 @RequestMapping(value ="addcarts", method = RequestMethod.POST)
	  public String cartadd(@ModelAttribute(value="add")int  product_Id,Model model) throws IOException {
		 
		 Product product =	 prdtbean.getPrdt(product_Id);
		 Cart cart = new Cart();
		 cart.setName(product.getProduct_Name());
		
		 cart.setPrice(product.getProduct_Price());
		 cart.setQuantity(1);
		
			cartbean.save(cart);
			System.out.println(cart);
			return "listprdt";
		 }
		 
	
	
}


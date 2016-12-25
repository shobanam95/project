package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.urwardrobe.dao.CartDao;
import com.urwardrobe.model.UserForm;


@Controller
public class CartController {

	
	private CartDao cartbean;
	
	public CartController(){
	
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	context.scan("com.urwardrobe.confiig");
	context.refresh();
	}


	@RequestMapping(value="viproduct/buynow")
	public String buy(HttpServletRequest req){
		HttpSession session = req.getSession();
		System.out.println(session);
		UserForm user = (UserForm) session.getAttribute("username");
		System.out.println(user);
		if(user!=null){
			return "listprdt";
		}
		else
			
		return "loginpage";
	}
	@RequestMapping(value="/cart")
	public String Cart(){
		return "Cart";
	}
}

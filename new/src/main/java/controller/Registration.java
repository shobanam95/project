package controller;


import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.urwardrobe.dao.UserDao;
import com.urwardrobe.model.UserForm;

@Controller
public  class Registration  {
	
	
	
	HttpSession session;

	private UserDao userbean;
	
	public UserDao getUserbean() {
		return userbean;
	}   
       
	public void setUserbean(UserDao userbean) {
		this.userbean = userbean;
	}

	public Registration(){
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.urwardrobe.confiig");
		context.refresh();
		 userbean = (UserDao)context.getBean("userbean");
	}
	
	@ModelAttribute("user")
	public UserForm createModel(){
		return new  UserForm();
	
	}
	 
	@ModelAttribute("loginsign")
	public UserForm createSign(){
		return new  UserForm();
	
	}
	@RequestMapping("/")
	public String openHome()
	{
		return "indexpage";
	}    
	@RequestMapping("/contact")  
	public String sayContact()
	   {    	
	   	  
	    	return "Contact";
	   }
	 @RequestMapping("/signuo")
	   public String addSt(){
		 return "signuo";
	 }
	 @RequestMapping("/loginup")
	   public String addStg(){
		 return "loginpage";
	 }
	
	 @ModelAttribute("login")
		public UserForm createlogin(){
			return new  UserForm();
		}
   
	
	 
	  
	 @RequestMapping( value = "/signuo", method = RequestMethod.POST)
	   public String add(@ModelAttribute(value="loginsign")   UserForm user,BindingResult result) {
		 System.out.println("inside addstudeent");
		userbean.save(user);
		
	      return "loginpage";
	 }

	 
	 
	 
	 
	 @RequestMapping( value = "/loginpage", method = RequestMethod.POST)
	   public String addStudent(HttpServletRequest req,ModelMap map)  {
		String view="";
		session = req.getSession(true);
		List<UserForm> list = userbean.getUser(req.getParameter("checkname"),req.getParameter("checkpwd"));
		if(!list.isEmpty()){
		 		for(UserForm role : list){
		if(role.getRole().equals("ROLE_ADMIN"))
		{
			session.setAttribute("name",role.getUsername());
			
			 view = "ProductAdmin";
		}
		
		else if(role.getRole().equals("ROLE_USER")) 
		{
			
			
			session.setAttribute("name", role.getUsername());
			view="indexpage";
		
			
		}
		
		
		}
	
		}
		else{

			  session.setAttribute("error", "Either username or password is invalid.");	
			 view="loginpage";
			
		}
		
		 
	return view;
	 }

@RequestMapping("/logout")
public String Logou(){
	UserForm user = (UserForm) session.getAttribute("username");
	session.removeAttribute("user");
	session.invalidate();
	return "indexpage";
}
	 
			
			
}		
		






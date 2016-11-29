package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;
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
	
	
	
	HttpSession session ;
	
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
	   public String addStudent(HttpServletRequest req,ModelMap map) throws ServletException,IOException {
System.out.println("hgjy");
		String view="";
		session = req.getSession(true);
		List<UserForm> list = userbean.getUser(req.getParameter("checkname"),req.getParameter("checkpwd"));
		System.out.println(req.getParameter("checkname"));
		System.out.println(req.getParameter("checkpwd"));
System.out.print(list);
		
		
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

			
			 view="loginpage";
			
		}
		
		 
	return view;
	 }

@RequestMapping("/logout")
public String Logou(){
	session.invalidate();
	return "indexpage";
}
	 

}



	 
	 
/*	 
 @RequestMapping("/loginpage")
 public ModelAndView logincheck(HttpServletRequest request){
	
	 String log = request.getParameter("username");
	 String log2 = request.getParameter("password");
	
	 List<UserForm> list = userbean.list();
	 if(list != null){
		 if(log.equals(getUsername()) && log2.equals(getUserbean()))
		 {
			 
		 }
			return new ModelAndView("indexpage") ;
		}
			else{
				return new ModelAndView("loginpage") ;
		}
	
 }


}
 
	
/* String check(UserForm user){
			UserForm user1 = new UserForm();
		List<UserForm> list = userbean.list();
		if(list != null){
			return "indexpage";
		}
			else{
				return "loginpage";
		}

}
}
			
			
			
			
			
			
		







/*   package controller;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;


import model.Register;

@Controller
@RequestMapping
public class RegisterController {

    
    public String viewRegistration(Map<String, Object> model) {
    	Register regForm = new Register();    
        model.put("regForm", regForm);
         
        List<String> genderList = new ArrayList();
        genderList.add("Male");
        genderList.add("Female");
        
        model.put("genderList", genderList);
         
        return "signuo";
    }
     
     
     
      @RequestMapping( value = "/login", method = RequestMethod.POST)
	   public String addrelogin() {
		 System.out.println("inside addstudeent");
		
	      return "indexpage";
	 }
     
     
     

    public String processRegistration(@ModelAttribute("regForm") Register r1,
            Map<String, Object> model) {
         
        // implement your own registration logic here...
         
        // for testing purpose:
        System.out.println("firstname: " + r1.getFirstname());
        System.out.println("lastname: " + r1.getLastname());
        System.out.println("password: " + r1.getPassword());
        System.out.println("email: " + r1.getEmail());
        System.out.println("birthDay: " + r1.getConfirm_password());
         
        return "index";
    }
}

 */











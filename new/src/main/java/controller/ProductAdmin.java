package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.urwardrobe.dao.DaoService;
import com.urwardrobe.dao.UserDao;
import com.urwardrobe.model.Product;
import com.urwardrobe.model.UserForm;
@Controller
public class ProductAdmin<prdtbean> {
	
private DaoService prdtbean;
	
	public ProductAdmin(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.urwardrobe.confiig");
		context.refresh();
		 prdtbean = (DaoService)context.getBean("prdtbean");
	}
	
	@ModelAttribute("prdt")
	public Product createModel(){
		return new  Product();
	}
	@ModelAttribute("viewpro")
	public Product creat(){
		return new  Product();
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
	   
		  
	
	 @RequestMapping(value ="ProductAdmin")
	 public String fun(@ModelAttribute("value=funcprdt")Product prdt,ModelMap model) {
		 System.out.println("inside addstudeent");
		 
	    return "ProductAdmin";
	    
	   }
	 @RequestMapping(value ="/addprdt", method = RequestMethod.GET)
	 public String save1(ModelMap model) {
		 System.out.println("out addstudeent");
		 Product prdt = new Product();
	
		model.addAttribute("prdt1ad",prdt);
		
	    return "addprdt";
	
	 }
	 
	
		 @RequestMapping(value ="/addprdts", method = RequestMethod.POST)
	 public String save(@ModelAttribute("value=prdt1ad")Product prdt,ModelMap model) {
		 System.out.println("llll addstudeent");
		 prdtbean.save(prdt);
	    return "redirect:listprdt";
	    
	   }
	
		
		

	 @RequestMapping("/updateprdt" )
	   public String update() {
    return "updateprdt";
  		  }
	
	 
	 @RequestMapping("/listprdt")
	
	 public ModelAndView list() {
		List<Product> prdt = prdtbean.listProduct();
		
	    return new ModelAndView("listprdt","prdtlist",prdt);
	    
	   }
	 @RequestMapping("/editprdt" )
	   public String update2() {
  return "editprdt";
		  }
	 
	 
	 @ModelAttribute("editobj")
		public Product create(){
			return new  Product();
		}
	@RequestMapping("/getProduct/{product_Id}")
	 public ModelAndView pos(@PathVariable(value="product_Id")int product_Id)
	 {
		Product pr=prdtbean.getProduct(product_Id);
		return new ModelAndView("addprdt","showobj",pr);
	 }
	 
	
	
	 
	 @RequestMapping("/deleteprdt")
	 public String editProductform(@RequestParam("product_Id") int product_Id)
	 {
		 prdtbean.delete(product_Id);
		 return ("redirect:/listprdt");
	 }   
	 
	 
	 
	 @RequestMapping(value="/editprdts",method=RequestMethod.GET)
	 public ModelAndView edit(@RequestParam("product_Id")int product_Id)
	 {
		 Product prd= this.prdtbean.getProduct(product_Id);
		  
		 return new ModelAndView("editprdt","editobj",prd) ;
	 }
 
	 
	 @RequestMapping(value="/editprdt",method=RequestMethod.POST)
	 public String editfunc(@ModelAttribute(value="editobj")Product prdt){
		 prdtbean.update(prdt);
		 return ("redirect:/listprdt");
	 }
	 
	 @RequestMapping(value="/category",method=RequestMethod.GET)
	 public ModelAndView cat1(HttpServletRequest req){
		List<Product> list = prdtbean.getProduct(req.getParameter("cat"));
		ModelAndView mv=new ModelAndView("Category");
		mv.addObject("prod", list);
		 return mv;
	 }
	
	 


}


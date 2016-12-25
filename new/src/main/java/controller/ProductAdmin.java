package controller;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.urwardrobe.dao.DaoService;
import com.urwardrobe.model.Product;

@Controller
public class ProductAdmin {
	
private DaoService prdtbean;
	
	public ProductAdmin(){
		@SuppressWarnings("resource")
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
	
	

	   
		  
	
	 @RequestMapping(value ="ProductAdmin")
	 public String fun(@ModelAttribute("value=funcprdt")Product prdt,ModelMap model) {
		
	    return "ProductAdmin";
	    
	   }
	 @RequestMapping(value ="/addprdt", method = RequestMethod.GET)
	 public String save1(ModelMap model) {
		
		Product prdt = new Product();
		model.addAttribute("prdt1ad",prdt);
	    return "addprdt";
	
	 }
	 
	
		 @RequestMapping(value ="/addprdts", method = RequestMethod.POST)
	  public String save(@ModelAttribute("value=prdt1ad")@Valid Product prdt,ModelMap model,MultipartFile file,HttpServletRequest request) throws IOException {
		 System.out.println("llll addstudeent");
		
		 prdtbean.save(prdt);
		@SuppressWarnings("unused")
		MultipartFile check = prdt.getFile();
		
		
		
		
		
		String path = "C:/Users/Admin/git/project/new/src/main/webapp/resources/images/" + prdt.getProduct_Id()+".jpg";
		
				byte[] bytes = file.getBytes();
				BufferedOutputStream image = new BufferedOutputStream(new FileOutputStream(new File(path)));
				image.write(bytes);
				image.close();
			
		
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
	 
	
	 	
	 
	 @RequestMapping("/deleteprdt")
	 public String editProductform(@RequestParam("product_Id") int product_Id)
	 {
		 prdtbean.delete(product_Id);
		 return ("redirect:/listprdt");
	 }   
	 	 
	 
	 @RequestMapping(value="/editprdts",method=RequestMethod.GET)
	 public ModelAndView edit(@RequestParam("product_Id")int product_Id)
	 {
		 Product prd= this.prdtbean.getPrdt(product_Id);
		 System.out.println("prd");
		 System.out.println(product_Id);
		 System.out.println(prd); 
		 return new ModelAndView("editprdt","editobj",prd) ;
	 }
 
	 
	 @RequestMapping(value="/editprdt",method=RequestMethod.POST)
	 public String editfunc(@ModelAttribute(value="editobj")Product prdt){
		System.out.println(prdt.getProduct_Name());
		 prdtbean.update(prdt);
		 System.out.println("edit");
		 System.out.println(prdt);
		 
		 return ("redirect:/listprdt");
	 }
	 
	 @RequestMapping(value="/category",method=RequestMethod.GET)
	 public ModelAndView cat1(HttpServletRequest req){
		List<Product> list = prdtbean.getProduct(req.getParameter("cat"));
		ModelAndView mv=new ModelAndView("Category");
		mv.addObject("prod", list);
		 return mv;
	 }
	  
 
	 @RequestMapping(value="/viproduct/{product_Id}")
	 public  ModelAndView check(@PathVariable(value = "product_Id")int product_Id,Model model){
		 Product check = prdtbean.getPrdt(product_Id);
		 model.addAttribute("product", check);
	 System.out.println(check);
	 return new ModelAndView("viewprdt");
	 }	
	
}
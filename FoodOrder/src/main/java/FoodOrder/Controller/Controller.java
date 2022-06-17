package FoodOrder.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
	@RequestMapping("/home")
	public String home() {
		return "index";
	}
	@RequestMapping("/order")
	public ModelAndView showorder(@RequestParam ("t1") String str) {
		ModelAndView mv=new ModelAndView();
		
		mv.addObject("dish",str);
		mv.setViewName("Thank.jsp");
		return mv;
	}
	

}

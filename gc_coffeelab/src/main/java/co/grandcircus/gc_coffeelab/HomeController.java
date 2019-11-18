package co.grandcircus.gc_coffeelab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class HomeController {
	@Autowired
	
		@RequestMapping("/registration")
	    public ModelAndView goToRegistrationPage() {
	        ModelAndView registrationView = new ModelAndView();
	        registrationView.setViewName("registration"); //name of the jsp-file in the 'page' folder
	 
	        String str = "Register here!";
	        registrationView.addObject("message", str); //adding of str object as 'message' parameter
	 
	        return registrationView;
	    }
	
	@RequestMapping("/summary")
	public ModelAndView goToSummaryPage() {
		ModelAndView summaryView = new ModelAndView();
		summaryView.setViewName("summary");
		return summaryView;
	}
	
	@PostMapping("/add-user")
	public ModelAndView formDeets(@RequestParam("first") String firstStr, @RequestParam("last") String lastStr,
			@RequestParam("email") String emailStr, @RequestParam("number") String numberStr, @RequestParam("password") String passwordStr) {
		User newUser = new User(firstStr, lastStr, emailStr, numberStr, passwordStr);
		return new ModelAndView("summary", "user", newUser.toString());
				
	}
	
		


}

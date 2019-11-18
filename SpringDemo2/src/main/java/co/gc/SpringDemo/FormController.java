package co.gc.SpringDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {

	@RequestMapping("/forms")
	public String showNewFormPage() {
		return "other-forms";
	}
	
	@RequestMapping("/checkbox-form")
	public ModelAndView checkbox(String vehicle) {
		String[] vehicles = vehicle.split(",");
		return new ModelAndView("form-page", "p", vehicles[1]);
	}
}

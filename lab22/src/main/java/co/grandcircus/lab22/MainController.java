package co.grandcircus.lab22;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/")
	public ModelAndView home () {
		ModelAndView mv = new ModelAndView();
		return mv;
		
	}
}

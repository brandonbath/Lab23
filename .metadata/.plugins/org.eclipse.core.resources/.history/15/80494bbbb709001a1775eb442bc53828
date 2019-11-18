package co.gc.SpringDemo109;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	// this @Autowired annotation works in conjunction with the
	// @Component annotation (in the Person class) to allow
	// allow us to take advantage of Spring's Dependency Injection
	@Autowired
	private Person p;

	// the RequestMapping is how we will call the methods in the
	// Controller classes -- they will be called when we
	// navigate the referenced url in our browser
	// localhost:8080 is the default server port
	@RequestMapping("/")
	public ModelAndView home() {
		// the ModelAndView object allows us to manage the jsp pages we want to show
		// and the model data that we want to pass in
		// first param is the page name
		// second param is the model name that will used in the jsp to
		// represent the third param which is the model data
		ModelAndView mv = new ModelAndView("index", "test", "Hi, my name is Antonella!");
		p.setFirstName("Grant");
		p.setLastName("Chirpus");
		p.setAge(5);

		mv.addObject("personTest", p.getFirstName() + " " + p.getLastName());

		return mv;
	}

	// PostMappings and the method assignment in the form will allow us to 
	// hide the input details from our url
	@PostMapping("/add-person")
	public ModelAndView formDeets(@RequestParam("first") String f, @RequestParam("last") String l,
			@RequestParam("age") int age) {
		Person pFromForm = new Person(f, l, age);
		return new ModelAndView("form-page", "p", pFromForm);
	}
	
	// you can alternatively just add the variables with names and types
	// if the parameter names match the name aattribute assigned in the
	// input field on the form
	@PostMapping("/add-person2")
	public ModelAndView formDeets2(String first, String last,
			int age) {
		Person pFromForm = new Person(first, last, age);
		return new ModelAndView("form-page", "p", pFromForm);
	}
	
	// mapping the names from the form directly to an object -- this is known as binding
	@GetMapping("/add-person3")
	public ModelAndView formDeets3(Person pFromForm) {
		//Person pFromForm = new Person(first, last, age);
		return new ModelAndView("form-page", "p", pFromForm);
	}

}

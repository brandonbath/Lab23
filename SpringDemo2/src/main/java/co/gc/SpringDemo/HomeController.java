package co.gc.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@Autowired // this Autowired annotation works in conjunction with the @Component annotation (in Person class)
				// to allow us to take advantage of Spring's Dependency Injection
	private Person p;
	
	//the RequestMapping is how we will call the methods in the Controller classes
	//they will be called when we navigate to the referenced url in our browser
	//localhost:8080 is the default server port
	@RequestMapping("/") //mapping to homepage (/)
	public ModelAndView home() {
		//ModelAndView(String viewName, Map<String,?> model, HttpStatus status)
		//Create a new ModelAndView given a view name, model, and HTTP status.
		//ModelAndView object allow u to manage the jsp pages we want to show
		// first param is page name
		// second param is the model name that will be used in the jsp to represent the third param
		// which is the model data
		// ${test} - known as an expressions language tag
		
		ModelAndView mv = new ModelAndView("index", "test", "Hi, my name is Brandon!");
		p.setFirstName("Grant");
		p.setLastName("Chirpus");
		p.setAge(5);
		
		mv.addObject("personTest", p);
		
		return mv; //index is the jsp file we created
	}
	
	@PostMapping("/add-person")
	public ModelAndView formDeets(@RequestParam("first") String f, @RequestParam("last") String l, @RequestParam("age") int age) {
		Person pFromForm = new Person(f, l, age);
		return new ModelAndView("form-page", "p", pFromForm);
		
		
	}
	@GetMapping("/add-person2")
	public ModelAndView formDeets2(String first, String last,  int age) {
		Person pFromForm = new Person(first, last, age);
		return new ModelAndView("form-page", "p", pFromForm);
	
}
	@GetMapping("/add-person3")
	public ModelAndView formDeets3(Person pFromForm) {
		//Person pFromForm = new Person(first, last, age);
		return new ModelAndView("form-page", "p", pFromForm);
		
}}

package com.cognizant;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@Autowired
	private StudentValidator studentvalidator;

	public StudentValidator getStudentvalidator() {
		return studentvalidator;
	}

	public void setStudentvalidator(StudentValidator studentvalidator) {
		this.studentvalidator = studentvalidator;
	}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder)
	{
		binder.addValidators(studentvalidator);
	}
	
	@RequestMapping("/")
	public ModelAndView add()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("student", new Student());  //It is necessary so that the object can be created with user fields in validation page.
		
		mv.setViewName("Validation");
		
		return mv;
	}
	
	@RequestMapping("insertion")
	public String add1(@ModelAttribute("student")  @Valid Student s,BindingResult bind) //@ModelAttribute fetches the object from validaton page and passes to the success page.
	{
		//ModelAndView mv = new ModelAndView();
		if(bind.hasErrors())
		{
			//mv.setViewName("Validation");
			return "Validation";
		}
		else
		{
			
			//mv.setViewName("success");
			return "success";
		}
		
	
		
		
	//	return "success";
	}

	
	
	

}

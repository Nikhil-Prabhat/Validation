package com.cognizant;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


@Component
public class StudentValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Student.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmpty(errors, "name", "student.name.empty");
		ValidationUtils.rejectIfEmpty(errors, "email", "student.email.empty");
		ValidationUtils.rejectIfEmpty(errors, "gender", "student.gender.empty");
		ValidationUtils.rejectIfEmpty(errors, "languages", "student.languages.empty");

		Student student = (Student) target;
		
		Pattern pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
		
		if(!(pattern.matcher(student.getEmail()).matches()))
		{
			errors.rejectValue("email", "student.email.invalid");
		}
		
		
	}

}

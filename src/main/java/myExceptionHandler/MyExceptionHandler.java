package myExceptionHandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice("com.mySpring.www")
public class MyExceptionHandler {

	@ExceptionHandler(Exception.class)
	public void name() {
		System.out.println("error");
	}
}

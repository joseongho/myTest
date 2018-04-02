package myExceptionHandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {

	@ExceptionHandler(Exception.class)
	public void name() {
		System.out.println("error");
	}

	@ExceptionHandler(RuntimeException.class)
	public void name2() {
		System.out.println("error2");
	}
}

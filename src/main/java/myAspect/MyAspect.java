package myAspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
	@Pointcut("execution(public * *issi*(..))")
	public void myPointcut() {
	}

	@Before("myAspect.MyAspect.myPointcut()")
	public void testAspect() {
		System.out.println("testMyAspect");
	}
}

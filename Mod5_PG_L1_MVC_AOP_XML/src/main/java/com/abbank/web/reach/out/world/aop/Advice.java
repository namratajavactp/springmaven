package com.abbank.web.reach.out.world.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.ProceedingJoinPoint;

import com.abbank.web.reach.out.world.beans.EnrollRequest;


@Aspect
public class Advice {
	
/*	
	@Before("execution(* com.abbank.web.reach.out.world.services.SaveDataService.save(com.abbank.web.reach.out.world.beans.EnrollRequest))" +
			" and args(enrollRequest)")
	public void beforeImpl( EnrollRequest enrollRequest) {
		System.out.println("-------->Me called before calling Bean " + enrollRequest.getFirstname());
	}
	
	@After("execution(* com.abbank.web.reach.out.world.services.SaveDataService.save(..))")
	public void AfterImpl2() {
		System.out.println("-------->Me called after  calling Bean");
	}


@AfterThrowing(pointcut="execution(* com.abbank.web.reach.out.world.services.SaveDataService.save(..))")
public void AfterImpl(Exception exception) {
	System.out.println("-------->Me called @AfterThrowing  calling Bean");
}

@DeclareParents(value="com.abbank.*+",defaultImpl=SaveDataService.class)
            public static ISaveDataService saveDataService;
	

@AfterThrowing(pointcut="execution(* com.abbank.web.reach.out.world.services.SaveDataService.save(..))"
		, throwing = "exception")
public void AfterImpl(Exception exception) {
	
	System.out.println("-------->Me called @AfterThrowing  calling Bean" + exception);
}


@AfterReturning(pointcut="execution(* com.abbank.web.reach.out.world.services.SaveDataService.save(..))"
		, returning = "returnVal")
public void AfterImpl(Object returnVal) {
	System.out.println("-------->Me called after  calling Bean"+returnVal);
}

@AfterReturning("execution(* com.abbank.web.reach.out.world.services.SaveDataService.save(..))")
public void AfterImpl() {
	System.out.println("-------->Me called after  calling Bean");
}

	@Pointcut("execution(* com.abbank.web.reach.out.world.services.SaveDataService.save(com.abbank.web.reach.out.world.beans.EnrollRequest)) and args(enrollRequest)")
private void point(EnrollRequest enrollRequest) {

}

@Before("point(enrollRequest)")
public void beforeImpl( EnrollRequest enrollRequest) {
	System.out.println("-------->Me called before calling Bean");
}

@DeclareParents(value="com.abbank.*+",
        defaultImpl=SaveDataService.class)
        public static ISaveDataService saveDataService;

 @AfterReturning("execution(* com.abbank.web.reach.out.world.services.SaveDataService.save(..))")
public void AfterImpl1() {
	System.out.println("-------->Me called after  calling Bean");
}

*/

	
@Around("execution(* com.abbank.web.reach.out.world.services.SaveDataService.save(..))")
public void aroundImpl(ProceedingJoinPoint joinPoint) throws Throwable {
	System.out.println("-------->Me called before calling Bean in around advice");
	
	joinPoint.proceed();
	
	System.out.println("-------->Me called After  calling Bean in around advice");
	
   }  

}

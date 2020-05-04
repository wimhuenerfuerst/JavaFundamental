package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeAspect {

	private static final Logger LOGGER = LoggerFactory.getLogger(TimeAspect.class);

	@Around("execution(* aop.Main.*(..))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		long start = System.currentTimeMillis();

		Object result = pjp.proceed();

		long end = System.currentTimeMillis();
		long diff = end - start;
		LOGGER.info(pjp.getSignature() + " Time diff " + diff);

		return result;
	}

	@Before("execution(* aop.Main.*(..))")
	public void before(JoinPoint joinPoint) {
		LOGGER.info("before");
	}

	@After("execution(* aop.Main.*(..))")
	public void after(JoinPoint joinPoint) {
		LOGGER.info("after");
	}

}

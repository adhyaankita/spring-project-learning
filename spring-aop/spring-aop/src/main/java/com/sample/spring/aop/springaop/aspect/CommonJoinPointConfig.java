package com.sample.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

	@Pointcut("execution(* com.sample.spring.aop.springaop.business.*.*(..))")
	public void businessLayerExecution() {}

	@Pointcut("execution(* com.sample.spring.aop.springaop.data.*.*(..))")
	public void dataLayerExecution() {}

	@Pointcut("com.sample.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution() && com.sample.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
	public void allLayerExecution() {}
	
	@Pointcut("bean(*dao*)")
	public void beanContainingDao() {}
	
	@Pointcut("within(com.sample.spring.aop.springaop.data..*)")
	public void dataLayerExecutionWithWithin() {}
	
	@Pointcut("@annotation(com.sample.spring.aop.springaop.aspect.TrackTime)")
	public void trackTimeAnnotation() {}

}

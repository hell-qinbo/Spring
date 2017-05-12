package com.qinbo.aspect;

import com.qinbo.service.log.LogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogAspect
{
	private final static Logger log = LoggerFactory.getLogger(LogService.class);

	public void beforeDoLog(JoinPoint point)
	{
		log.info("before---------------------");

	}

	public void afterDoLog(JoinPoint point)
	{
		log.info("after---------------------");

	}

	public Object aroundDoLog(ProceedingJoinPoint point) throws Exception
	{
		log.info("around---------------------");
		Object object = null;
		try
		{
			object = point.proceed();
		}
		catch (Throwable e)
		{
			// TODO Auto-generated catch block
			throw new Exception(e);
		}
		return object;
	}

	public void afterReturnDoLog(JoinPoint point)
	{
	}

	public void afterThrowDoLog(JoinPoint point)
	{

	}
}

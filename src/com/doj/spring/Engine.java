package com.doj.spring;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/*
 * @Component annotation is used to define bean.
 * It is like <bean id="engine" class="com.doj.spring.Engine"/>
 */
@Component
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)

public class Engine {
	
	final String engineName="FORD";

	public String getEngineName() {
		return engineName;
	}

}

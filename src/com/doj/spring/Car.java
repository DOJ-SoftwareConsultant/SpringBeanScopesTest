package com.doj.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/*
 * @Component annotation is used to define bean.
 * It is like <bean id="car" class="com.doj.spring.Car"/>
 */

@Component
//@Component("car")   //We use this to remove ambiguity of beans we have two same car in same base package(com.doj.spring) but it will create ambiguity that's why we give name to every bean
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Car {
	
	@Autowired
	Engine engine;
	
	
	public Car() {
		super();
	}
	
	public Engine getEngine(){
		return engine;
	}
}

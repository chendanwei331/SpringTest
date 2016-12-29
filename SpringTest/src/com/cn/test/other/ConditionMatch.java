package com.cn.test.other;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ConditionMatch implements Condition{

	@Override
	public boolean matches(ConditionContext arg0, AnnotatedTypeMetadata arg1) {
		// TODO Auto-generated method stub
		Environment env = arg0.getEnvironment();
		return !env.containsProperty("magic");
	}

}

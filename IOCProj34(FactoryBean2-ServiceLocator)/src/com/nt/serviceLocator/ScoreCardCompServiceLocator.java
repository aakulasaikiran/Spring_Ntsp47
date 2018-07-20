package com.nt.serviceLocator;

import org.springframework.beans.factory.FactoryBean;

import com.nt.extenal.ScoreCardComp;
import com.nt.extenal.ScoreCardCompImpl;

public class ScoreCardCompServiceLocator implements FactoryBean<ScoreCardComp> {

	@Override
	public ScoreCardComp getObject() throws Exception {
		// Locate/create Extenal SErvice class obj
		ScoreCardComp  scc=new ScoreCardCompImpl();
			return  scc;
	}

	@Override
	public Class<?> getObjectType() {
		
		return  ScoreCardComp.class;
	}

	@Override
	public boolean isSingleton() {
	
		return true;
	}

}

package com.nt.webinitializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.nt.config.RootConfig;
import com.nt.config.WebMVCConfig;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
@Override
protected Class<?>[] getRootConfigClasses() {
	return new Class[]{RootConfig.class};
}
@Override
	protected Class<?>[] getServletConfigClasses() {
	  return new Class[]{WebMVCConfig.class};
	}
	@Override
		protected String[] getServletMappings() {
				return new String[]{"*.htm"};
		}
}//class

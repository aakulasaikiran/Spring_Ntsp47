package test;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

import com.nt.aspect.PerformanceMonitoringAdvice;
import com.nt.service.ArithmeticService;

public class ClientApp {

	public static void main(String[] args) {
		ProxyFactory factory=null;
		ArithmeticService proxy=null;
		DefaultPointcutAdvisor advisor=null;
		NameMatchMethodPointcut ptc=null;
	
		/* Working with static pointcut
		  //ceate ProxyFactory obj
		factory=new ProxyFactory(); 
		//set target
		factory.setTarget(new ArithmeticService());
		// prepare Advisor (poincut+advice)
		advisor=new DefaultPointcutAdvisor(new CommonStaticPointcut(),
				                                                                  new PerformanceMonitoringAdvice());
		factory.addAdvisor(advisor);
		//get Proxy obj
		proxy=(ArithmeticService)factory.getProxy();
		System.out.println("proxy obj class"+proxy.getClass());
		//call b.methods
		System.out.println("Add"+proxy.sum(10,20));
		System.out.println("-------------------------------------");
		System.out.println("Sub"+proxy.sub(10,20));
		System.out.println("-------------------------------------");
		System.out.println("Mul"+proxy.mul(10,20));
		System.out.println("-------------------------------------");
		System.out.println(Arrays.toString(proxy.getClass().getDeclaredMethods())); */
		
	/*	// Working with Dynamic pointcut
		 factory=new ProxyFactory();
		 //set target
		 factory.setTarget(new ArithmeticService());
		 //prepare Advisor Object
		 advisor=new DefaultPointcutAdvisor();
		 advisor.setPointcut(new CommonDynaPointcut());
		 advisor.setAdvice(new PerformanceMonitoringAdvice());
		 //add advisor
		 factory.addAdvisor(advisor);
		 // get Proxy object
	      proxy=(ArithmeticService)factory.getProxy();
		 // call methods
		 System.out.println("Sum="+proxy.sum(1001,2001));
		 System.out.println("--------------------------------------");
		 System.out.println("Sub="+proxy.sub(100,200));
		 System.out.println("--------------------------------------");
		 System.out.println("mul="+proxy.mul(100,200));
		 System.out.println("--------------------------------------"); */
		
		/* Working  Direct concrete pointcut classes of spring api*/
		  //ceate ProxyFactory obj
				factory=new ProxyFactory(); 
				//set target
				factory.setTarget(new ArithmeticService());
				//ceate Pointcut
				ptc=new NameMatchMethodPointcut();
				ptc.setMappedNames("sum","mul");
				//create advisor
				advisor=new DefaultPointcutAdvisor();
				advisor.setPointcut(ptc); 
				advisor.setAdvice(new PerformanceMonitoringAdvice());
				//set Advisor
			   factory.addAdvisor(advisor);
				// get Proxy obj
				 proxy=(ArithmeticService)factory.getProxy();
				 System.out.println("Sum="+proxy.sum(1001,2001));
				 System.out.println("--------------------------------------");
				 System.out.println("Sub="+proxy.sub(100,200));
				 System.out.println("--------------------------------------");
				 System.out.println("mul="+proxy.mul(100,200));
				 System.out.println("--------------------------------------");
		
	}//main
}//class

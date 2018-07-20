package test;

import org.springframework.aop.framework.ProxyFactory;

import com.nt.aspect.PerformanceMonitoringAdvice;
import com.nt.service.ArithmeticService;

public class ClientApp {

	public static void main(String[] args) {
		ProxyFactory factory=null;
		ArithmeticService proxy=null;
		//ceate ProxyFactory obj
		factory=new ProxyFactory(); 
		//set target
		factory.setTarget(new ArithmeticService());
		factory.addAdvice(new PerformanceMonitoringAdvice());
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
	}//main
}//class

package test;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.WishGenerator;
import com.nt.cfgs.BeanConfigurator;

public class BeanConfiguratorTest {

	public static void main(String[] args) {
		//create IOC container
		ApplicationContext ctx=new AnnotationConfigApplicationContext(BeanConfigurator.class);
		//get bean
		WishGenerator generator=ctx.getBean("wg",WishGenerator.class);
		System.out.println("WishgMessage::::"+generator.generateWishMsg());
		System.out.println("MY THINGS");
		System.out.println("----------------------------------------------------------");
		System.out.println("\n"+"Date:"+Calendar.DATE+"\n"+"Date:"+"Day of month:"+Calendar.DAY_OF_MONTH+"\n"+"Day of week:"+Calendar.DAY_OF_WEEK+"\n"+"Day of week in month:"+Calendar.DAY_OF_WEEK_IN_MONTH+"\n"+"Day of year:"+Calendar.DAY_OF_YEAR+"\n"+"dst_offset:"+Calendar.DST_OFFSET+"\n"+"Fieldcount:"+Calendar.FIELD_COUNT+"\n"+"Hour:"+Calendar.HOUR+"\n"+"hour_of_day:"+Calendar.HOUR_OF_DAY+"\n"+"formate:"+Calendar.LONG_FORMAT+"\n"+"Long_standalone:"+Calendar.LONG_STANDALONE+"\n"+"no.types:"+Calendar.getAvailableCalendarTypes()+""+"Location:"+Calendar.getAvailableLocales());
	}//main
}//class

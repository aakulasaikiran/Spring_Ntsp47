package test;

import java.awt.FlowLayout;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class I18nTestApp {

	public static void main(String[] args) {
		//create Locale Object
		Locale locale=new Locale(args[0],args[1]);
		Locale locale1=new Locale(args[2],args[3]);
		//create IOC container
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//Get Messages from properties file
		String label1=ctx.getMessage("str1",null,"message1",locale);
		String label2=ctx.getMessage("str2",null,"message2",locale1);
		String label3=ctx.getMessage("str3",null,"message3",locale);
		String label4=ctx.getMessage("str4",null,"message4",locale);
		// Display frame
		JFrame frame=new JFrame();
		frame.setLayout(new FlowLayout());
		JButton btn1=new  JButton(label1);
		JButton btn2=new  JButton(label2);
		JButton btn3=new  JButton(label3);
		JButton btn4=new  JButton(label4);
		frame.add(btn1); frame.add(btn2); frame.add(btn3); frame.add(btn4);
		frame.setVisible(true);
		frame.pack();
		
	   }//main		
}//class


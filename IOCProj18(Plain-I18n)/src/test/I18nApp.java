package test;

import java.awt.FlowLayout;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JFrame;

public class I18nApp {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx=new
		FileSystemXmlApplicationContext("src/com/nt/cfgsapplicationContext.xml");
		
		
		
		
		
		
		
		
		
		//prepare Local Obj
		Locale locale=new Locale(args[0],args[1]);
		//Locate Properties file based on  the Locale
		ResourceBundle bundle=ResourceBundle.getBundle("com.nt.commons.App",locale);
		
		JFrame frame=new JFrame();
		frame.setLayout(new FlowLayout());
		JButton btn1=new  JButton(bundle.getString("str1"));
		JButton btn2=new  JButton(bundle.getString("str2"));
		JButton btn3=new  JButton(bundle.getString("str3"));
		JButton btn4=new  JButton(bundle.getString("str4"));
		frame.add(btn1); frame.add(btn2); frame.add(btn3); frame.add(btn4);
		frame.setVisible(true);
		frame.pack();
	}

}

package com.javapoint;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("BeanFactory.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		
		Model model = (Model) factory.getBean("model");
		model.display();
		

	}

}

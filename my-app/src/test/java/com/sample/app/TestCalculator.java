package com.sample.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculator {
	
	@BeforeClass
	public static void init() throws IOException{
		FileInputStream fs=null;
		 try {
			
		   fs=new FileInputStream(new File(TestCalculator.class.getResource("project.properties").getFile()));
		    		//new FileInputStream(new File("src/test/resources/com/sample/app/project.properties"));
			Properties prop = new Properties();
			prop.load(fs);
			System.out.println("Test run by user:" + prop.getProperty("username"));
			System.out.println("Test description:" + prop.getProperty("description"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			fs.close();
		}
		
	}
	

	@Test
	public void testAddition(){
		
		Assert.assertEquals((new Calculator(134, 134)).add(),268,0);
	}
	
	@Test
	public void testSubtract(){
		Assert.assertEquals((new Calculator(134, 134)).subtract(),0,0);
	}
	
	@Test
	public void testMultiply(){
		Assert.assertEquals((new Calculator(134, 134)).multiply(),56540,0);
	}
	
	@Test
	public void testDivide(){
		Assert.assertEquals((new Calculator(134, 134)).divide(),1,0);
	}
}

package testngFiles;

import java.io.IOException;

import org.testng.annotations.Test;

public class Annotation5 extends TestBase{
	
	@Test
	public void abc() throws IOException
	{
		System.out.println("hello hai");
		System.out.println("hai2");
		System.out.println("hai3");
	}
	@Test
	public void abcd() throws IOException
	{
		System.out.println("hello hai1");
		System.out.println("hai22");
		System.out.println("hai33");
		System.out.println("hai44");
	}

}

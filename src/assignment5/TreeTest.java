package assignment5;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TreeTest {

	Tree tObj;
	Logger LOGGER;
	Scanner scanner;

	@Before
	public void init() {
		tObj = new Tree(8);
		LOGGER = Logger.getGlobal();
		scanner = new Scanner(System.in);
	}

	@Test
	public void wholeTreeTest() {
		String expectedOrder;
		try{
		System.out.println("Enetering integer : " + 45);
		tObj.add(Integer.valueOf(45));
		System.out.println("Enetering integer : " + 65);
		tObj.add(Integer.valueOf(65));
		System.out.println("Enetering integer : " + 88);
		tObj.add(Integer.valueOf(88));
		System.out.println("Enetering integer : " + 99);
		tObj.add(Integer.valueOf(99));
		System.out.println("Enetering integer : " + 77);
		tObj.add(Integer.valueOf(77));
		System.out.println("Enetering integer : " + 66);
		tObj.add(Integer.valueOf(66));
		System.out.println("Enetering integer : " + 44);
		tObj.add(Integer.valueOf(44));
		System.out.println("Enetering integer : " + 22);
		tObj.add(Integer.valueOf(22));
		expectedOrder="8 22 44 45 65 66 77 88 99 ";
		Assert.assertEquals("Test Failed Unexpected Output test 1",expectedOrder,tObj.inOrder());
		System.out.println("Test 1 Passed");

		}
		catch (InputMismatchException inputMismatchException) {
			System.err.println("Test 1 Failed");
			inputMismatchException.printStackTrace();
			
		}
		catch(Exception unknownException)
		{
			System.err.println("Test 1 Failed");
			unknownException.printStackTrace();
		}
		
	}
	
	
	
	@Test
	public void wholeTreeTestTwo() {
		String expectedOrder;
		try{
		System.out.println("Enetering integer : " + 40);
		tObj.add(Integer.valueOf(40));
		System.out.println("Enetering integer : " + 50);
		tObj.add(Integer.valueOf(50));
		System.out.println("Enetering integer : " + 60);
		tObj.add(Integer.valueOf(60));
		System.out.println("Enetering integer : " + 9);
		tObj.add(Integer.valueOf(9));
		expectedOrder="8 9 40 50 60 ";
		Assert.assertEquals("Test Failed Unexpected Output test 2",expectedOrder,tObj.inOrder());
		System.out.println("Test 2 Passed");

		}
		catch (InputMismatchException inputMismatchException) {
			System.err.println("Test 2 Failed");
			inputMismatchException.printStackTrace();
			
		}
		catch(Exception unknownException)
		{
			System.err.println("Test 2 Failed");
			unknownException.printStackTrace();
		}
		
	}
	
	
	
	
	

}

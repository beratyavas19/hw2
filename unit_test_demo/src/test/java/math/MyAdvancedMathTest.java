package demo.junit_class_demo.math;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


import demo.junit_class_demo.math.MyAdvancedMath;
import demo.junit_class_demo.math.MyMath;

import static org.mockito.Mockito.*;

/**
 * An class that provides test cases for the 
 * "advanced" math operations of the MyAdvancedMath 
 * class, for demonstrating Unit Testing.
 */
public class MyAdvancedMathTest {
	/* 
	 * A reference to the MyAdvancedMath class
	 * whose methods we are testing in this class
	 */
	MyAdvancedMath mam ;

	/*
	 * This is a constructor which is called 
	 * when the MyAdvancedMathTest
	 */
	public MyAdvancedMathTest() {
	MyAdvancedMath a1=new MyAdvancedMath();
	Assert.assertNotNull(a1);
	}
	
	/*
	 * A test case that examines the add method
	 * with normal input values. 
	 */
	@Test
	public void test_add_normal() {
		mam=new MyAdvancedMath();
		Assert.assertEquals(8,mam.add(3,5));
	}
	@Test(expected = IllegalArgumentException.class)
	public void test_add_justpositif() {
		mam=new MyAdvancedMath();
		mam.add(-3,4);
		Assert.assertEquals(0,0);
		//ExceptionMesaj Kontrolu
	}
	@Test(expected = IllegalArgumentException.class)
	public void test_add_overflow() {
		mam=new MyAdvancedMath();
		mam.add(2147483647,4);
		Assert.assertEquals(5,5);
		//ExceptionMesajKontrolu

	}


	/*
	 * A test case that examines the add method
	 * with zeros input values. 
	 */
	@Test
	public void testAdd_shouldReturnZero() {
		mam=new MyAdvancedMath();
		int a=mam.add(0,0);
		Assert.assertEquals(0,a);

	}
	
	/*
	 * A test case for the exceptions caused when
	 * the result of the addition doesn't fit 
	 * in an Integer variable.
	 */
	//@Test (expected = IllegalArgumentException.class)
	//public void testAdd_shouldThrowException_overflow() {
	//
	//}
	
	/*
	 * A test case for the exceptions caused when
	 * one or more input values are negative. Testing
	 * the exception is performed with a @Rule
	 */
	//@Rule 
	//public ExpectedException thrown = ExpectedException.none(); //initialize it to .none()
	//@Test 
	//public void testAdd_shouldThrowException_negativeInput() {
	//
	//	
	//}
		
	/*
	 *  The following method aims to test the reverseArray 
	 *  of the MyAdvancedMath class. However, its execution 
	 *  depends on the MyMath's reverseNumber method and a fail 
	 *  in this method can cause this test to fail too. Thus, the 
	 *  test is not isolated and cannot be called a valid Unit Test.
	 *  The test_reverseArray_Mocking() is the atomic and 
	 *  isolated unit test for the reverseArray method.
	 */
	@Test
	public void test_reverseArray() {
		mam=new MyAdvancedMath();
		MyMath a1=new MyMath();
		int[] yeni={6,5};
		int[] beklenen={-6,-5};
		int[] donen=mam.reverseArray(yeni,a1);
		Assert.assertArrayEquals(beklenen,donen);


	}
	
	/*
	 * The following test aims to fix the problem described in 
	 * the previous test_reverseArray test case. In order to 
	 * isolate the external (to this class) dependencies (MyMath)
	 * we have to mock them and predefine the results of
	 * all calls that we plan to execute on the MyMaths' methods.
	 */
	@Test
	public void test_reverseArray_Mocking() {


	}
}

package com.niit.basic.Basic;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Rigorous Test :-)
     */
	
	
	public AppTest(String testname){
		super(testname);
	}
	public static Test suite(){
		return (Test) new TestSuite(AppTest.class);
	}
    public void testApp(){
    	assertTrue(true);
    }
}

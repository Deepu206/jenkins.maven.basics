package com.jenkins.basics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest
{
     /**
     * Rigourous Test :-)
     */
	@Test
    public void addTestApp()
    {
		App app=new App();
		assertEquals(5, app.add(2, 3));
       
    }
	
	@Test
    public void SubTestApp()
    {
		App app=new App();
		assertEquals(1,app.sub(5, 4));
         }
}

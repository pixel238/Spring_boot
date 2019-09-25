package com.tavisca;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tavisca.controller.HomeController;

public class AppTest 
{
	@Test
    public void testApp()
    {
		HomeController hc = new HomeController();
		String result = hc.home();
		assertEquals(result, "Dos Boot, reporting for duty");
    }
}

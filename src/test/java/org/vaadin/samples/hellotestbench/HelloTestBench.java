package org.vaadin.samples.hellotestbench;

import com.vaadin.testbench.TestBenchTestCase;
import com.vaadin.testbench.elements.ButtonElement;
import com.vaadin.testbench.elements.LabelElement;
import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;


import static org.junit.Assert.assertEquals;

/**
 * This class contains JUnit tests, which are run using Vaadin TestBench 4.
 * 
 * To run this, first get an evaluation license from
 * https://vaadin.com/addon/vaadin-testbench and follow the instructions at
 * https://vaadin.com/directory/help/installing-cval-license to install it.
 *
 * Once the license is installed, you can run this class as a JUnit test.
 */
public class HelloTestBench extends TestBenchTestCase {

    @Before
    public void setUp() throws Exception {
        setDriver(new FirefoxDriver());
    }

    @After
    public void tearDown() throws Exception {
        getDriver().quit();
    }

    /**
     * Opens the URL where the application is deployed.
     */
    private void openTestUrl() {
        getDriver().get("http://localhost:8080/");
    }

    @Test
    public void testClickButton() throws Exception {
    	  openTestUrl();
    		
        // Click the button
        ButtonElement clickMeButton = $(ButtonElement.class).
        		caption("Click Me").first();
        clickMeButton.click();

        // There should now be one label
        assertEquals(1, $(LabelElement.class).all().size());
        // ... with the specified text
        assertEquals("Thank you for clicking", 
        		$(LabelElement.class).first().getText());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package poepartone;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Student
 */
public class registrationNGTest {
    
    public registrationNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of checkUserName method, of class registration.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "@qw";
        registration instance = new registration();
        boolean expResult = true;
        boolean result = instance.checkUserName(username);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of checkPasswordComplexity method, of class registration.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "";
        registration instance = new registration();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of checkCellPhoneNumber method, of class registration.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        String cllphone = "+27772505396";
        registration instance = new registration();
        boolean expResult = true;
        boolean result = instance.checkCellPhoneNumber(cllphone);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of regiterUser method, of class registration.
     */
    @Test
    public void testRegiterUser() {
        System.out.println("regiterUser");
        String userName = "@tb";
        String password = "NCEBO@g";
        String cellphone = "+27662505396";
        registration instance = new registration();
        String expResult = "Registration was successful";
        String result = instance.registerUserName(userName, password, cellphone);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of registrationStatus method, of class registration.
     */
    @Test
    public void testRegistrationStatus() {
        System.out.println("registrationStatus");
        String userName = "";
        registration instance = new registration();
        boolean expResult = false;
        boolean result = instance.registrationStatus(userName);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}

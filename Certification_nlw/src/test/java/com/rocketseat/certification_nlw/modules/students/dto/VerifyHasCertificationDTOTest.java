/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

package com.rocketseat.certification_nlw.modules.students.dto;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
 
/**
 *
 * @author bruno
 */
public class VerifyHasCertificationDTOTest {

     public VerifyHasCertificationDTOTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getEmail method, of class VerifyHasCertificationDTO.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        VerifyHasCertificationDTO instance = new VerifyHasCertificationDTO();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTechnology method, of class VerifyHasCertificationDTO.
     */
    @Test
    public void testGetTechnology() {
        System.out.println("getTechnology");
        VerifyHasCertificationDTO instance = new VerifyHasCertificationDTO();
        String expResult = "";
        String result = instance.getTechnology();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class VerifyHasCertificationDTO.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        VerifyHasCertificationDTO instance = new VerifyHasCertificationDTO();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTechnology method, of class VerifyHasCertificationDTO.
     */
    @Test
    public void testSetTechnology() {
        System.out.println("setTechnology");
        String technology = "";
        VerifyHasCertificationDTO instance = new VerifyHasCertificationDTO();
        instance.setTechnology(technology);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class VerifyHasCertificationDTO.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        VerifyHasCertificationDTO instance = new VerifyHasCertificationDTO();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canEqual method, of class VerifyHasCertificationDTO.
     */
    @Test
    public void testCanEqual() {
        System.out.println("canEqual");
        Object other = null;
        VerifyHasCertificationDTO instance = new VerifyHasCertificationDTO();
        boolean expResult = false;
        boolean result = instance.canEqual(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class VerifyHasCertificationDTO.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        VerifyHasCertificationDTO instance = new VerifyHasCertificationDTO();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class VerifyHasCertificationDTO.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        VerifyHasCertificationDTO instance = new VerifyHasCertificationDTO();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
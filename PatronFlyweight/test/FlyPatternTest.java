/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author enrique
 */
public class FlyPatternTest {
    
    public FlyPatternTest() {
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
     * Test of add method, of class FlyPattern.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String clave = "";
        String nombre = "";
        FlyPattern instance = new FlyPattern();
        instance.add(clave, nombre);
        fail("The test case is a prototype.");
    }

    @Test
    public void testShow() {
        System.out.println("show test");
        String tipo = "";
        FlyPattern instance = new FlyPattern();
        instance.show(tipo);
        fail("The test case is a prototype.");
    }
    
}

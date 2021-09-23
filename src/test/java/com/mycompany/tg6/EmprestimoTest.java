/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.tg6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author grupo Ranger Verde
 */
public class EmprestimoTest {
    
    Emprestimo instance = new Emprestimo();
    
    public EmprestimoTest() {
    }

    @Test
    public void testSaldoValido() {
        assertEquals(true, instance.LiberaSaldo(1200, false, false));
    }
    
    public void testBomPagador() {
        assertEquals(true, instance.LiberaSaldo(800, true, false));
    }
    
    public void testEspecial() {
        assertEquals(true, instance.LiberaSaldo(800, false, true));
    }
    
    public void testEmprestimoInvalido() {
        assertEquals(true, instance.LiberaSaldo(800, false, false));
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maria
 */
public class CalculadoraCompraTest {
    
    
    @Test
    public void testarCompraDeCincoProduto() {
        CalculadoraCompra calc = new CalculadoraCompra();

        double resultado = calc.calcularTotal(8.0, 5);

        assertEquals(40.0, resultado, 0.001);
    }

    @Test
    public void testarCompraDeVariosProdutos() {
        CalculadoraCompra calc = new CalculadoraCompra();

        double resultado = calc.calcularTotal(2.50, 10);

        assertEquals(25.0, resultado, 0.001);
    }

    
}

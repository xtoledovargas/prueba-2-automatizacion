package com.evaluacion;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraSteps {

    private Calculadora calculadora;
    private int resultado;

    @Dado("que tengo una calculadora abierta")
    public void que_tengo_una_calculadora_abierta() {
        calculadora = new Calculadora();
    }

    @Cuando("sumo los números {int} y {int}")
    public void sumo_los_numeros_y(Integer num1, Integer num2) {
        resultado = calculadora.sumar(num1, num2);
    }

    @Cuando("multiplico el número {int} y el número {int}")
    public void multiplico_el_numero_y_el_numero(Integer num1, Integer num2) {
        resultado = calculadora.multiplicar(num1, num2);
    }

    @Entonces("el resultado de la operación debe ser {int}")
    public void el_resultado_de_la_operacion_debe_ser(Integer resultadoEsperado) {
        assertEquals(resultadoEsperado, resultado);
    }

    @Entonces("el resultado obtenido debe ser {int}")
    public void el_resultado_obtenido_debe_ser(Integer resultadoEsperado) {
        assertEquals(resultadoEsperado, resultado);
    }
}
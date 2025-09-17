package cl.iplacex.ExamenAutomatizacion.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraServiceTest {
    private final CalculadoraService service = new CalculadoraService();
    @Test
    @DisplayName("Suma de dos números positivos debe ser correcta")
    void sumar_dosNumerosPositivos_debeRetornarSumaCorrecta() {
        // Se valida que la suma de 2 y 3 retorne 5
        assertThat(service.sum(2, 3)).isEqualTo(5);
    }

    @Test
    @DisplayName("Suma de un número positivo y uno negativo debe ser correcta")
    void sumar_positivoYNegativo_debeRetornarSumaCorrecta() {
        // Se valida la suma de 10 y -5
        assertThat(service.sum(10, -5)).isEqualTo(5);
    }

    @Test
    @DisplayName("Suma con cero debe retornar el mismo número")
    void sumar_conCero_debeRetornarElMismoNumero() {
        // Se valida que sumar 7 con 0 retorne 7
        assertThat(service.sum(7, 0)).isEqualTo(7);
    }

}
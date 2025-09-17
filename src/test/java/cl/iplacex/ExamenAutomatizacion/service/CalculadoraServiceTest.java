package cl.iplacex.ExamenAutomatizacion.service;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraServiceTest {
    private final CalculadoraService service = new CalculadoraService();

    @Test
    void sum_twoPositiveNumbers_shouldReturnCorrectSum() {
        assertThat(service.sum(2,3)).isEqualTo(5);
    }

}
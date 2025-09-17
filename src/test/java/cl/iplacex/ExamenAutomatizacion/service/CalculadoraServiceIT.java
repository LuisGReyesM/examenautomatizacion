package cl.iplacex.ExamenAutomatizacion.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraServiceIT {
    private final CalculadoraService servicioCalculadora = new CalculadoraService();
    private final ServiceData serviceData = new ServiceData();

    @Test
    @DisplayName("Prueba la suma de un valor del servicio externo con otro número")
    void sumar_conValorDeServicioExterno_debeIntegrarCorrectamente() {
        // Obtiene un valor del servicio "externo"
        int valorExterno = serviceData.obtenerValor(); // Esto retornará 10
        int numeroAdicional = 5;

        // Prueba la interacción entre los dos servicios
        int resultado = servicioCalculadora.sum(valorExterno, numeroAdicional);

        // Valida que el resultado de la integración sea el esperado
        assertThat(resultado).isEqualTo(15);
    }

}
package org.example.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CadastroReservaTest {

    @Test
    public void deveRetornarNumeroQuarto() {
        CadastroReserva.getInstance().setNumeroQuarto(535);
        assertEquals(535, CadastroReserva.getInstance().getNumeroQuarto());
    }

    @Test
    public void deveRetornarAndarQuarto() {
        CadastroReserva.getInstance().setAndar(5);
        assertEquals(5, CadastroReserva.getInstance().getAndar());
    }

    @Test
    public void deveRetornarCliente() {
        CadastroReserva.getInstance().setCliente("Renzo");
        assertEquals("Renzo", CadastroReserva.getInstance().getCliente());
    }
}
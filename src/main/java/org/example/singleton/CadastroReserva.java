package org.example.singleton;

public class CadastroReserva {
    private CadastroReserva(){

    }
    private static CadastroReserva instance = new CadastroReserva();

    public static CadastroReserva getInstance() {
        return instance;
    }

    private Integer numeroQuarto;
    private Integer andar;
    private String cliente;

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public Integer getAndar() {
        return andar;
    }

    public void setAndar(Integer andar) {
        this.andar = andar;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}

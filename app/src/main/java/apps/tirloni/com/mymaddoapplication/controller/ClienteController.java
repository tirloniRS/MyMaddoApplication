package apps.tirloni.com.mymaddoapplication.controller;

import apps.tirloni.com.mymaddoapplication.model.Cliente;

/**
 * Created by alexsandro-rs on 16/04/2017.
 */

public class ClienteController {
    //conectar a controller com a classe Cliente
    private Cliente cliente;

    public ClienteController() {
        this.cliente = new Cliente();
    }

    public void salvarCliente(Cliente objCliente){
        this.cliente = objCliente;
    }
    public void limparCliente(){

        this.cliente.setNome("");
        this.cliente.setCidade("");
        this.cliente.setUf("");
        this.cliente.setProfissao("");
        this.cliente.setEmpresa("");
        this.cliente.setTelefone("");
        this.cliente.setEmail("");
    }

}
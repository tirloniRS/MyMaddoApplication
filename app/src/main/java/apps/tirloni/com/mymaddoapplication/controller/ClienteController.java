package apps.tirloni.com.mymaddoapplication.controller;

import apps.tirloni.com.mymaddoapplication.model.Cliente;

/**
 * Created by alexsandro-rs on 16/04/2017.
 */

public class ClienteController {
    //conectar a controller com a classe Cliente
    private Cliente cliente;

    public ClienteController() {
        //Criar uma instância da classe cliente
        this.cliente = new Cliente();
    }

    //Assinar o método salvarCliente p/ receber um obj Cliente
    public void salvarCliente(Cliente objCliente){
        //Popular o obj cliente da controller com os dados do formulário
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

    //Refatorar o método toString p devolver
    //informações do obj cliente da controller


    @Override
    public String toString() {
        String dadosDigitados = "";

        dadosDigitados += "Nome: "+this.cliente.getNome()+"\n";
        dadosDigitados += "Cidade: "+this.cliente.getCidade()+"\n";
        dadosDigitados += "Uf: "+this.cliente.getUf()+"\n";
        dadosDigitados += "Profissao: "+this.cliente.getProfissao()+"\n";
        dadosDigitados += "Empresa: "+this.cliente.getEmpresa()+"\n";
        dadosDigitados += "Telefone: "+this.cliente.getTelefone()+"\n";
        dadosDigitados += "Email: "+this.cliente.getEmail()+"\n";

        return dadosDigitados;
    }
}
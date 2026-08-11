package br.edu.ufape.poo.UfapeMarket.negocio.excecoes;

public class VendaDataObrigatoriaException extends Exception {

    public VendaDataObrigatoriaException() {
        super("A data da venda é obrigatória!");
    }
}
package GerenciadorCarreiras.model;

import java.util.ArrayList;

public class Clube {
    private String nome;
    private double orcamento;
    private ArrayList<Jogador> elenco;

    public Clube(String nome, double orcamento) {
        this.nome = nome;
        this.orcamento = orcamento;
        this.elenco = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public double getOrcamento() {
        return orcamento;
    }
    public ArrayList<Jogador> getElenco() {
        return elenco;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public void exibirClube() {
        System.out.println("Nome do Clube: " + nome);
        System.out.println("Orçamento: " + orcamento);
        System.out.println("Elenco " + elenco);
    }
}

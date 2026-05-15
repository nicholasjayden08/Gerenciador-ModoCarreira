package GerenciadorCarreiras.service;

import GerenciadorCarreiras.model.Clube;
import GerenciadorCarreiras.model.Jogador;

public class GerenciadorCarreira {
    private Clube clube;

    public void criarClube(String nome, double orcamento) {
        this.clube = new Clube(nome, orcamento);
        System.out.println("Clube adicionado com sucesso");
    }

    public Clube getClube() {
        return clube;
    }

    public boolean clubeExiste() {
        return clube != null;
    }

    public boolean contratarJogador(Jogador jogador) {
        if (!clubeExiste()) {
            System.out.println("Adicione um clube primeiro!");
            return false;
        }

        if (clube.getElenco().contains(jogador)) {
            System.out.println("Jogador já está listado no seu elenco!!");
            return false;
        }
        if (clube.getOrcamento() < jogador.getValor()) {
            System.out.println("Saldo insuficiente para compra do jogador!!");
        }

        clube.getElenco().add(jogador);
        clube.setOrcamento(clube.getOrcamento() - jogador.getValor());
        return true;
    }

    public boolean venderJogador(String nomeJogador) {
        if (!clubeExiste()) {
            System.out.println("Adicione um clube primeiro!");
            return false;
        }

        Jogador jogadorEncontrado = null;

        for (Jogador jogador : clube.getElenco()) {
            if (jogador.getNome().equalsIgnoreCase(nomeJogador)) {
                jogadorEncontrado = jogador;
                break;
            }
        }
        if (jogadorEncontrado == null) {
            System.out.println("Jogador não encontrado no elenco!");
            return false;
        }

        clube.getElenco().remove(jogadorEncontrado);
        clube.setOrcamento(clube.getOrcamento() + jogadorEncontrado.getValor());

        System.out.println("Jogador Vendido: " + jogadorEncontrado.getNome());
        return true;
    }

    public void listarElenco() {
        if (!clubeExiste()) {
            System.out.println("Adicione um clube primeiro!");
            return;
        }

        if (clube.getElenco().isEmpty()) {
            System.out.println("Elenco vazio.");
            return;
        }

        System.out.println("===== ELENCO DO " + clube.getNome() + " =====");
        for (Jogador jogador : clube.getElenco()) {
            jogador.exibirJogador();
            System.out.println("========================");
        }
        System.out.println("Orçamento atual: " + clube.getOrcamento());
    }
}

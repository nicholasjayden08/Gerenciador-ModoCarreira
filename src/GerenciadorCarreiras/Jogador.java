package GerenciadorCarreiras;

public class Jogador {
    private String nome;
    private int idade;
    private String posicao;
    private int overall;
    private double valor;

    public Jogador(String nome, int idade, String posicao, int overall, double valor) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.overall = overall;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getPosicao() {
        return posicao;
    }
    public int getOverall() {
        return overall;
    }
    public double getValor() {
        return valor;
    }

    public void exibirJogador() {
        System.out.println("Nome do Jogador: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Posição: " + posicao);
        System.out.println("Overall: " + overall);
        System.out.println("Valor: " + valor);
    }
}

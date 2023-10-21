package Aula03;

import java.util.Random;

class BatalhaPokemon { // Classe Batalha
    private Pokemon jogador1;
    private Pokemon jogador2;
    private boolean acabou;
    private boolean vencedorJogador1;

    BatalhaPokemon(Pokemon jogador1, Pokemon jogador2) { // Construtor batalha
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.acabou = false;
        this.vencedorJogador1 = false;
    }

    //Metodo
    void iniciarBatalha() { //Método batalha
        System.out.println("A batalha começou!");
        System.out.println("Jogador 1 escolheu o Pokémon " + jogador1.getNome() + ".");
        System.out.println("Jogador 2 escolheu o Pokémon " + jogador2.getNome() + ".");

        while (!acabou) {
            jogador1.atacar(jogador2);
            if (jogador2.getVida() == 0) {
                acabou = true;
                vencedorJogador1 = true;
                System.out.println("Jogador 1 venceu!");
                break;
            }

            jogador2.atacar(jogador1);
            if (jogador1.getVida() == 0) {
                acabou = true;
                System.out.println("Jogador 2 venceu!");
                break;
            }
        }
    }

    boolean isVencedorJogador1() {
        return vencedorJogador1;
    }
}

class Pokemon { // Classe Pokemon

    private String nome;
    private int vida;
    private int forca;

    Pokemon(String nome, int vida, int forca) { // Construtor Pokemon
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    void atacar(Pokemon outroPokemon) { // Método Pokemon
        Random random = new Random();
        int dano = random.nextInt(forca) + 1;
        System.out.println(nome + " atacou " + outroPokemon.getNome() + " causando " + dano + " de dano.");
        outroPokemon.receberDano(dano);
    }

    void receberDano(int dano) { // Método Pokemon
       vida = Math.max(0, vida - dano); 
        System.out.println(nome + " recebeu " + dano + " de dano. Vida restante: " + vida);
    }

   String getNome() {
        return nome;
    }

   void setNome(String nome) {
        this.nome = nome;
    }

   int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    
}

public class Batalha{
    public static void main(String[] args) {
        
        Pokemon pokemon1 = new Pokemon("Pikachu", 100, 10);
        Pokemon pokemon2 = new Pokemon("Charmander", 100, 8);
        
        BatalhaPokemon batalha = new BatalhaPokemon(pokemon1, pokemon2);
        batalha.iniciarBatalha();
        
        if (batalha.isVencedorJogador1()) {
            System.out.println("Jogador 1 venceu a batalha!");
        } else {
            System.out.println("Jogador 2 venceu a batalha!");
        }
    }
}

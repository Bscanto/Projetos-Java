
package Aula06_Trabalho;

/**
Implemente as Meninas Superpoderosas
Descrição:
Implemente as seguintes classes

MeninasSuperpoderosas - possue nome, cor, idade e ação para atacar e gritar
SuperVilóes - possue nome, superpoder, e ação para atacar e dominar o mundo
Crie uma superclasse de acordo para esse problema.
 */

abstract class Personagem {
    String nome;
    String acaoAtacar;
    
    public Personagem(String nome, String acaoAtacar) {
        this.nome = nome;
        this.acaoAtacar = acaoAtacar;
    }
    
    public void atacar() {
        System.out.println(this.nome + " ataca com " + this.acaoAtacar);
    }
}

class MeninasSuperpoderosas extends Personagem {
    String cor;
    int idade;
    String acaoGritar;
    
    public MeninasSuperpoderosas(String nome, String cor, int idade, String acaoAtacar, String acaoGritar) {
        super(nome, acaoAtacar);
        this.cor = cor;
        this.idade = idade;
        this.acaoGritar = acaoGritar;
    }
    
    public void gritar() {
        System.out.println(this.nome + " grita " + this.acaoGritar);
    }
}

// Classe que representa os Super Vilões
class SuperViloes extends Personagem {
    String superpoder;
    String acaoDominar;
    
    public SuperViloes(String nome, String superpoder, String acaoAtacar, String acaoDominar) {
        super(nome, acaoAtacar);
        this.superpoder = superpoder;
        this.acaoDominar = acaoDominar;
    }
    
    public void dominarMundo() {
        System.out.println(this.nome + " tenta dominar o mundo com " + this.acaoDominar);
    }
}
public class Meninas_Superpoderosas {
        public static void main(String[] args) {
            System.out.println("=========Menina super poderosa==========");
        MeninasSuperpoderosas meninas = new MeninasSuperpoderosas("Lindinha", "rosa", 5, "laser dos olhos", "doce");
        meninas.gritar(); 
        meninas.atacar(); 
        System.out.println("");
        
        System.out.println("=========Macaco loco==========");
        SuperViloes vilao = new SuperViloes("Macaco Louco", "inteligência", "raio congelante", "um exército de robôs");
        vilao.dominarMundo(); 
        vilao.atacar(); 
        System.out.println("");
        
        System.out.println("=========Menina super poderosa==========");
        MeninasSuperpoderosas meninas2 = new MeninasSuperpoderosas("Florzinha", "vermelho", 6, "sopro congelante", "menininha");
        meninas2.gritar(); 
        meninas2.atacar(); 
        System.out.println("");
        
        
        System.out.println("=========Macaco loco==========");
        SuperViloes vilao2 = new SuperViloes("Doutor Inferno", "fogo", "raios laser", "um vírus mortal");
        vilao2.dominarMundo(); 
        vilao2.atacar(); 
    }
}
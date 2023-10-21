package Aula06_Trabalho;
/*
Classe Super-heroi
Implemente a super-classe SuperHeroi, e as subclasse HeroiMarvel e HeroiDC. 
Todo SuperHeroi tem um nome e um poder. Todo HeroiDC protege uma cidade e todo 
o HeroiMarvel possui um jargão (tipo o Homem-aranha: "com grandes poderes vem grandes responsabilidades").
Todas essas classe implementam o método apresentar():

A classe SuperHeroi se apresenta falando o nome e seu superpoder
O HeroiDC fala seu nome, superpoder e a cidade que protege
O HeroiMarvel fala seu nome, superpoder e jargão
Implemente uma classe Mutante, que herda de HeroiMarvel.
Ao se apresentar, todo Mutante deve falar "Eu sou dos x-men".
*/
class SuperHeroi{
    String nome;
    String poder;
    
 SuperHeroi(String nome, String poder){
     this.nome = nome;
     this.poder = poder;
 }
 
 void apresentar(){
     System.out.println("Eu sou " + nome + " e tenho o poder de " + poder);
 }  
}

 class HeroiDC  extends SuperHeroi {
    String cidade;
    
    public HeroiDC(String nome, String poder, String cidade){
        super(nome, poder);
        this.cidade = cidade;
    }
    void apresentar(){
        super.apresentar();
        System.out.println("Eu protejo a cidade de: " + cidade);
    }
    void usarCintoDeUtilidades(){
        System.out.println("Usando cinto de utilidades!");
    }
   
}
class HeroiMarvel extends SuperHeroi {
    String jargao;
    
    
    HeroiMarvel(String nome, String poder, String jargao){
        super(nome, poder);
        this.jargao = jargao;
   }
    
    void apresentar(){
        super.apresentar();
        System.out.println("Meu jargao e: " + jargao);
    }
     void atirarTeias(){
        System.out.println("Atirando teias!");
    }
}

class mutante extends HeroiMarvel {
    
    mutante(String nome, String poder, String jargao){
        super(nome, poder, jargao);
    }
    
    void apresentar(){
        super.apresentar();
        System.out.println("EU sou dos X-Men\n");
    }
    void usarGarras(){
        System.out.println("Usando garras!");
    }
}



public class Classe_SuperHeroi {
    public static void main(String[] args) {
       System.out.println("=============SUPER HEROI============");
        SuperHeroi superHomem = new SuperHeroi("Super-Man","SuperForca\n");
        superHomem.apresentar();
        SuperHeroi flash = new SuperHeroi("Flash", "SuperVelocidade");
        flash.apresentar();
        System.out.println("");
        
        System.out.println("=============HEROI DC==============");
        HeroiDC Btm = new HeroiDC("Batman", "Inteligencia", "Gotham City\n");
        Btm.apresentar();
        HeroiDC mulherMaravilha = new HeroiDC("Mulher-Maravilha", "SuperForca", "Themyscira");
        mulherMaravilha.apresentar();
        System.out.println("");
        
        System.out.println("==============HEROI MARVEL===============");
        HeroiMarvel HomemAranha = new HeroiMarvel("Homem-Aranha", "Teia", "Com grandes poderes vem grande responsabilidades\n");
        HomemAranha.apresentar();
        HeroiMarvel CapitaoAmerica = new HeroiMarvel("Capitao America", "SuperForca", "Vingadores, reunir!");
        CapitaoAmerica.apresentar();
        System.out.println("");
        
        System.out.println("==============MUTANTE================");
        mutante Wolverine = new mutante("Wolverine", "Regeneração", "Eu sou o melhor no que faco");
        Wolverine.apresentar();
        mutante Ciclope = new mutante("Ciclope", "Raios Opticos", "Lider dos X-Men");
        Ciclope.apresentar();
        System.out.println("");
        
    }
}
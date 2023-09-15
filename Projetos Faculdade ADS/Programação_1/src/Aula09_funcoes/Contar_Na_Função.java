package Aula09_funcoes;

public class Contar_Na_Função {
    static void contar(int min, int max,int passo){
        System.out.println("FUNÇÃO COM 3 PARAMETROS");
        for (int i=min;i<=max; i+=passo)
            System.out.println(i);   
    }
    static void contar(int min, int max){
        System.out.println("FUNÇÃO COM 2 PARAMETROS");
        contar(min, max, 1);
    }
    static void contar(int max){
        System.out.println("FUNÇÃO 1 PARAMETRO");
        contar(0, max, 1);
    }
    
    static int pg(int a1, int razao, int num_e){
        int an = a1;
        int somatorio=a1;
        System.out.println("PG:");
        System.out.println(an);
        for (int i=0; i<num_e; i++){
            an = an * razao;
            System.out.println(an);
            somatorio = somatorio + an;
        }
        return somatorio;
    }
    public static void main(String[] args) {
        //System.out.println("SOMATORIO =" + pg(2, 3, 10));
        contar(2,10,3);
        
    }
    
}

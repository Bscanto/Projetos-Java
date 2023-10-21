package Aula07_trabalho;

/**
  Implemente um sistema de gerenciamento de uma superfarmácia. Este sistema
  deve implementar vários funcionarios, que estarão vendendo produtos de
  diferentes modalidades. O salário do vendedor depende de quais produtos foram
  vendidos (neste caso, o vendedor ganha 10% do *lucro_total* de suas vendas).
  O lucro líquido da farmácia é calculado pelo *lucro_total -
  comissao_vendedores * O lucro de cada produto depende de seu tipo, e é
  calculado a partir do *valor* e *custo* de cada produto. A seguir, citamos os
  tipos de produtos, suas informações, e a maneira de calcular seu lucro.
 
 
 
 Eletrônico: possui informações de [nome, código de prod, garantia, custo,
 valor] que são diferentes para cada eletrônico. O valor para emitir uma nota
  fiscal de um eletrônico é de 7 centavos (lembre-se de descontar este valor no
  cálculo do lucro). Todo eletrônico paga uma taxa de 18% sobre o *valor* do
  produto.
 
  Alimentício: possui informações de [nome, código de prod, validade, custo,
  valor] que são diferentes para cada alimento. O valor para emitir uma nota
  fiscal de um alimento é de 5 centavos. Todo alimento paga uma taxa de 12%
  sobre o *valor* do produto. Inclua no seu cálculo que 5% dos produtos
  alimentícios são descartados devido a validade, ou seja, não geram lucro
  (também não pagam taxa nem nota fiscal).
 
  Fármaco: possui informações de [nome, código de prod, validade,
  necessidade_receita, custo, valor] que são diferentes para cada fármaco. O
  valor para emitir uma nota fiscal de um fármaco é de 3 centavos. Fármacos
  podem ser taxados em 0%, 4%, 8% ou 10%. No cálculo de lucro, inclua no
  cálculo que 2% dos fármacos são descartados (sem lucro), 8% são taxados em
  0%, 20% são taxados em 4%, 30% são taxados em 8% e 40% são taxados em 10%.
 
  No fim do dia, a loja quer saber uma estimativa do lucro bruto e líquido. Mas
  para tal, deve calcular o lucro de todos os produtos vendidos por cada
  vendedor, descontar a comissão de cada vendedor, e considerar as % dos
  produtos que passam de validade (embutido no cálculo do lucro de cada
  produto).
 */
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

class Produtos {

    String nome;
    int codigo;
    double custo;
    double valor;

    Produtos(String nome, int codigo, double custo, double valor) {
        this.nome = nome;
        this.codigo = codigo;
        this.custo = custo;
        this.valor = valor;
    }

    double Calcular_Lucro() {
        return valor - custo;
    }
}

class Eletronico extends Produtos {
    int garantia;

    Eletronico(String nome, int codigo, int garantia, double custo, double valor) {
        super(nome, codigo, custo, valor);
        this.garantia = garantia;
    }

    @Override
    double Calcular_Lucro() {
        double lucro = (super.Calcular_Lucro() * 0.82); // 18% de taxa
        lucro -= 0.07; // nota fiscal
        return lucro;
    }
}

class Alimenticio extends Produtos {
    Date validade;

    Alimenticio(String nome, int codigo, Date validade, double custo, double valor) {
        super(nome, codigo, custo, valor);
        this.validade = validade;
    }

    double Calcular_Lucro() {
        double lucro = (valor * 0.88); // 12% de taxa
        lucro -= 0.05 * valor; // descarte por validade
        lucro -= 0.05; // nota fiscal
        return lucro;
    }
}

class Farmaco extends Produtos {
    Date validade;
    private boolean necessitaReceita;

    Farmaco(String nome, int codigo, Date validade, boolean necessitaReceita, double custo, double valor) {
        super(nome, codigo, custo, valor);
        this.validade = validade;
        this.necessitaReceita = necessitaReceita;
    }

    double Calcular_Lucro() {
        Date hoje = new Date();
        if(validade.before(hoje)){
            return  0;
        }
        double taxa;
        double pctDescartados = 0.02;
        double pctIsentos = 0.08;
        double pct4 = 0.2;
        double pct8 = 0.3;
        double pct10 = 0.4;
    if (necessitaReceita) {
      taxa = 0;
      pctDescartados += 0.05;
    } else {
      Random random = new Random();
      double r = random.nextDouble();
      if (r < pctIsentos) {
        taxa = 0;
      } else if (r < pctIsentos + pct4) {
        taxa = 0.04;
      } else if (r < pctIsentos + pct4 + pct8) {
        taxa = 0.08;
      } else {
        taxa = 0.1;
      }
    }
    double lucro = (valor - custo) * (1 - taxa) * (1 - pctDescartados) - 0.03;
    return lucro;
    }
}

class Funcionario {
    String nome;
    double salario;
    List<Produtos> vendas;

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        vendas = new ArrayList<Produtos>();
    }
    
    double calcularComissao() {
        double lucroTotal = 0.0;
        double lucroTotalBruto = 0.0;
        for (int i = 0; i < vendas.size(); i++) {
            Produtos venda = vendas.get(i);
            lucroTotal += venda.Calcular_Lucro();
            lucroTotalBruto += venda.valor - venda.custo;
        }
        double porcentagemDescarte = 0.0;
        Date hoje = new Date();
        for (int i = 0; i < vendas.size(); i++) {
            Produtos venda = vendas.get(i);
            if (venda instanceof Alimenticio && ((Alimenticio) venda).validade.before(hoje)) {
                porcentagemDescarte += 0.05;
            } else if (venda instanceof Farmaco && ((Farmaco) venda).validade.before(hoje)) {
                porcentagemDescarte += 0.02;
            }
        }
        double lucroLiquido = lucroTotal * (1 - porcentagemDescarte) * 0.9 + salario;
        double lucroBruto = lucroTotalBruto * (1 - porcentagemDescarte);
        DecimalFormat df = new DecimalFormat("#.##");// Perguntar professor como mostrar apenas das casas apos a virgula
        System.out.printf("Salario do  vendedor " + nome + ": R$ %.2f " , lucroLiquido);
        System.out.println("Lucro Bruto vendedor " + nome + ": R$ " + lucroBruto);
        return lucroLiquido;
    }  
}

public class Trabalho_Avaliativo {
    public static void main(String[] args) {
        
        Funcionario funcionario1 = new Funcionario("Bernardo", 1500);
        Funcionario funcionario2 = new Funcionario("Daniele", 2000);

        Alimenticio alimento1 = new Alimenticio("Arroz", 1, new Date(2023, 5, 1), 5.0, 10.0);
        Alimenticio alimento2 = new Alimenticio("Feijão", 2, new Date(2023, 6, 1), 6.0, 12.0);

        Eletronico eletronico1 = new Eletronico("Celular", 3, 12, 1000.0, 1500.0);
        Eletronico eletronico2 = new Eletronico("Notebook", 4, 24, 2000.0, 3000.0);

        Farmaco farmaco1 = new Farmaco("Aspirina", 5, new Date(2023, 12, 1), false, 1.0, 5.0);
        Farmaco farmaco2 = new Farmaco("Dipirona", 6, new Date(2023, 12, 1), true, 2.0, 10.0);

        funcionario1.vendas.add(alimento1);
        funcionario1.vendas.add(eletronico1);
        funcionario1.vendas.add(farmaco1);

        funcionario2.vendas.add(alimento2);
        funcionario2.vendas.add(eletronico2);
        funcionario2.vendas.add(farmaco2);

        
        
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);

        double lucroBruto = 0.0;
        double lucroLiquido = 0.0;
        double pctProdutosVencidos = 0.0;

        for (Funcionario f : funcionarios) {
            double comissao = f.calcularComissao();
            for (Produtos p : f.vendas) {
                lucroBruto += p.Calcular_Lucro();
                if (p instanceof Alimenticio) {
                    Alimenticio a = (Alimenticio) p;
                    if (a.validade.before(new Date())) {
                        pctProdutosVencidos += 1.0;
                        lucroLiquido -= a.valor * 0.05; // descarte por validade
                    }
                }
            }
            lucroLiquido += comissao;
        }

        pctProdutosVencidos /= (double) (funcionario1.vendas.size() + funcionario2.vendas.size());

        System.out.println("Lucro bruto: " + lucroBruto);
        System.out.println("Lucro liquido: " + lucroLiquido);
        
    }
}

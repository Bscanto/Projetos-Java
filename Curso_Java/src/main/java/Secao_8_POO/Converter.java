package Secao_8_POO;

import java.util.Scanner;

public class Converter {
   private double dollarRate;
   private double iofRate;

   public Converter(double dollarRate, double iofRate) {
      this.dollarRate = dollarRate;
      this.iofRate = iofRate;
   }

   public double convertDollarToReal(double dollars) {
      return dollars * dollarRate * (1.0 + iofRate);
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);


      System.out.print("What is the dollar price: ");
      double dollarRate = scanner.nextDouble();

      System.out.print("how many dollars will be bought? ");
      double dollarsToBuy = scanner.nextDouble();

            Converter converter = new Converter(dollarRate, 0.06);

           double result = converter.convertDollarToReal(dollarsToBuy);
      System.out.println("Amount to be paid in reais: R$" + String.format("%.2f", result));


      scanner.close();
   }
}
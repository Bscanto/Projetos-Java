package Secao_8_POO;

import java.util.Locale;
import java.util.Scanner;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + " , " + quantity + " units, Total: $" + String.format("%.2f", totalValueInStock());
    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        boolean exit = false;

        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Enter product data");
            System.out.println("2. Add products to stock");
            System.out.println("3. Remove products from stock");
            System.out.println("4. Display product data");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter product data: ");
                    System.out.print("Name: ");
                    sc.nextLine(); // Consume the newline character left by nextInt()
                    product.name = sc.nextLine();
                    System.out.print("Price: ");
                    product.price = sc.nextDouble();
                    System.out.print("Quantity: ");
                    product.quantity = sc.nextInt();
                    break;

                case 2:
                    System.out.println("Enter the number of products to be added to stock: ");
                    int addQuantity = sc.nextInt();
                    product.addProducts(addQuantity);
                    System.out.println("Update data: " + product);
                    break;

                case 3:
                    System.out.println("Enter the number of products to be removed from stock: ");
                    int removeQuantity = sc.nextInt();
                    product.removeProducts(removeQuantity);
                    System.out.println("Update data: " + product);
                    break;

                case 4:
                    System.out.println("Product data: " + product);
                    break;

                case 5:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option. Please choose a valid option.");
                    break;
            }
        }

        sc.close();
    }
}
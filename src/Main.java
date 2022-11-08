import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double purchase;
        double stateSalesTax = 0.04;
        double countySalesTax = 0.02;
        double totalSalesTax;
        double totalSales;

        System.out.print("Enter the amount of purchase");

        purchase = input.nextDouble();

        totalSalesTax = stateSalesTax + countySalesTax;
        totalSales = purchase + totalSalesTax;

        System.out.println("purchase = " + purchase);
        System.out.println("stateSalesTax = " + stateSalesTax);
        System.out.println("countySalesTax = "+ countySalesTax);
        System.out.println("totalSalesTax = " + totalSalesTax);
        System.out.print("totalSlaesTax = " + totalSales);
    }
}
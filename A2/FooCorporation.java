/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2;

/**
 *
 * @author Klaudio Vito © 2016
 */
public class FooCorporation {
    public static void main(String[] arguments){
        double emp1 = getPayment(7.5, 35);
        double emp2 = getPayment(8.2, 47);
        double emp3 = getPayment(10 , 73);
        if(emp1 > 0) System.out.println("Payment for employee 1 is $" + emp1);
        else System.out.println("Employee 1 violates the rules");
        if(emp2 > 0) System.out.println("Payment for employee 2 is $" + emp2);
        else System.out.println("Employee 2 violates the rules");
        if(emp3 > 0) System.out.println("Payment for employee 3 is $" + emp3);
        else System.out.println("Employee 3 violates the rules");
    }
    
    private static double getPayment(double basePay, int hours){
        double payment = 0;
        if(basePay <  8) return 0;
        if(hours   > 60) return 0;
        if(hours  <= 40) payment = hours * basePay;
        else             payment = (hours - 40) * (1.5 * basePay) + (40 * basePay); 
        return payment;
    }
}

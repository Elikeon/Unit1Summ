/*
  * Jared Craig
 * 14/09/2018
 *  Simple math program and name
 */

package unit.pkg1.summ;

import javax.swing.JOptionPane;

/**
 *
 * @author jacra1226 

 */
public class Unit1Summ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Where all the magic happens
        String name = JOptionPane.showInputDialog("Enter your name"); //Input for name
        String num = JOptionPane.showInputDialog("Enter a number"); //Input for frist number
        String num2 = JOptionPane.showInputDialog("Enter another number"); //Input for second number
        double numdb1 =  Double.parseDouble(num);  //Makes first number a double
        double numdb2 =  Double.parseDouble(num2);  //Makes second nubmer a double
        String name2 = name.toUpperCase(); //Makes name uppercase
        double sum = numdb1 + numdb2; //Makes sum
        double diff = numdb1 - numdb2; //Makes difference
        double prod = numdb1*numdb2; //Makes product
        double qui = numdb1/numdb2;  //Makes quotient
        System.out.println("Sum: " + sum); //Outputs sum
        System.out.println("Difference: " + diff); //Outputs difference
        System.out.println("Product: " + prod); //Outputs product
        System.out.println("Quotient: " + qui); //Outputs quotient
        System.out.println("Name: " + name2); //Outputs name
        
    }
    
}

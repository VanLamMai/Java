/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1911172_doanducnghia;
import java.util.Scanner;
/**
 *
 * @author PC124
 */
public class SimpleCalculator {
    public static void main(String[] args){
        double firstNum;
        double secondNum;
        char operator;
        double value;
        
        System.out.println("Enter expressions such as 2 +2 or 34.2 * 7.81");
        System.out.println("using any of the operators +, -, *, /,");
        System.out.println("to end, enter a 0.");
        System.out.println();
        
        while (true){
            System.out.println("? ");
            firstNum = TextIO.getDouble();
                    if (firstNum == 0)
                break;
            operator = TextIO.getChar();
            secondNum = TextIO.getlnDouble();
            switch (operator){
                case'+':
                     value= firstNum + secondNum;
                     break;
                case'-':
                    value = firstNum - secondNum;
                    break;
                case '*':
                    value = firstNum * secondNum;
                    break;
                case '/':
                    value = firstNum / secondNum;
                    break;
                default:
                    System.out.println("Unknown operator : " + operator);
                    continue;
            }
            System.out.println("Value is " + value);
            System.out.println();
        }
        System.out.println(" Good bye");
    }
}

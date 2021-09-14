/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1911172_doanducnghia;

/**
 *
 * @author PC124
 */
public class MostDivisors {
    public static void main (String[] args){
        int N;
        int maxDivisors;
        int numWithMax;
        
        maxDivisors = 1;
        numWithMax = 1;
        
        for ( N= 2; N<= 10000; N++){
            int D;  
            int divisorCount ;
            divisorCount = 0;
            
            for (D=1; D<= N; D++){
                if ( N % D==0)
                    divisorCount++;
                
            }
            if (divisorCount > maxDivisors){
                maxDivisors = divisorCount;
                numWithMax=N;
            }
        }
        System.out.println("Among intehers between 1 and 10000,");
        System.out.println("The maxium number of divisors is " + maxDivisors);
        System.out.println("A number with "+ maxDivisors +" divisors is " + numWithMax);
        
    }
}

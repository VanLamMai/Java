/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Admin
 */
public class StatCalc {
        private int count; 
        private double sum; 
        private double squareSum; 
        public void enter(double num) {
        count++;
        sum += num;
        squareSum += num*num;
        }

        public int getCount() {
        return count;
        }

        public double getSum() {
        return sum;
        }


        public double getMean() {
        return sum / count;
        }

        public double getStandardDeviation() {
        double mean = getMean();
        return Math.sqrt( squareSum/count - mean*mean );
     }
}

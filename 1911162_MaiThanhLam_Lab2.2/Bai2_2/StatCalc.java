/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2_2;

/**
 *
 * @author Admin
 */
public class StatCalc {
    private int count;
    private double sum;
    private double squareSum;
    private double max = Double.NEGATIVE_INFINITY;
    private double min = Double.POSITIVE_INFINITY;
    public void enter ( double num){
        count++;
        sum += num;
        squareSum += num*num;
        if (num>max)
            max = num;
        if (num < min)
            min=num;
    }
    public int  getCount(){
        return count;
        
    }
    public double getSum(){
        return sum;
    }
    public double getMean(){
        return sum / count;
    }
    public double getStandarDeviation(){
        double mean = getMean();
        return Math.sqrt(squareSum/count-mean*mean);
    }
    public double getMin(){
        return min;
    }
    public double getMax(){
        return max;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author PC124
 */
public class Bai2_1 {
    public static Scanner scanner = new Scanner(System.in);
     
   
    public static void main(String[] args) {
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        // khởi tạo arr
        int [] arr = new int [n];
        System.out.print("nhap cac phan tu trong mang: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        
        sortASC(arr);
        System.out.println("Day so sap xep tang dan: ");
        show(arr);
    }
     
    
    public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
     
    
    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

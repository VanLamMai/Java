/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19111172_doanducnghia;

import java.util.Random;
import java.util.Scanner;


public class Bai1_2 {
    
    public static void main(String[] args){
        
    int soCuaMay, soNguoiChoiDoan;
    String ketQua = "";
    Scanner scanner = new Scanner(System.in);
     
   
    while (true) {
        Random rd = new Random();
        
        soCuaMay = 1 + rd.nextInt(100);
 
        System.out.print("Nhap so doan[1..100], nhap 0 de thoat: ");
        soNguoiChoiDoan = scanner.nextInt();
             
        if (soNguoiChoiDoan == soCuaMay) {
            ketQua = "Dung";
            System.out.println(ketQua);
        } 
        else if (soNguoiChoiDoan > soCuaMay) {
            ketQua = "lon hon";
            System.out.println(ketQua);
        }
        else if (soNguoiChoiDoan < soCuaMay){
            ketQua = "nho hon";
            System.out.println(ketQua);
        }
        if (soNguoiChoiDoan == 0){
            ketQua = "Thoat";
            System.out.println(ketQua);
            break;
        }
    }
  }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;
import java.util.Arrays;

public class Bai2_2 {
    public static Scanner sc = new Scanner(System.in);
    static void nhapThongTinh(SinhVien tt) {
        sc.nextLine();
        System.out.println("Nhập mã số sinh viên: ");
        tt.setMaSV(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập họ và tên sinh viên: ");
        tt.setHoten(sc.nextLine());
        System.out.println("Nhập ngay sinh sinh viên: ");
        tt.setNgaySinh(sc.nextDouble());
       
    }
 
    public static void main(String[] args) {
        SinhVien sv[] = null;
        int a, n = 0;
        boolean flag = true;
        do {
            System.out.println("Bạn chọn làm gì?");
            System.out.println("1.Nhập thông tin sinh viên. \n" +
                    "2.Xuất bản danh sách sinh viên.\n" +
                    "Nhập số khác để thoát");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Nhập số lương sinh viên cần khai báo: ");
                    n = sc.nextInt();
                    sv = new SinhVien[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh viên thứ " + (i + 1)+": ");
                        sv[i] = new SinhVien();
                        nhapThongTinh(sv[i]);
 
                    }
 
                    break;
                case 2:
                    SinhVien temp = sv[0];
                    for (int i = 0; i < sv.length - 1; i++) {
                        for (int j = i + 1; j < sv.length; j++) {
                            if (sv[i].getMaSV() > sv[j].getMaSV()) {
                                temp = sv[j];
                                sv[j] = sv[i];
                                sv[i] = temp;
                            }
                        }
                    }
                    System.out.printf("%-5s %15s %15s \n", "MSSV", "Họ và tên", "Ngay Sinh" );
                    for (int i = 0; i < n; i++) {
                        sv[i].hienThiTT();
                    }
                    break;
                default:
                    System.out.println("Goodbye");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}

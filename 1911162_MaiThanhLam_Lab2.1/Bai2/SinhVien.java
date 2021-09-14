/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Date;

/**
 *
 * @author PC124
 */
public class SinhVien {
    private int maSV;
    private String hoTen;
    private Double ngaySinh;
 
    //khởi tạo constructor mặc định
    public SinhVien() {
 
    }
    //khởi tạo constructor có tham số
    public SinhVien(int maSV, String hoTen, Double ngaySinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh=ngaySinh;

    }
    //--------------begin getter and setter--------------------
    public int getMaSV() {
        return maSV;
    }
 
    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }
 
    public String getHoten() {
        return hoTen;
    }
 
    public void setHoten(String hoten) {
        this.hoTen = hoTen;
    }
 
    public Double getNgaySinh() {
        return ngaySinh;
    }
 
    public void setNgaySinh(Double ngaysinh) {
        this.ngaySinh = ngaySinh;
    }
 

    //--------------end getter and setter--------------------
    ///khởi tạo phương thức toString
    @Override
    public String toString() {
        return "SinhVienNhap{" +
                "maSV=" + maSV + 
                ", hoTen=" + hoTen + 
                ", ngaySinh=" + ngaySinh +  +
                '}';
    }
    //khởi tạo phương thức hiển thị theo format
    public void hienThiTT() {
        System.out.printf("%-5d %-20s %-15s \n", maSV, hoTen, ngaySinh);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phuongthuccompareto.vidu;

/**
 *
 * @author KINHTHANH
 */
public class SinhVien implements Comparable<SinhVien> {
    private String maSV;
    private String ten;
    private double diemTB;

    public SinhVien(String maSV, String ten, double diemTB) {
        this.maSV = maSV;
        this.ten = ten;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    /*@Override
    public int compareTo(SinhVien o) {
        return (int)(this.diemTB-o.diemTB);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
    public String getLastName()
    {
        String s = this.getTen().trim();
        if(s.contains(" "))
        {
            int index = s.lastIndexOf(" ");
            return s.substring(index+1);
        }
        else
        {
            return s;
        }
    }
    @Override
    public int compareTo(SinhVien o) {
       return this.getLastName().compareTo(o.getLastName()) ; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "{" + "maSV=" + maSV + ", ten=" + ten + ", diemTB=" + diemTB + '}';
    }
    
    
    
    
    
}

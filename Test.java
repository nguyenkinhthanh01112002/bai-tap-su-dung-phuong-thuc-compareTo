/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phuongthuccompareto.vidu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author KINHTHANH
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SinhVien> students = new ArrayList<SinhVien>();
        while(true)
        {
            System.out.println("1.Them sinh vien: ");
            System.out.println("2.Sap xep sinh vien theo ten: ");
            System.out.println("3.Hien thi danh sach sinh vien");
            System.out.println("0.Thoat");
            String button = scanner.nextLine();
            switch(button)
            {
                case "1":
                {
                    System.out.print("nhap vao so luong sinh vien muon them: ");
                    int n = scanner.nextInt();
                    for(int i=0;i<n;i++)
                    {
                        scanner.nextLine();
                        System.out.print("nhap vao ten cua sinh vien: ");
                        String ten = scanner.nextLine();
                        System.out.print("nhap vao ma so sinh vien: ");
                        String maSV = scanner.nextLine();
                        System.out.print("nhap vao diem cua sinh vien: ");
                        double diemTB = scanner.nextDouble();  
                        SinhVien sinhVien = new SinhVien(maSV, ten, diemTB);
                        students.add(sinhVien);
                    }
                   scanner.nextLine();
                   break;
                }
                case "2":
                {
                    //students.sort((o1, o2) -> 0);
                    //chuyen doi arraylist thanh mang trong java
                  SinhVien arr[] = new SinhVien[students.size()];
                  students.toArray(arr);
                  Arrays.sort(arr);
                  for(int i=0;i<arr.length;i++)
                  {
                      System.out.println(""+arr[i]);
                  }
                  break;
                }
                default:
                {
                    System.out.println("du lieu khong hop le");
                    continue;
                }
            }
            
        }
        
    }
    
}

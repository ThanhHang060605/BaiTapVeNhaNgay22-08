/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitaptinhhaisonguyen;

import java.util.Scanner;

public class BaiTapTinhHaiSoNguyen {

    public static void main(String[] args) {
        int x;
        int y;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Nhap vao hai so nguyen tu ban phim");
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println("Tong hai so nguyen la: " + (x + y));
        System.out.println("Hieu hai so nguyen la: " + (x - y));
        System.out.println("Tich hai so nguyen la: " + (x * y));
        System.out.println("Thuong hai so nguyen la: " + (x / y));
        System.out.println("So du hai so nguyen la: " + (x % y));  
        
    }
    
}

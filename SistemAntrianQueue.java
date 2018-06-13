/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemAntrian;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

/**
 *
 * @author AHMADFAUZAAULIA
 */
public class SistemAntrianQueue {
  public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      Queue<Integer> q = new LinkedList<>();
            char ch;
            int i=0;
            do{
                System.out.println("\nSistem Antrian");
                System.out.println("1. Ambil Nomor Antrian");
                System.out.println("2. Panggil");
                System.out.println("3. Nomer Sekarang");
                System.out.println("4. Sisa Antrian");
                System.out.println("9. Selesai di panggil");
                
                System.out.print("Pilih : ");
                int choice = scan.nextInt();
                switch (choice)
                {
                case 1 : 
                        i+=1;
                        q.add(i);
                        int tambah = i;
                        System.out.println("Nomer urut Anda adalah  " + tambah);
                    break;                         
                case 2 : 
                        int panggil = q.peek();
                        System.out.println("Panggilan untuk Nomor " + panggil);
                    break;        
                case 3 : 
                        int head = q.peek();
                        System.out.println("Nomer Sekarang " + head);
                    break;                                                                   
                case 4 : 
                    int size = q.size();
                    System.out.println("Sisa Antrian = " + size);
                    break;
                case 9 : 
                        int removedele = q.remove();
                        System.out.println("Pelayanan nomor " + removedele + " telah Selesai");
                    break; 
                default : System.out.println("Salah memasuukkan pilihan \n ");
                    break;
                }          
                System.out.println("\nDo you want to continue (Type y or n) \n");
                ch = scan.next().charAt(0);
     
            } while (ch == 'Y'|| ch == 'y');      
  }  
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1_pbo;
import java.util.Scanner;
public class pembagian_umur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();
        
        String kategori = "";
        
        if (umur < 5) {
            kategori = "Balita";
        } else if (umur >= 5 && umur <= 12) {
            kategori = "Anak-anak";
        } else if (umur > 12 && umur <= 18) {
            kategori = "Remaja";
        } else if (umur > 18 && umur <= 40) {
            kategori = "Dewasa";
        } else if (umur > 40 && umur <= 60) {
            kategori = "Parobaya";
        } else {
            kategori = "Lanjut Usia";
        }
        
        System.out.println("Anda termasuk dalam kategori: " + kategori);
    }
    
}

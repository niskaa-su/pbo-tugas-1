/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1_pbo;
import java.util.Scanner;
public class bbi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // masukkan jenis kelamin
        System.out.print("Masukkan Jenis Kelamin = ");
        char jenis_kelamin = input.next().charAt(0);
        // masukkan tinggi badan
        System.out.print("Masukkan Tinggi Badan = ");
        double tb = input.nextDouble();
        // menghitung berat badan
        double BBI;
        if (jenis_kelamin == 'l' || jenis_kelamin == 'L') {
            BBI = (tb - 100) - ((tb - 100) * 0.1);
        }else if (jenis_kelamin == 'p' || jenis_kelamin == 'P') {
            BBI = (tb - 100) - ((tb - 100) * 0.15);
        } else{
            System.out.println("Masukkan jenis kelamin (l/p) = ");
            return;
        }
        // tampilkan hasil
            System.out.print("Masukkan berat badan anda (kg) = ");
            double beratbadan= input.nextDouble();
            
        if (beratbadan <= BBI){
            System.out.println("Berat badan anda ideal");
        }else {
            System.out.println("Berat badan anda tidak ideal");
    }
        input.close();
    }
    
}

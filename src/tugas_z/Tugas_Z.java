package tugas_z;

import java.util.Scanner;

public class Tugas_Z {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int masuk, baris, kolom;
        
        do
        {
            System.out.print("Masukkan Jumlah Perulangan (Min = 3) = ");
            masuk = input.nextInt();
        }
        while(masuk < 3);
        
        System.out.println("");
        System.out.println("+----------Tugas Z--------+");
        System.out.println("+-------------------------+");
        System.out.println("");
        
        for (baris = 0; baris < masuk; baris++) 
        {
            for (kolom = 0; kolom < masuk; kolom++) 
            {
                if( ( (baris == masuk -1)||(baris == 0) || (kolom == masuk +1)|| kolom + baris == masuk-1) )
                {
                    System.out.print(" $ ");
                }
                
                else
                {
                    System.out.print(" . ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("");
        System.out.println("+------- 025314020 -------+");
        System.out.println("+-------Program Java------+");
    }
    
}

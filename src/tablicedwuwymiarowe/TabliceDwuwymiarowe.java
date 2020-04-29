/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablicedwuwymiarowe;

import java.util.Random;

/**
 *
 * @author Informatyka
 */
public class TabliceDwuwymiarowe {
    public static void Wypisz_wartosci_z_rogu(int[][]tablica)
    {
        System.out.print("Wartości z rogów:" + tablica[0][0] + "," + tablica[0][2] + "," + tablica[2][0]+"," + tablica[2][2]);
    }

    public static void Znajdz_najmniejsza_wartosc(int [][]tablica)
    {   
        int najmniejsza_liczba = tablica[0][0];
        
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length; j++) {
            
                if(najmniejsza_liczba > tablica[i][j])
                {
                najmniejsza_liczba =  tablica[i][j];   
                }
            }
        }
        System.out.println("Najmniejsza wartość to: " + najmniejsza_liczba);
    }
    public static void Znajdz_największą_wartosc(int [][]tablica)
    { 
        int największa_liczba = tablica[0][0];
        
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length; j++) {
            
                if(największa_liczba < tablica[i][j])
                {
                największa_liczba =  tablica[i][j];   
                }
            }
        }
        
       System.out.println("Największa wartość to: " + największa_liczba);
    }
    
    public static void Generate(int[][] tablica)
    {
        Random generator = new Random();
        
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length; j++) {
                tablica[i][j] = generator.nextInt(100);
            }
        }
    }
    
    public static void Wypisz_tablice(int [][]tablica)
    {
         for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length; j++) {
                System.out.print(tablica[i][j] + "    ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[][] tablica = new int[3][3];
        
        Generate(tablica);
        Wypisz_tablice(tablica);
        
       Znajdz_najmniejsza_wartosc(tablica);
       Znajdz_największą_wartosc(tablica);
       Wypisz_wartosci_z_rogu(tablica);
    }
    
}

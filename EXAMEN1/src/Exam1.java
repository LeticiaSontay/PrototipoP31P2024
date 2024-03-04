
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leticia
 */
public class Exam1 {
    
     public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); 
        
        String[] candidatos = new String[5];
        int [][] votos = new int[5][4];  
        int [] totalVotos = new int[10];  
        
        // Ingresar nombres de candidatos
        System.out.println("Ingrese los nombres de los 5 candidatos a presidente:");
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.print("Candidato " + (i + 1) + ": ");
            candidatos[i] = scanner.nextLine();
        }
        
        // Simulacion de los votos de afiliados en 5 rondas
        for (int ronda = 0; ronda < 4; ronda++){
            for (int afiliado = 0; afiliado < 50; afiliado++){
                int voto = random.nextInt(5);
                votos[voto][ronda]++; 
            }
        }   
    
}
     }

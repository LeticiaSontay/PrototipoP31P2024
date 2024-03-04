
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
public class Examen_1 {
      public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); 
 
        while(true){
    
                String[] candidatos = new String[5];
        int [][] votos = new int[5][5];  
        int [] totalVotos = new int[10];  
        
        // Ingresar nombres de candidatos
        System.out.println("Ingrese los nombres de los 5 candidatos a presidente:");
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.println("Candidato " + (i + 1) + ": ");
            candidatos[i] = scanner.nextLine();
        }
        
        // Simulacion de los votos de afiliados en 5 rondas
        for (int ronda = 0; ronda < 5; ronda++){
            for (int afiliado = 0; afiliado < 50; afiliado++){
                int voto = random.nextInt(5);
                votos[voto][ronda]++; 
            }
        }
                            System.out.println("Tabla de Votos:");
            System.out.printf("%-25s", "Candidato");
            for (int ronda = 1; ronda <= 5; ronda++) {
                System.out.printf("%-10s", "Ronda " + ronda);
            }
            System.out.println();

            for (int candidato = 0; candidato < 5; candidato++) {
                System.out.printf("%-25s", candidatos[candidato]);
                for (int ronda = 0; ronda < 5; ronda++) {
                    System.out.printf("%-10d", votos[candidato][ronda]);
                }
                System.out.println();
            }
                       // Calcular el candidato ganador y el que obtuvo menos votos
            for (int candidato = 0; candidato < 5; candidato++) {
                for (int ronda = 0; ronda < 5; ronda++) {
                    totalVotos[candidato] += votos[candidato][ronda];
                }
            }
            // comentario

            // Encontrar el ganador y el que obtuvo menos votos
            int ganador = 0;
            int menosVotos = 0;
            for (int candidato = 1; candidato < 5; candidato++) {
                if (totalVotos[candidato] > totalVotos[ganador]) {
                    ganador = candidato;
                }
                if (totalVotos[candidato] < totalVotos[menosVotos]) {
                    menosVotos = candidato;
                }
            }
           // Mostrar resultados
            System.out.println("\nEl candidato ganador es: " + candidatos[ganador]);
            System.out.println("El candidato con menos votos es: " + candidatos[menosVotos]);  
            System.out.println();
    
                 System.out.print("\n¿Desea Repetir las elecciones? (s/n): ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                break; // Salir del bucle si la respuesta no es "s"
            }
        
}           
            
            
}
}

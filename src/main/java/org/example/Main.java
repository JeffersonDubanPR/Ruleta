package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<String> jugadores = new ArrayList<>();


            System.out.print("Numeros de Jugares ");
            int numJugadores = scanner.nextInt();
            scanner.nextLine();


            for (int i = 0; i < numJugadores; i++) {
                System.out.print("Ingrese el nombre del jugador " + (i + 1) + ": ");
                String nombre = scanner.nextLine();
                jugadores.add(nombre);
            }


            Ruleta ruleta = new Ruleta(jugadores);


            boolean jugadorMuerto = false;
            int ronda = 1;

            while (!jugadorMuerto) {
                System.out.println("\nRonda " + ronda + ":");
                jugadorMuerto = ruleta.disparar();
                ronda++;
            }

            System.out.println("El juego ha terminado.");
            scanner.close();
        }
    }














package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

   public class Ruleta {


           private List<String> jugadores;
           private int posicionBala;
           private int posicionRecamara;
           private Random random;


           public Ruleta() {
               this.jugadores = new ArrayList<>();
               this.random = new Random();
               nuevoAleatorio();
           }

           public Ruleta(List<String> jugadores) {
               this.jugadores = jugadores;
               this.random = new Random();
               nuevoAleatorio();
           }

           public List<String> getJugadores() {
               return jugadores;
           }

           public void setJugadores(List<String> jugadores) {
               this.jugadores = jugadores;
           }

           public int getPosicionBala() {
               return posicionBala;
           }

           public void setPosicionBala(int posicionBala) {
               this.posicionBala = posicionBala;
           }

           public int getPosicionRecamara() {
               return posicionRecamara;
           }

           public void setPosicionRecamara(int posicionRecamara) {
               this.posicionRecamara = posicionRecamara;
           }

           public Random getRandom() {
               return random;
           }

           public void setRandom(Random random) {
               this.random = random;
           }


           public boolean disparar() {
               if (posicionBala == posicionRecamara) {
                   System.out.println(jugadores.get(posicionRecamara) + " ha muerto.");
                   return true; // El jugador ha muerto
               } else {
                   System.out.println(jugadores.get(posicionRecamara) + " está vivo.");
                   nuevoAleatorio(); // Cambiar la posición de la bala
                   return false; // El jugador sigue vivo
               }
           }


           public void nuevoAleatorio() {
               posicionBala = random.nextInt(6);


               if (jugadores.size() > 0) {
                   posicionRecamara = random.nextInt(jugadores.size());
               } else {
                   System.out.println("No hay jugadores y no se puede generar una posición de recámara.");
                   posicionRecamara = -1;
               }

               System.out.println("Nueva posición de la bala: " + posicionBala + ", Nueva posición de la recámara: " + posicionRecamara);
           }
       }









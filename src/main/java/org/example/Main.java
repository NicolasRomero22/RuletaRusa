package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RuletaRusa juego = new RuletaRusa();
        boolean juegoActivo = true;

        System.out.println("Bienvenido al juego de la ruleta rusa!");

        while (juegoActivo) {
            System.out.println("¿Qué quieres hacer?");
            System.out.println("1. Disparar");
            System.out.println("2. Salir");

            int opcion = scanner.nextInt();

            if (opcion == 1) {
                boolean disparo = juego.disparar();

                if (disparo) {
                    System.out.println("La Bala disparo!! Estás muerto DX");
                    juegoActivo = false;
                } else {
                    System.out.println("Te has salvado!! ;)");
                    System.out.println("La posición actual del tambor es: " + juego.getPosicionActual());
                }
            } else if (opcion == 2) {
                System.out.println("Saliendo...");
                juegoActivo = false;
            } else {
                System.out.println("Opción no válida. Por favor, ingresa 1 para disparar o 2 para salir.");
            }
        }

        System.out.println("¿Quieres reiniciar el juego?");
        System.out.println("1. Reiniciar");
        System.out.println("2. Salir");

        int reiniciar = scanner.nextInt();
        if (reiniciar == 1) {
            juego.reiniciarJuego();
            System.out.println("El juego ha sido reiniciado.");
            main(args);
        } else {
            System.out.println("Saliendo...");
        }

        scanner.close();

    }
}
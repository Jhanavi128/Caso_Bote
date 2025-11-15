package pkJuego;

import java.util.Scanner;

public class AppJuegoCaperucita {
    public void jugar() {
        Lobo lobo = new Lobo();
        Caperucita caperucita = new Caperucita();
        Uva uva = new Uva();
        Bote bote = new Bote();
        Observador observador = new Observador();

        Scanner ingresoDatos = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Estado actual ---");
            System.out.println("Lobo: " + lobo.getLado());
            System.out.println("Caperucita: " + caperucita.getLado());
            System.out.println("Uvas: " + uva.getLado());
            System.out.println("Bote: " + bote.getLado());

            System.out.println("\n--------Opciones-------");
            System.out.println("1. Lobo");
            System.out.println("2. Caperucita");
            System.out.println("3. Uvas");
            System.out.println("4. Solo cruzar");
            System.out.println("5. Salir del juego");
            System.out.print("Opción: ");
            int opcion = ingresoDatos.nextInt();
            String personajeEnBote = "";

            switch (opcion) {
                case 1:
                    personajeEnBote = "lobo";
                    break;
                case 2:
                    personajeEnBote = "caperucita";
                    break;
                case 3:
                    personajeEnBote = "uvas";
                    break;
                case 4:
                    personajeEnBote = "ninguno";
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            if (!personajeEnBote.equals("ninguno")) {
                String ladoPer = obtenerLadoPersonajes(personajeEnBote, lobo, caperucita, uva);

                if (!ladoPer.equals(bote.getLado())) {
                    System.out.println("Ese personaje NO está en el mismo lado del bote");
                    break;
                }
            }

            bote.cargar(personajeEnBote);
            observador.navegar(personajeEnBote);

            bote.desplazarse();

            actualizarLado(personajeEnBote, lobo, caperucita, uva, bote);

            if (verificarPerdida(lobo, caperucita, uva, bote)) {
                continuar = false;
            }

            if (verificarGana(lobo, caperucita, uva)) {
                continuar = false;
            }

        }
        ingresoDatos.close();

    }

    public boolean verificarGana(Lobo lobo, Caperucita caperucita, Uva uva) {

        if (lobo.getLado().equals("D") && caperucita.getLado().equals("D") &&
                uva.getLado().equals("D")) {

            System.out.println("\n-------------------GANASTE------------------");
            return true;
        }

        return false;
    }

    public void actualizarLado(String personajeEnBote, Lobo lobo, Caperucita caperucita, Uva uva, Bote bote) {

        String nuevoLado = bote.getLado();

        if (personajeEnBote.equals("lobo")) {
            lobo.setLado(nuevoLado);
        }
        if (personajeEnBote.equals("caperucita")) {
            caperucita.setLado(nuevoLado);
        }
        if (personajeEnBote.equals("uvas")) {
            uva.setLado(nuevoLado);
        }
    }

    public boolean verificarPerdida(Lobo lobo, Caperucita caperucita, Uva uva, Bote bote) {
        if (lobo.getLado().equals(caperucita.getLado())
                && !bote.getLado().equals(lobo.getLado())) {

            lobo.comer(caperucita);
            caperucita.serComida(lobo);
            System.out.println("\n ------ PERDISTE--------");
            return true;
        }

        if (caperucita.getLado().equals(uva.getLado())
                && !bote.getLado().equals(caperucita.getLado())) {
                caperucita.comer(uva);
                uva.serComida(caperucita);

            System.out.println("\n ------ PERDISTE-----------");
            return true;
        }

        return false;
    }

    public String obtenerLadoPersonajes(String personaje, Lobo lobo, Caperucita cap, Uva uva) {

        if (personaje.equals("lobo")) {
            return lobo.getLado();
        }

        if (personaje.equals("caperucita")) {
            return cap.getLado();
        }

        if (personaje.equals("uvas")) {
            return uva.getLado();
        }
        return "";
    }

}

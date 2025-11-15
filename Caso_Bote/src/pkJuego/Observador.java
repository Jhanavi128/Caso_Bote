package pkJuego;

public class Observador {
     public void navegar(String personaje) {
        if (!personaje.equals("ninguno")) {
            System.out.println("El vikingo navega con  " + personaje);
        } else {
            System.out.println("El bote cruza vacío.");
        }
    }
}

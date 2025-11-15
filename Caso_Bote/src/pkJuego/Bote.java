package pkJuego;

public class Bote {
    private int capacidadMaxima = 2;
    private String lado = "I";

    public void desplazarse() {
        if (lado.equals("I")) {
            lado = "D";
        } else {
            lado = "I";
        }
        System.out.println("El bote está ahora en el lado: " + lado);
    }

    public void cargar(String nombre) {
        System.out.println(nombre + " sube al bote.");
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getLado() {
        return lado;
    }

    public void setLado(String lado) {
        this.lado = lado;
    }
    
}

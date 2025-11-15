package pkJuego;

public class Caperucita {
    private String nombre = "Caperucita";
    private String lado = "I";



     public void comer(Uva uva) {
        System.out.println(nombre + " se comió las uvas");
    }

    public void serComida(Lobo lobo) {
        System.out.println(nombre + " está siendo comida por el lobo");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLado() {
        return lado;
    }

    public void setLado(String lado) {
        this.lado = lado;
    }

    
}

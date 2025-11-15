package pkJuego;

public class Lobo {
    private String nombre = "Lobo";
    private String lado = "I"; 


    public void comer(Caperucita caperucita) {
        System.out.println(nombre + " se come a " + caperucita.getNombre());
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

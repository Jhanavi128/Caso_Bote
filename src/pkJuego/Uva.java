package pkJuego;

public class Uva {
    private String nombre = "Uvas";
    private String lado = "I";

    public void serComida(Caperucita caperucita) {
        System.out.println(nombre + " están siendo comidas por " + caperucita.getNombre());
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

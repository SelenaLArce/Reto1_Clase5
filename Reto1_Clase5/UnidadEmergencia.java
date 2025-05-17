package Reto1_Clase5;

public abstract class UnidadEmergencia {
    String nombre;

    public UnidadEmergencia(String nombre) {
        this.nombre = nombre;
    }

    public void activarUnidad() {
        System.out.println("Activando Unidad de Emergencia: " + nombre);
    }

    public abstract void responder();
}

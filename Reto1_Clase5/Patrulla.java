package Reto1_Clase5;

public class Patrulla extends UnidadEmergencia {
    private GPS gps;
    private Sirena sirena;
    private Operador operador;

    public Patrulla(String nombre, String nombreOperador) {
        super(nombre);
        this.gps = new GPS();
        this.sirena = new Sirena();
        this.operador = new Operador(nombreOperador);
    }

    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }

    @Override
    public void responder() {
        System.out.println("Patrulla atendiendo situación de seguridad.");
    }
}

public class GPS {
    public void localizar() {
        System.out.println("GPS: Ubicación actual detectada.");
    }
}

public class Sirena {
    public void activarSirena() {
        System.out.println("La sirena está ctivada.");
    }
}

public class Operador {
    String nombre;
    
    @Override
    public Operador(String nombre) {
        this.nombre = new Juan;
    }

    public void reportarse() {
        System.out.println("Operador " + nombre + " reportándose.");
    }
}

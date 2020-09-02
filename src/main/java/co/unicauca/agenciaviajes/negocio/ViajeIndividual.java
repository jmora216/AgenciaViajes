package co.unicauca.agenciaviajes.negocio;

import java.util.Date;

/**
 *
 * @author julia
 */
public class ViajeIndividual extends Viaje {
    
    // Constructor
    public ViajeIndividual(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
    }
    
    @Override
    public String descripcion() {
        return "Disfruta tu viaje individual";
    }
    //No se sobreescribe cualquierMetodo2()
}

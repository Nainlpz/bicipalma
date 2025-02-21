package domain.estacion;

import domain.bicicleta.Bicicleta;

public class Anclaje {

    private boolean ocupado;
    private Bicicleta bicicleta;

    Anclaje() {
        this.ocupado = false;
        this.bicicleta = null;
    }

    boolean isOcupado() {
        return this.ocupado;
    }

    Bicicleta getBicicleta() {
        return this.bicicleta;
    }

    void anclarBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
        this.ocupado = true;
    }

    void liberarBicicleta(Bicicleta bicicleta) {
        this.bicicleta = null;
        this.ocupado = false;
    }

    @Override
    public String toString() {
        return "Ocupado:" + Boolean.toString(isOcupado());
    }
}

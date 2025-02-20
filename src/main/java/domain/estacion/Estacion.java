package domain.estacion;

public class Estacion {

    private final int id;
    private final String direccion;
    private final int anclajes;



    public Estacion(int id, String direccion, int anclajes) {
        this.id = id;
        this.direccion = direccion;
        this.anclajes = anclajes;
    }

    private int getId() {
        return this.id;
    }

    private String getDireccion() {
        return this.direccion;
    }

    private int getAnclajes() {
        return this.anclajes;
    }

    public void consultarEstacion() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "id: " + this.getId() + "\n" +
                "direccion: " + this.getDireccion() + "\n" +
                "numero de anclajes: " + this.getAnclajes();
    }

    public int anclajesLibres() {
        return getAnclajes();
    }
}


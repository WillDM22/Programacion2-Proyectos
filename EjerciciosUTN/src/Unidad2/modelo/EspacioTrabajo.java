package Unidad2.modelo;
public abstract class EspacioTrabajo implements Reservable{
    private String identificador;
    private int capacidadMaxima;
    private double precioBaseHora;

    public EspacioTrabajo(String identificador, int capacidadMaxima, double precioBaseHora){
        if(identificador == null || identificador.trim().isEmpty()){
            throw new IllegalArgumentException("El identificador no puede ser nulo o vacío.");

        }
        if (capacidadMaxima <= 0 || precioBaseHora <= 0){
            throw new IllegalArgumentException("La capacidad máxima y el precio base por hora deben ser mayores a cero.");
        }
        this.identificador = identificador;
        this.capacidadMaxima = capacidadMaxima;
        this.precioBaseHora = precioBaseHora;
    }

    public String getIdentificador(){return identificador;}
    public int getCapacidadMaxima(){return capacidadMaxima;}
    public double getPrecioBaseHora(){return precioBaseHora;}

    public void actualizarCapacidad(int nuevaCapacidad){
        this.capacidadMaxima = nuevaCapacidad;
    }

    public void actualizarCapacidad(int nuevaCapacidad, boolean requiereMobiliario){
        this.capacidadMaxima = nuevaCapacidad;
        if(requiereMobiliario){
            this.identificador += "[Mobiliario especial]";
        }
    }
}
package Modelo;

public class Servicio {
    private String nombre;
    private double precioBase;
    
    public Servicio(String nombre, double precioBase)
    {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public String getNombre(){ return nombre; }

    public double getPrecioBase(){ return precioBase; }

    public void setNombre(String nombre){ this.nombre = nombre; }

    public void setPrecioBase(double precioBase){ this.precioBase = precioBase; }
}

package Modelo;

public class Servicio {
    private String nombre;
    private float precioBase;
    
    public Servicio(String nombre, float precioBase)
    {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public String getNombre(){ return nombre; }

    public float getPrecioBase(){ return precioBase; }

    public void setNombre(String nombre){ this.nombre = nombre; }

    public void setPrecioBase(float precioBase){ this.precioBase = precioBase; }
}

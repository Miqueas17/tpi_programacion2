package Modelo;

public class Turno {
    private Planilla fecha;
    private Cliente cliente;
    private Profesional profesional;
    private Servicio servicio;
    
    public Turno(Planilla fecha, Cliente cliente, Profesional profesional, Servicio servicio)
    {
        this.fecha = fecha;
        this.cliente = cliente;
        this.profesional = profesional;
        this.servicio = servicio;
    }

    public Planilla getFecha(){ return fecha; }

    public Cliente getCliente(){ return cliente; }

    public Profesional getProfesional(){ return profesional; }

    public Servicio getServicio(){ return servicio; }

    public void setFecha(Planilla fecha){ this.fecha = fecha; }
    
    public void setCliente(Cliente cliente){ this.cliente = cliente; }

    public void setProfesional(Profesional profesional){ this.profesional = profesional; }

    public void setServicio(Servicio servicio){ this.servicio = servicio; }

}

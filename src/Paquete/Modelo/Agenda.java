package Modelo;

public class Agenda {
    private String fecha;
    private String diaDeLaSemana;
    private String hora;
    private String estado;
    
    public Agenda(String fecha, String diaDeLaSemana, String hora, String estado)
    {
        this.fecha = fecha;
        this.diaDeLaSemana = diaDeLaSemana;
        this.hora = hora;
        this.estado = "Libre";
    }

    public String getFecha(){ return fecha; }

    public String getDiaDeLaSemana(){ return diaDeLaSemana; }

    public String getHora(){ return hora; }

    public String getEstado(){ return estado; }

    public void setFecha(String fecha){ this.fecha = fecha; }

    public void setDiaDeLaSemana(String diaDeLaSemana){ this.diaDeLaSemana = diaDeLaSemana; }

    public void setHora(String hora){ this.hora = hora; }

    public void setEstado(String estado){ this.estado = estado; }
}

package Modelo;

public class Planilla {
    private String fechaDesde;
    private String fechaHasta;
    private String horaDesde;
    private String horaHasta;
    private String duracion;
    
    public Planilla(String fechaDesde, String fechaHasta, String horaDesde, String horaHasta, String duracion)
    {
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.horaDesde = horaDesde;
        this.horaHasta = horaHasta;
        this.duracion = duracion;
    }

    public String getFechaDesde(){ return fechaDesde; }

    public String getFechaHasta(){ return fechaHasta; }

    public String getHoraDesde(){ return horaDesde; }

    public String getHoraHasta(){ return horaHasta; }

    public String getDuracion(){ return duracion; }

    public void setFechaDesde(String fechaDesde){ this.fechaDesde = fechaDesde; }

    public void setFechaHasta(String fechaHasta){ this.fechaHasta = fechaHasta; }
    
    public void setHoraDesde(String horaDesde){ this.horaDesde = horaDesde;}

    public void setHoraHasta(String horaHasta){ this.horaHasta = horaHasta;}

    public void setDuracion(String duracion){ this.duracion = duracion; }


}

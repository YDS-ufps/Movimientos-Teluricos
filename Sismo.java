
/**
 * Write a description of class Sismo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sismo
{
    //Atributos
    private Municipio epicentro;
    private String magnitud;
    private double profundidad;
    private String tipo;
    private String duracion;
    private Fecha fecha;
    private Victimas victima;
    private Daño danio;
    
    public Sismo(Municipio epicentro, String magnitud, double profundidad, String tipo, String duracion, Fecha fecha, Victimas victima, Daño danio)
    {
        this.epicentro = epicentro;
        this.magnitud = magnitud;
        this.profundidad = profundidad;
        this.tipo = tipo;
        this.duracion = duracion;
        this.fecha = fecha;
        this.victima = victima;
        this.danio = danio;
    }
    
    public Municipio getEpicentro(){
        return epicentro;
    }
    public String getMagnitud(){
        return magnitud;
    }
    public double getProfundidad(){
        return profundidad;
    }
    public String getTipo(){
        return tipo;
    }
    public String getDuracion(){
        return duracion;
    }
    public Fecha getFecha(){
        return fecha;
    }
    public Victimas getVictima(){
        return victima;
    }
    public Daño getDanio(){
        return danio;
    }
    
    public void setEpicentro(Municipio epicentro){
        this.epicentro = epicentro;
    }
    public void setMagnitud(String magnitud){
        this.magnitud = magnitud;
    }
    public void setProfundidad(double profundidad){
        this.profundidad = profundidad;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setDuracion(String duracion){
        this.duracion = duracion;
    }
    public void setFecha(Fecha fecha){
        this.fecha = fecha;
    }
    public void setVictima(Victimas victima){
        this.victima = victima;
    }
    public void setDanio(Daño danio){
        this.danio = danio;
    }
    
    
    public void agregarVictima(Victimas victimas){
        System.out.println("Nombre de la victima:" + getVictima());
    }
    
    public void agregarDaño(Daño danio){
        System.out.println("Daño:" + getDanio());
    }
    
    public Fecha getFechaHora() {
        return fecha;
    }
    
}

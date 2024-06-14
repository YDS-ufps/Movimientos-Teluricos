
/**
 * Write a description of class Victima here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Victimas
{
    //Atributos
    private String nombre;
    private int edad;
    private String genero;
    private String detalles;
    private Municipio municipio;

    
    public Victimas(String nombre, int edad, String genero, String detalles, Municipio municipio)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.detalles = detalles;
        this.municipio = municipio;
    }
    
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getGenero(){
        return genero;
    }
    public String getDetalles(){
        return detalles;
    }
    public Municipio getMunicipio(){
        return municipio;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setDetalles(String detalles){
        this.detalles = detalles;
    }
    public void setMunicipio(Municipio municipio){
        this.municipio = municipio;
    }
    
}

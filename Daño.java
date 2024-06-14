
/**
 * Write a description of class Daño here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Daño
{
    //Atributos
    private String descripcion;
    private Municipio municipio;

    public Daño()
    {
        this.municipio = municipio;
        this.descripcion = descripcion;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    public Municipio getMunicipio(){
        return municipio;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setMunicipio(Municipio municipio){
        this.municipio = municipio;
    }
    
}

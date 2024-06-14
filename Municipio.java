
/**
 * Write a description of class Municipio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Municipio
{
    //Atributos
    private String nombre;
    private Departamento departamento;
    
    public Municipio(String nombre, Departamento departamento)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.departamento = departamento;
    }
    
    public String getNombre(){
        return nombre;
    }
    public Departamento getDepartamento(){
        return departamento;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDepartamento(Departamento departamento){
        this.departamento = departamento;
    }
    
}

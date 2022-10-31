
package domain;


public class Persona {

    public static int getContadorpersona() {
        return contadorpersona;
    }

    public static void setContadorpersona(int aContadorpersona) {
        contadorpersona = aContadorpersona;
    }
    //cargamos los atributos
    
    private int idPersona;
    private static int contadorpersona;
    private String nombre ;
    
    //constructor
    
   public Persona(String nombre){
       
        this.nombre = nombre;
        //Incrementamos el contador por cada objeto nuevo
        Persona.contadorpersona++; //no utiliza el operador this
        //vamos asignar un nuevo valor ala variable idpersona
        this.idPersona = Persona.contadorpersona;
         
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    
}

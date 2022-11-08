
package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] arg){
        Persona persona1 = new Persona("osvaldo" , 57 , false);
        
        //modificar atravez de los metodos
        persona1.setNombre("JUAN iGNACIO");
        //persona1.nombre = "juan ignacio" YA NO SE PUEDE UTILIZAR
       // System.out.println("Nombre es " + persona1.nombre);//error
        System.out.println(" Persona1 su nombre es" + persona1.getNombre());
         System.out.println("Persona el resultado para su sueldo es" +persona1.getSueldo());
          System.out.println("persona para obtener el booleano " +persona1.isEliminado());
          
        
        
        
    }
}

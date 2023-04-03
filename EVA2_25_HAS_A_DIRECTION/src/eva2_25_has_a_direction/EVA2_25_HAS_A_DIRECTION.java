/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_25_has_a_direction;

/**
 *
 * @author invitado
 */
public class EVA2_25_HAS_A_DIRECTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Personas persona=new Personas();
//        
        persona.setNombre("Pedro");
        persona.setApellido("Alcachofas");
        persona.setEdad(20);
//
//        
//        
//        Direction direccion=new Direction("Industrias", 11101, "Complejo industrial Chihuahua", "31135", "Chihuahua", "Chihuahua");
//        
//        persona.setDireccion(direccion);
        
        
        //error porque el objeto no existe
        persona.imprimirDatos();
    }
    
}


class Direction{
    private String calle;
    private int numero;
    private String colonia;
    private String cp;
    private String ciudad;
    private String estado;
    
    public Direction() {
        this.calle = "--";
        this.numero = 0;
        this.colonia = "--";
        this.cp = "--";
        this.ciudad = "--";
        this.estado = "--";
    }

    public Direction(String calle, int numero, String colonia, String cp, String ciudad, String estado) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
    }
    
    
    

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    public void imprimirDatos(){
        System.out.println("Direccion: ");
        System.out.println("Calle: "+calle);
        System.out.println("Numero: "+numero);
        System.out.println("Colonia: "+colonia);
        System.out.println("Cp: "+cp);
        System.out.println("Ciudad: "+ciudad);
        System.out.println("Estado: "+estado);
    }

}

class Personas{
    private String nombre;
    private String apellido;
    private int edad;
    
    //has a
    private Direction direccion;

    
    
    
    public Personas() {
        this.nombre = "--";
        this.apellido = "--";
        this.edad = 0;
        
        //no se ha creado nada, no existe
        this.direccion = null;
    }

    public Personas(String nombre, String apellido, int edad, Direction direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direction getDireccion() {
        return direccion;
    }

    public void setDireccion(Direction direccion) {
        this.direccion = direccion;
    }
    
    public void imprimirDatos(){
        System.out.println("Persona:");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        
        if(direccion==null){
            System.out.println("Sin direccion");
        }else{
            direccion.imprimirDatos();
            
        }
        
    }
    
}


class Sucursal{
    private String nombreSucursal;
    private Direction direccion;
    
}
package persona;

public class Persona {
    private static int contadorPersona = 0;
    private int idPersona;
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        
        //incrementar el atributo estatico
        //Persona.contadorPersona++;
        
        //asignamos el id unico con la variable estatica
        this.idPersona = ++Persona.contadorPersona;
    }

    @Override
    public String toString() {
        return "ID: "+this.idPersona
                +", Nombre: "+this.nombre 
                + ", Apellido: "+this.apellido
                + super.toString();
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public static int getContadorPersona(){
        return Persona.contadorPersona;
    }
}

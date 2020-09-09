package classroom;

public class Persona {

    long cedula = 0;
    String nombre;
    static int totalPersonas= 0;



    Persona(){
        this.cedula=0;
        totalPersonas++;
    }
    Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    Persona(String nombre) {
        this.nombre = nombre;
        totalPersonas++;
        this.cedula=1;
    }
    
    long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }
}

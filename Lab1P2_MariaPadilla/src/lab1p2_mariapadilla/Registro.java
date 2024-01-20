
package lab1p2_mariapadilla;

import java.util.Date;


public class Registro {
    String nombre,apellido,fecha,correo,contra;

    public Registro(String nombre, String apellido, String fecha, String correo, String contra) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.correo = correo;
        this.contra = contra;
    }

    public Registro() {
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return //"Registro[" + "nombre= " + nombre + ", apellido=" + apellido + , fecha=" + fecha + ", correo=" + correo + ", contra=" + contra + ']';"
                "Nombre: "+nombre+"\n"+"Apellido: "+apellido+"\n"+"Fecha: "+fecha+"\n"+"Correo: "+correo+"\n"+"Contra: "+contra+"\n";
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package col;

/**
 *
 * @author laura
 */
public class ColC {
    String nombre;
    String apellido;
    String dirección;
    int telefono;
    String carrera;

    public ColC() {
    }

    
    public ColC(String nombre, String apellido, String dirección, int telefono, String carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dirección = dirección;
        this.telefono = telefono;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDirección() {
        return dirección;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "\nnombre=" + nombre + "\n apellido=" + apellido + "\n direcci\u00f3n=" + dirección + "\n telefono=" + telefono + "\n carrera=" + carrera + "\n";
    }
    
    
}

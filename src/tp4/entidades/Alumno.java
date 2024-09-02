/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.entidades;

import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author gouff
 */
public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet <Materia> materias = new HashSet <> ();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return apellido + " " + nombre;
    }
    
    public void agregarMateria (Materia materia){
        if (materias.add(materia)){
            JOptionPane.showMessageDialog(null, "Se inscribio al alumno correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "El alumno ya se encuentra inscripto en esta materia.");
        }
    }
    
    public int cantMaterias (){
        return materias.size();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.legajo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return this.legajo == other.legajo;
    }
    
    
}

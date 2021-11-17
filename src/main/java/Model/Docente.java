package Model;

import java.util.ArrayList;
import java.util.HashMap;

public class Docente {
    private String regPer;
    private String cui;
    private String telefono;
    private String nombre;
    private String Apellido;
    private String email;
    private String genero;
    private String gradoAcademico;
    private int horasContratadas;
    private HashMap<String, Object> evaluacionesTrienio;

    public Docente() {
    }
    public Docente(String regPer, String cui, String telefono, String nombre, String Apellido, String email, String genero, 
            String gradoAcademico, int horasContratadas, HashMap<String, Object> evaluacionesTrienio) {
        this.regPer = regPer;
        this.cui = cui;
        this.telefono = telefono;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.email = email;
        this.genero = genero;
        this.gradoAcademico = gradoAcademico;
        this.horasContratadas = horasContratadas;
        this.evaluacionesTrienio = evaluacionesTrienio;
    }

    public String getRegPer() {
        return regPer;
    }

    public void setRegPer(String regPer) {
        this.regPer = regPer;
    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public int getHorasContratadas() {
        return horasContratadas;
    }

    public void setHorasContratadas(int horasContratadas) {
        this.horasContratadas = horasContratadas;
    }

    public HashMap<String, Object> getEvaluacionesTrienio() {
        return evaluacionesTrienio;
    }

    public void setEvaluacionesTrienio(HashMap<String, Object> evaluacionesTrienio) {
        this.evaluacionesTrienio = evaluacionesTrienio;
    }
    

    
    
    
    


    

    
    
    
    
    
}

package Model;

import java.util.ArrayList;
import java.util.HashMap;

public class Titular extends Docente {

    private String fechaIngreso;
    private String fechaPromocion;
    private String titularidad;
    private HashMap<String, Object> plazas;
    private ArrayList<String> otrosCargos;
    private ArrayList<String> observaciones;
    private ArrayList<String> licenciagoce;
    private ArrayList<String> licenciaSingoce;

    public Titular() {
    }

    public Titular(String fechaIngreso, String fechaPromocion, String titularidad, HashMap<String, Object> plazas, ArrayList<String> otrosCargos,
            ArrayList<String> observaciones, ArrayList<String> licenciagoce, ArrayList<String> licenciaSingoce, String regPer, String cui, 
            String telefono, String nombre, String Apellido, String email, String genero, String gradoAcademico, int horasContratadas, 
            HashMap<String, Object> evaluacionesTrienio) {
        super(regPer, cui, telefono, nombre, Apellido, email, genero, gradoAcademico, horasContratadas, evaluacionesTrienio);
        this.fechaIngreso = fechaIngreso;
        this.fechaPromocion = fechaPromocion;
        this.titularidad = titularidad;
        this.plazas = plazas;
        this.otrosCargos = otrosCargos;
        this.observaciones = observaciones;
        this.licenciagoce = licenciagoce;
        this.licenciaSingoce = licenciaSingoce;
    }
    

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaPromocion() {
        return fechaPromocion;
    }

    public void setFechaPromocion(String fechaPromocion) {
        this.fechaPromocion = fechaPromocion;
    }

    public String getTitularidad() {
        return titularidad;
    }

    public void setTitularidad(String titularidad) {
        this.titularidad = titularidad;
    }

    public HashMap<String, Object> getPlazas() {
        return plazas;
    }

    public void setPlazas(HashMap<String, Object> plazas) {
        this.plazas = plazas;
    }

    public ArrayList<String> getOtrosCargos() {
        return otrosCargos;
    }

    public void setOtrosCargos(ArrayList<String> otrosCargos) {
        this.otrosCargos = otrosCargos;
    }

    public ArrayList<String> getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(ArrayList<String> observaciones) {
        this.observaciones = observaciones;
    }

    public ArrayList<String> getLicenciagoce() {
        return licenciagoce;
    }

    public void setLicenciagoce(ArrayList<String> licenciagoce) {
        this.licenciagoce = licenciagoce;
    }

    public ArrayList<String> getLicenciaSingoce() {
        return licenciaSingoce;
    }

    public void setLicenciaSingoce(ArrayList<String> licenciaSingoce) {
        this.licenciaSingoce = licenciaSingoce;
    }

    

}

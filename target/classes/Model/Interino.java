package Model;

import java.util.ArrayList;
import java.util.HashMap;

public class Interino extends Docente{

    public Interino() {
    }

    public Interino(String regPer, String cui, String telefono, String nombre, String Apellido, String email,
            String genero, String gradoAcademico, int horasContratadas, HashMap<String, Object> evaluacionesTrienio) {
        
        super(regPer, cui, telefono, nombre, Apellido, email, genero, gradoAcademico, horasContratadas, evaluacionesTrienio);
    }
    
    
    
}

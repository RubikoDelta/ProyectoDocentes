package Model;
/*POJO CREADO UNICAMENTE PARA PODER GUARDAR Y RECUPERAR DE UNA MEJOR MANERA 
  UNICAMENTE LOS DATOS DE INICIO DE SESION*/
public class Usuario {
    private String registroPersonal;
    private String password;
    private boolean administrador;

    public Usuario() {
    }

    public Usuario(String registroPersonal, String password, boolean administrador) {
        this.registroPersonal = registroPersonal;
        this.password = password;
        this.administrador = administrador;
    }

    public String getRegistroPersonal() {
        return registroPersonal;
    }

    public void setRegistroPersonal(String registroPersonal) {
        this.registroPersonal = registroPersonal;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    
   
}

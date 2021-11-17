package Conexion;

import Model.Docente;
import Model.Interino;
import Model.Titular;
import Model.Usuario;
import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {

    static Firestore db = null;
    private static Docente result;

    public Conexion() {
    }

    public static void Conectar() throws IOException {

        FileInputStream serviceAccount
                = new FileInputStream("biblioteca-docente-3c15f-firebase-adminsdk-4qnas-46a93ea9b5.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://biblioteca-docente-3c15f-default-rtdb.firebaseio.com")
                .build();

        FirebaseApp.initializeApp(options);
        db = FirestoreClient.getFirestore();
        System.out.println("Exito");

    }

    public static boolean InsertarDocente(String nameCollection, String identidicador, Docente data) {

        try {
            DocumentReference docRef = db.collection(nameCollection).document(identidicador);
            ApiFuture<WriteResult> result = docRef.set(data);
            return true;
        } catch (Exception e) {
            System.err.println(e);
        }

        return false;
    }

    public static Titular obtenerDatosTitular(String regPersonal) {
        try {
            
            DocumentReference docRef = db.collection("Titular").document(regPersonal);
            // asynchronously retrieve the document
            ApiFuture<DocumentSnapshot> future = docRef.get();
            // block on response
            DocumentSnapshot document = future.get();
            Titular docenteT = null;
            if (document.exists()) {
                // convert document to POJO
                docenteT = document.toObject(Titular.class);
                return docenteT;
            } else {
                return null;
            }
        } catch (InterruptedException | ExecutionException ex) {
            System.err.println(ex);
        }

        return null;
    }

    public static boolean elimnarTitular(String regPersonal) {

        // asynchronously delete a document
        ApiFuture<WriteResult> writeResult = db.collection("Titular").document(regPersonal).delete();
        // ...
             
        return true;
        
    }

    
    public static Interino obtenerDatosInterino(String regPersonal) {
        try {
            DocumentReference docRef = db.collection("Interino").document(regPersonal);
            // asynchronously retrieve the document
            ApiFuture<DocumentSnapshot> future = docRef.get();
            // block on response
            DocumentSnapshot document = future.get();
            Interino docenteI = null;
            if (document.exists()) {
                // convert document to POJO
                docenteI = document.toObject(Interino.class);
                return docenteI;
            } else {
                return null;
            }
        } catch (InterruptedException | ExecutionException ex) {
            System.err.println(ex);
        }

        return null;
    }
    
    public static boolean elimnarInterino(String regPersonal) {

        // asynchronously delete a document
        ApiFuture<WriteResult> writeResult = db.collection("Interino").document(regPersonal).delete();
        // ...
        JOptionPane.showMessageDialog(null, "SE HA ELIMINADO EL DOCENTE");
        
        return true;
        
    }
    
        public static Usuario obtenerCredencialesUser(String regPersonal) {
        try {
            DocumentReference docRef = db.collection("Usuarios").document(regPersonal);
            ApiFuture<DocumentSnapshot> future = docRef.get();
            DocumentSnapshot document = future.get();
            Usuario usuario = null;
            if (document.exists()) {
                // convert document to POJO
                usuario = document.toObject(Usuario.class);
                return usuario;
            } else {
                return null;
            }
        } catch (InterruptedException | ExecutionException ex) {
            System.err.println(ex);
        }
        return null;
    }
        
    public static boolean IngresarUsuario( String identidicador, Usuario data) {
        try {
            DocumentReference docRef = db.collection("Usuarios").document(identidicador);
            ApiFuture<WriteResult> result = docRef.set(data);
            System.out.println("Se ha guardado el usuario en la coleccion usuarios");
            return true;
        } catch (Exception e) {
            System.err.println(e);
        }
        return false;
    }
}

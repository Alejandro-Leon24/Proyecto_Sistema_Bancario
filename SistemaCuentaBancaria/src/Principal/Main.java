package Principal;
import GUIE.Login;
import Logica.Usuario;
import java.util.Calendar;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;


public class Main {
    public static HashMap<String, Usuario> Usuarios = new HashMap<>();
    public static String usuarioActivo;
    public static void main(String[] args) {

        try {
        //Inicio la ventana principal que es el login
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
    } catch (UnsupportedLookAndFeelException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
        Login run = new Login();
        
        run.setVisible(true);

    }
    
    public static java.sql.Date  FechaActual()  {
        // Obtener la fecha actual del sistema
        Calendar calendario = Calendar.getInstance();
        long tiempoActual = calendario.getTimeInMillis();

        // Crear un objeto java.sql.Date a partir del tiempo actual
        java.sql.Date fechaActual = new java.sql.Date(tiempoActual);

        return fechaActual;
    }
    
    public static int calcularEdad(java.sql.Date fechaNacimiento, java.sql.Date fechaActual) {
        // Convertir las fechas en objetos Calendar
        Calendar calendarioNacimiento = Calendar.getInstance();
        calendarioNacimiento.setTime(fechaNacimiento);

        Calendar calendarioActual = Calendar.getInstance();
        calendarioActual.setTime(fechaActual);

        int edad = calendarioActual.get(Calendar.YEAR) - calendarioNacimiento.get(Calendar.YEAR);

        // Verificar si el día de nacimiento ya ha ocurrido este año
        if (calendarioActual.get(Calendar.DAY_OF_YEAR) < calendarioNacimiento.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }

        return edad;
    }
}

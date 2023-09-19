import java.util.regex.Matcher;
import java.util.regex.Pattern;
//libreria que no sirve
/*no supe como implementarla en el programa */
public class Libreria {
    /*METODOS */

    public boolean validarCorreoElectronico(String correo) {
        // Patrón de expresión regular para validar un correo electrónico
        String patronCorreo = "^[A-Za-z0-9+_.-]+@(.+)$";

        // Compilar el patrón en un objeto Pattern
        Pattern pattern = Pattern.compile(patronCorreo);

        // Crear un objeto Matcher para comparar el correo con el patrón
        Matcher matcher = pattern.matcher(correo);

        // Verificar si el correo coincide con el patrón
        return matcher.matches();
    }
}

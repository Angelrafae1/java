import java.util.ArrayList;
import java.util.Scanner;

public class lectura {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un ArrayList para almacenar usuarios
        ArrayList<Personas> usuarios = new ArrayList<>();

        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Registrarse");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine(); // Limpia el buffer del Enter
                    System.out.print("Ingrese su correo: ");
                    String correoInicioSesion = scanner.nextLine();
                    System.out.print("Ingrese su contraseña: ");
                    String contrasenaInicioSesion = scanner.nextLine();

                    // Verificar el inicio de sesión
                    boolean inicioSesionExitoso = false;
                    for (Personas usuario : usuarios) {
                        if (usuario.getCorreo().equals(correoInicioSesion) && usuario.getPassword().equals(contrasenaInicioSesion)) {
                            System.out.println("Inicio de sesión exitoso. ¡Bienvenido, " + usuario.getNombre() + "!");
                            inicioSesionExitoso = true;
                            break;
                        }
                    }
                    if (!inicioSesionExitoso) {
                        System.out.println("Inicio de sesión fallido. Correo o contraseña incorrectos.");
                    }
                    break;
                case 2:
                    scanner.nextLine(); // Limpia el buffer del Enter
                    System.out.print("Ingrese su nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese su apellido paterno: ");
                    String apep = scanner.nextLine();
                    System.out.print("Ingrese su apellido materno: ");
                    String apem = scanner.nextLine();
                    System.out.print("Ingrese su sexo: ");
                    String sexo = scanner.nextLine();
                    System.out.print("Ingrese su dirección: ");
                    String dir = scanner.nextLine();
                    System.out.print("Ingrese su edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine(); // Limpia el buffer del Enter
                    System.out.print("Ingrese su correo: ");
                    String correo = scanner.nextLine();
                    System.out.print("Ingrese su contraseña: ");
                    String password = scanner.nextLine();
                    System.out.print("Ingrese su número de teléfono: ");
                    String tel = scanner.nextLine();

                    // Crear un nuevo usuario y agregarlo a la lista
                    Personas nuevoUsuario = new Personas(nombre, apep, apem, sexo, dir, edad, correo, password, tel);
                    usuarios.add(nuevoUsuario);

                    System.out.println("Registro exitoso. ¡Bienvenido, " + nuevoUsuario.getNombre());
                    break;
                case 3:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}


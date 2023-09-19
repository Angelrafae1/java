import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class Leer {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        Libreria manera=new Libreria();
        ArrayList<Personas> User = new ArrayList<>(); // ArrayList para almacenar usuarios o un arreglo dinamico//fue mas facil asi
        int opcion = 0;
        boolean entradaValida = false;
        //hace lo siguiente mientras que el usuario no ingrese el numero 3
        while (opcion != 3) {
            //! representa lo contrario o en pocas palabras si la entrada es verdadera terminara el proceso
            while (!entradaValida) {
                //el try es para validar la entrada de un dato y que este no tenga un error al ingresar un dato no numerico
                try {
                    System.out.println("---------------------------");
                    System.out.println("| Escribe lo que deseas hacer |");
                    System.out.println("| 1) Iniciar sesión         |");
                    System.out.println("| 2) Registrarse            |");
                    System.out.println("| 3) Salir                  |");
                    System.out.println("---------------------------");

                    opcion = dato.nextInt();
                    dato.nextLine(); // Limpia el buffer del Enter
                    entradaValida = true; // Si no se lanzó una excepción, la entrada es válida
                } 
                //el catch es paar que este no explote al ingresar un valor no numerico(para eso sirve el inputmismatchexception)
                catch (InputMismatchException e) {
                    System.out.println("Error: Ingresa un valor válido.");
                    dato.nextLine(); // Limpia el buffer del Enter
                }
            }

            switch (opcion) {
                case 1:
                //pide el ingreso del correo
                    System.out.print("Ingrese su correo: ");
                    String correoInicioSesion = dato.nextLine();
                
                    //ingreso de contrasena
                    System.out.print("Ingrese su contraseña: ");
                    String contrasenaInicioSesion = dato.nextLine();

                    // Verificar el inicio de sesión
                    boolean inicioSesionExitoso = false;
                    for (Personas usuario : User) {
                        //si el inicio de secion es correcto entonces muestra el nombre del usuario
                        if (usuario.getCorreo().equals(correoInicioSesion) && usuario.getPassword().equals(contrasenaInicioSesion)) {
                            System.out.println("Inicio de sesión exitoso. ¡Bienvenido, " + usuario.getNombre()+" "+usuario.getApep()+" "+usuario.getApem());
                            inicioSesionExitoso = true;
                            break;
                        }
                    }
                    //es caso contrario muestra un mensaje de error
                    if (!inicioSesionExitoso) {
                        System.out.println("Inicio de sesión fallido. Correo o contraseña incorrectos.");
                    }
                    break;

                case 2:
                //rellena los datos solicitados
                System.out.print("Ingrese su nombre: ");
                String nombre = dato.nextLine();
                System.out.print("Ingrese su apellido paterno: ");
                String apep = dato.nextLine();
                System.out.print("Ingrese su apellido materno: ");
                String apem = dato.nextLine();
                System.out.print("Ingrese su sexo: ");
                String sexo = dato.nextLine();
                System.out.print("Ingrese su dirección: ");
                String dir = dato.nextLine();
        
                int edad = 0;
                boolean edadValida = false;
                while (!edadValida) {
                    try {
                        System.out.print("Ingrese su edad: ");
                        edad = dato.nextInt();
                        dato.nextLine();
                        edadValida = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Ingresa una edad válida.");
                        dato.nextLine(); // Limpia el buffer del Enter
                    }
                }
                System.out.print("Ingrese su número de teléfono: ");
                String tel = dato.nextLine();
                System.out.print("Ingrese su correo: ");
                String correo = dato.nextLine();
                System.out.print("Ingrese su contraseña: ");
                String password = dato.nextLine();


                // Crea un nuevo usuario y lo agregar a la lista
                Personas nuevoUsuario = new Personas(nombre, apep, apem, sexo, dir, edad, correo, password, tel);
                User.add(nuevoUsuario);

                System.out.println("Registro exitoso. ¡Bienvenido, " + nuevoUsuario.getNombre() + "!");
                    break;

                case 3:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

            entradaValida = false; // Restablece la bandera de entrada válida para el próximo ciclo
        }

        dato.close();
    }
}

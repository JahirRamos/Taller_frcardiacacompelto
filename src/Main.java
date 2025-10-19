import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**Creamos el nuevo objeto*/
        Scanner sc = new Scanner(System.in);
        FrecuenciasCardiacas persona = new FrecuenciasCardiacas();
        /**El usuario ingresara los datos por teclado*/
        System.out.println("Bienvenido al programa Calculadora de Frecuencia Cardíaca");
        System.out.print("Ingrese su nombre: ");
        persona.setNombre(sc.nextLine());
        System.out.print("Ingrese su apellido: ");
        persona.setApellido(sc.nextLine());
        System.out.print("Ingrese su año de nacimiento: ");
        persona.setAnioNacimiento(sc.nextInt());
        System.out.print("Ingrese su mes de nacimiento: ");
        persona.setMesNacimiento(sc.nextInt());
        System.out.print("Ingrese su día de nacimiento: ");
        persona.setDiaNacimiento(sc.nextInt());

        /**LLamamos las funciones*/
        persona.detalle();
        int edad = persona.calcularEdad();
        persona.mostrarFrecuenciaEsperada(edad);

    }
}

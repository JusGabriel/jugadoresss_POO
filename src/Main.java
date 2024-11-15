import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del portero: ");
        String nombrePortero = scanner.nextLine();
        System.out.println("Ingrese la edad del portero: ");
        int edadPortero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el nombre del equipo del portero: ");
        String equipoPortero = scanner.nextLine();
        System.out.println("Ingrese la cantidad de atajadas del portero: ");
        int atajadas = scanner.nextInt();
        System.out.println("Ingrese la cantidad de goles recibidos por el portero: ");
        int golesRecibidos = scanner.nextInt();
        scanner.nextLine();

        Jugador.Portero portero = new Jugador.Portero(nombrePortero, edadPortero, equipoPortero, atajadas, golesRecibidos);

        System.out.println("Ingrese el nombre del defensa: ");
        String nombreDefensa = scanner.nextLine();
        System.out.println("Ingrese la edad del defensa: ");
        int edadDefensa = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el nombre del equipo del defensa: ");
        String equipoDefensa = scanner.nextLine();
        System.out.println("Ingrese la cantidad de bloqueos del defensa: ");
        int bloqueos = scanner.nextInt();
        scanner.nextLine();

        Jugador.Defensa defensa = new Jugador.Defensa(nombreDefensa, edadDefensa, equipoDefensa, bloqueos);

        System.out.println("Ingrese el nombre del delantero: ");
        String nombreDelantero = scanner.nextLine();
        System.out.println("Ingrese la edad del delantero: ");
        int edadDelantero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el nombre del equipo del delantero: ");
        String equipoDelantero = scanner.nextLine();

        Jugador.Delantero delantero = new Jugador.Delantero(nombreDelantero, edadDelantero, equipoDelantero);

        System.out.println("Informacion del Portero:");
        portero.imprimir();
        System.out.println();

        System.out.println("Informacion del Defensa:");
        defensa.imprimir();
        System.out.println();

        System.out.println("Informacion del Delantero:");
        delantero.imprimir();
    }
}

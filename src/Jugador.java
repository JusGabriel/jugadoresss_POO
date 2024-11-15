public class Jugador {
    protected String nombre;
    protected int edad;
    protected String equipo;

    public Jugador(String nombre, int edad, String equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = equipo;
    }

    public void imprimir() {
        System.out.println("El nombre del equipo es: " + nombre);
        System.out.println("La edad del jugador es:" + edad);
        System.out.println("El equipo en el que juega es:" + equipo);
    }

    static class Portero extends Jugador {
        protected int atajadas;
        protected int golesRecibidos;

        public Portero(String nombre, int modelo, String equipo, int atajadas, int golesRecibidos) {
            super(nombre, modelo, equipo);
            this.atajadas = atajadas;
            this.golesRecibidos = golesRecibidos;
        }

        @Override
        public void imprimir() {
            super.imprimir();
            System.out.println("Cantidad de atajadas reakizadas: "+atajadas);
            System.out.println("Cantidad de goles recibidos: "+golesRecibidos);
        }
    }

    static class Defensa extends Jugador {
            protected int bloqueos;

        public Defensa(String nombre, int edad, String equipo, int bloqueos) {
            super( nombre, edad, equipo);
            this.bloqueos = bloqueos;
        }

        @Override
        public void imprimir() {
            super.imprimir();
            System.out.println("Cantidad de bloqueos realizados: "+bloqueos);
        }
    }

    static class Delantero extends Jugador {
        public Delantero (String nombre, int edad, String equipo){
            super(nombre, edad, equipo);
        }

        @Override
        public void imprimir() {
            super.imprimir();
        }
    }
}

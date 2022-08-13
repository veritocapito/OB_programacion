public class Main {
    public static void main(String[] args) {
        System.out.println("Practicando Herencia");
        Cliente cliente = new Cliente();

        cliente.setNombre("Veronica");
        cliente.setEdad(41);
        cliente.setTelefono(45671284);
        cliente.setCredito(150000);

        System.out.println(cliente.getNombre());
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());
    }
}
    class Persona {
        public String nombre;
        public int edad;
        public int telefono;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
        public int getTelefono() {
            return telefono;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }
    }
    class Cliente extends Persona {
        private double credito;

        public double getCredito() {
            return credito;
        }

        public void setCredito(double credito) {
            this.credito = credito;
        }
    }

    class Trabajador extends Persona{
        private double salario;

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }
    }
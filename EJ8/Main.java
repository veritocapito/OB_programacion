public class Main {
    public static void main(String[] args) {
        System.out.println("Aprendiendo clases");
        Persona persona = new Persona();

        persona.setName("Veronica");
        persona.setEdad(41);
        persona.setTelefono(45671284);

        System.out.println(persona.getName());
        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());
    }
}
    class Persona {
        private String name;
        private int edad;
        private int telefono;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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


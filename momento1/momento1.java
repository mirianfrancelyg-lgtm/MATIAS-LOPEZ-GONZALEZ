public class momento1 {

    private String documento;
    private String nombre;
    private int edad;

    public momento1(String documento, String nombre, int edad) {
        this.documento = documento;
        this.nombre = nombre;
        setEdad(edad);
    }

    public momento1() {
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

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
        if (edad < 0) {
            System.out.println("Edad no valida, se asigna 0.");
            this.edad = 0;
        } else {
            this.edad = edad;
        }
    }
}
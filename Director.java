import java.util.ArrayList;

public class Director {

    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Calificacion> calificaciones;

    public Director() {
        estudiantes = new ArrayList<>();
        calificaciones = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void agregarCalificacion(Calificacion calificacion) {
        calificaciones.add(calificacion);
    }

    public void mostrarEstudiantes() {

        System.out.println("LISTA DE ESTUDIANTES");

        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }

    public void mostrarCalificaciones() {

        System.out.println("CALIFICACIONES");

        for (Calificacion calificacion : calificaciones) {
            System.out.println(calificacion);
        }
    }

    public double calcularPromedio() {

        if (calificaciones.isEmpty()) {
            return 0;
        }

        double suma = 0;

        for (Calificacion calificacion : calificaciones) {
            suma += calificacion.getNota();
        }

        return suma / calificaciones.size();
    }

    public void buscarPerdedores() {

        System.out.println("MATERIAS PERDIDAS");

        for (Calificacion calificacion : calificaciones) {

            if (calificacion.getNota() < 3.0) {

                System.out.println(
                    calificacion.getMateria()
                    + " - Nota: "
                    + calificacion.getNota()
                );
            }
        }
    }
}

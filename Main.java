public class Main {

    public static void main(String[] args) {

        Director director = new Director();

        Estudiante estudiante1 = new Estudiante("Matias Lopez", "001");
        Estudiante estudiante2 = new Estudiante("Jeronimo Castaño", "002");
        Estudiante estudiante3 = new Estudiante("Esteban Munera", "003");
        Estudiante estudiante4 = new Estudiante("Mariana Hincapie", "004");

        director.agregarEstudiante(estudiante1);
        director.agregarEstudiante(estudiante2);
        director.agregarEstudiante(estudiante3);
        director.agregarEstudiante(estudiante4);

        Calificacion nota1 = new Calificacion("Matematicas", 4.5);
        Calificacion nota2 = new Calificacion("Espanol", 3.8);
        Calificacion nota3 = new Calificacion("Ingles", 2.5);
        Calificacion nota4 = new Calificacion("Fisica", 2.0);

        director.agregarCalificacion(nota1);
        director.agregarCalificacion(nota2);
        director.agregarCalificacion(nota3);
        director.agregarCalificacion(nota4);

        director.mostrarEstudiantes();

        director.mostrarCalificaciones();

        System.out.println(
            "Promedio general: " + director.calcularPromedio()
        );

        director.buscarPerdedores();
    }
}
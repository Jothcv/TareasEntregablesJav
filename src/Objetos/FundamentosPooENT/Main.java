package Objetos.FundamentosPooENT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaNacimiento1 = null;
        Date fechaNacimiento2 = null;
        try {
            fechaNacimiento1 = dateFormat.parse("2000-01-01");
            fechaNacimiento2 = dateFormat.parse("2001-02-02");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Estudiante estudiante1 = new Estudiante(1, "Juan", "Perez", fechaNacimiento1, "matriculado");
        Estudiante estudiante2 = new Estudiante(2, "Ana", "Gomez", fechaNacimiento2, "matriculado");

        Curso curso1 = new Curso(101, "Matematicas", "Curso de matematicas ", 3, "1.0");
        Curso curso2 = new Curso(102, "Historia", "Curso de historia mundial", 4, "1.0");

        GestorAcademico gestor = new GestorAcademico();

        gestor.matricularEstudiante(estudiante1);
        gestor.matricularEstudiante(estudiante2);

        gestor.agregarCurso(curso1);
        gestor.agregarCurso(curso2);

        try {
            gestor.inscribirEstudianteCurso(estudiante1, 101);
            gestor.inscribirEstudianteCurso(estudiante2, 102);

            gestor.inscribirEstudianteCurso(estudiante1, 101);
        } catch (EstudianteYaInscritoException e) {
            System.out.println(e.getMessage());
        }

        try {
            gestor.desinscribirEstudianteCurso(1, 101);
            gestor.desinscribirEstudianteCurso(2, 102);

            gestor.desinscribirEstudianteCurso(1, 101);
        } catch (EstudianteNoInscritoEnCursoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("estudiantes matriculados: ");
        for (Estudiante estudiante : gestor.getEstudiantes()) {
            System.out.println(estudiante);
        }

        System.out.println("\nlos cursos disponibles son: ");
        for (Curso curso : gestor.getCursos()) {
            System.out.println(curso);
        }

        System.out.println("\ninscripciones en Ciem xd");
        for (Curso curso : gestor.getInscripciones().keySet()) {
            System.out.println("Curso: " + curso.getNombre() + " - Estudiantes inscritos:");
            for (Estudiante estudiante : gestor.getInscripciones().get(curso)) {
                System.out.println(estudiante);
            }
        }
    }
}

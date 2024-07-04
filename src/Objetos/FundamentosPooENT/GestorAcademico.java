package Objetos.FundamentosPooENT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GestorAcademico implements ServiciosAcademicosI {
    private List<Estudiante> estudiantes;
    private List<Curso> cursos;
    private HashMap<Curso, List<Estudiante>> inscripciones;

    public GestorAcademico() {
        this.estudiantes = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.inscripciones = new HashMap<>();
    }

    @Override
    public void matricularEstudiante(Estudiante estudiante) {
        if (!estudiantes.contains(estudiante)) {
            estudiantes.add(estudiante);
        }
    }

    @Override
    public void agregarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
        }
    }

    @Override
    public void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) throws EstudianteYaInscritoException {
        Curso curso = buscarCursoPorId(idCurso);
        if (curso != null) {
            List<Estudiante> listaEstudiantes = inscripciones.getOrDefault(curso, new ArrayList<>());
            if (listaEstudiantes.contains(estudiante)) {
                throw new EstudianteYaInscritoException("estudiante ya inscrito en este curso");
            } else {
                listaEstudiantes.add(estudiante);
                inscripciones.put(curso, listaEstudiantes);
            }
        }
    }

    @Override
    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) throws EstudianteNoInscritoEnCursoException {
        Curso curso = buscarCursoPorId(idCurso);
        if (curso != null) {
            List<Estudiante> listaEstudiantes = inscripciones.get(curso);
            if (listaEstudiantes != null) {
                Estudiante estudiante = buscarEstudiantePorId(idEstudiante);
                if (estudiante != null && listaEstudiantes.contains(estudiante)) {
                    listaEstudiantes.remove(estudiante);
                } else {
                    throw new EstudianteNoInscritoEnCursoException("estudiante no escrito al curso");
                }
            } else {
                throw new EstudianteNoInscritoEnCursoException("el id es invalido");
            }
        } else {
            throw new EstudianteNoInscritoEnCursoException("la id del curso es invalido");
        }
    }

    private Curso buscarCursoPorId(int idCurso) {
        for (Curso curso : cursos) {
            if (curso.getId() == idCurso) {
                return curso;
            }
        }
        return null;
    }

    private Estudiante buscarEstudiantePorId(int idEstudiante) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getId() == idEstudiante) {
                return estudiante;
            }
        }
        return null;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public HashMap<Curso, List<Estudiante>> getInscripciones() {
        return inscripciones;
    }

    @Override
    public String toString() {
        return "GestorAcademico: " + "estudiantes=" + estudiantes + ", cursos=" + cursos + ", inscripciones=" + inscripciones;
    }
}


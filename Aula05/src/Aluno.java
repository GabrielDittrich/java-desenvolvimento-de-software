import java.util.Scanner;

public class Aluno {

    // Atributos de aluno
    String nome;
    String curso;
    String turno;
    String campus;

    // Construtores
    public Aluno() {
    }

    public Aluno(String nome, String curso, String turno, String campus) {
        this.nome = nome;
        this.curso = curso;
        this.turno = turno;
        this.campus = campus;
    
    }

    @Override
    public String toString() {

        String txt = "Nome: " + nome +
                "\nCurso: " + curso +
                "\nTurno: " + turno +
                "\nCampus: " + campus;

        return txt;
    }
}
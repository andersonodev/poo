package control;

import model.Disciplina;
import model.Professor;
import model.Turma;

public class Programa {
    public static void main(String[] args) {

        Disciplina poo = new Disciplina("IBM0513", "Programação oo", 80);
        Disciplina engDados = new Disciplina("IBM1234", "Engenharia de Dados", 80);

        Professor profAnderson = new Professor("987", "Anderson silva", "Mestre");
        Professor profThiago = new Professor("123", "Thiago souza", "Doutor");
        Professor profTalita = new Professor("001", "Talita Vieiraa", "Doutora");

        Turma engDadosAnderson = new Turma("CDIA003", "Terça-feira", "M1 a M4", "209", profAnderson, engDados);
        Turma pooSemProf = new Turma("CDIA001", "quinta-feira", "M1 a M4", "302", poo);
        Turma pooThiago = new Turma("CDIA002", "quarta-feira", "T1 a T4", "302", profThiago, poo);

        profThiago.addTurma(pooThiago);
        profAnderson.addTurma(engDadosAnderson);
        profTalita.addTurma(pooSemProf);

        pooSemProf.setProfessor(profTalita);

//        System.out.println(pooThiago.getProfessor().getNome());
//
//       for (Turma turma : profThiago.getTurma()) {
//           System.out.println(turma.getDisciplina().getNome());
//       }
//
//       // Quais as disciplinas de um determinado professor?
//        for (Turma turma : profTalita.getTurma()) {
//            System.out.println(turma.getDisciplina().getNome());
//        }


        poo.addTurma(pooThiago);
        poo.addTurma(pooSemProf);


        //Quais professores minsitram a disciplina POO?
        for (Turma turma : poo.getTurmas()) {
            System.out.println(turma.getProfessor().getNome());
        } 




    }
}

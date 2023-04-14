package exercise.lista.ex20;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Contato contato = new Contato(11321321,"Felipe");
        Contato contatoSmall = new Contato(343232,"Small");
        agenda.addContatos(contato);
        agenda.addContatos(contatoSmall);
        System.out.println(agenda.getContatos().toString());
        agenda.removeContatos(contato);
        System.out.println(agenda.getContatos().toString());



    }
}

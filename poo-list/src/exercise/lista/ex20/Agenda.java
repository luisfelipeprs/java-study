package exercise.lista.ex20;

import java.util.ArrayList;

public class Agenda {
    ArrayList <Contato> contatos = new ArrayList<>();
    public Agenda() {
    }

    public Agenda(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }
    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }
    public void addContatos(Contato contato){

        contatos.add(contato);

    }
    public void removeContatos(Contato contato){

        contatos.remove(contato);


    }



}

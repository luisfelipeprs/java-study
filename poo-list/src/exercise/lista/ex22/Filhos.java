package exercise.lista.ex22;

import java.util.ArrayList;
import java.util.Arrays;

public class Filhos extends Pessoa{
    int[] idadeArray = {
            17,
            25
    };

    private String[] nomeArray = {
            "Felipe",
            "Xaulin Matador de Porco"
    };


    public Filhos() {
    }

    public Filhos(int[] idadeArray, String[] nomeArray) {
        this.idadeArray = idadeArray;
        this.nomeArray = nomeArray;
    }

    public int[] getIdadeArray() {
        return idadeArray;
    }

    public String[] getNomeArray() {
        return nomeArray;
    }

    @Override
    public String toString() {
        return "Filhos{" +
                "Nome='" + nomeArray[0] +"'"+
                " Idade=" + idadeArray[0] +" - "+
                " Nome='" + nomeArray[1] +"'"+
                " Idade=" + idadeArray[1] +
                '}';
    }
}

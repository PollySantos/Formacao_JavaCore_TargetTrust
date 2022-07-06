package javacore.exemplo12visibilidades;

import javacore.exemplo12visibilidades.model.Tarefa;

public class Programa {

    public static void main(String[] args) {

        Tarefa tarefa = new Tarefa();
        //tarefa.descricao = "Fazer exercicio 1"; não vê pois é privado
//        tarefa.alterarDescricao("FAzer exercicio 2");

    }
}
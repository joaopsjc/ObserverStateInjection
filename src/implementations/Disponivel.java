/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementations;

import interfaces.livroEstado;
import modelo.Livro;

/**
 *
 * @author ice
 */
public class Disponivel implements livroEstado{

    public void emprestar(Livro livro) {
        livro.setEstadoAtual(new Emprestado());
    }

    public void disponibilizar(Livro livro) {
        System.out.println("Não é possível realizar esta ação");
    }

    public void indisponibilizar(Livro livro) {
        livro.setEstadoAtual(new Indisponivel());
    }

    public void reservar(Livro livro) {
        livro.setEstadoAtual(new Reservado());
    }

    public String getEstado() {
        return "disponível";
    }
}

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
public class Indisponivel implements livroEstado{

    public void emprestar(Livro livro) {
        System.out.println("Não é possível realizar esta ação");
    }

    public void disponibilizar(Livro livro) {
        livro.setEstadoAtual(new Disponivel());
    }

    public void indisponibilizar(Livro livro) {
        System.out.println("Não é possível realizar esta ação");
    }

    public void reservar(Livro livro) {
        System.out.println("Não é possível realizar esta ação");
    }

    public String getEstado() {
        return "indisponivel";
    }
    
}

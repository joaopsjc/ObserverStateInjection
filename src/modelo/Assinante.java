/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author ice
 */
public class Assinante implements Observer{
    private String nome;

    public Assinante(Observable livroObservado) {
        livroObservado.addObserver(this);
    }
    public void update(Observable livroSubject, Object arg1)
    {
        String livroNovoEstado;
        if(livroSubject instanceof Livro)
        {
            Livro livro = (Livro) livroSubject;
            livroNovoEstado = livro.getEstadoAtual();
            System.out.println("Atenção " + getNome() + ", o estado do"
                    + " livro " + livro.getNome() 
                    + " mudou. Seu novo estado é: " +
            livroNovoEstado);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

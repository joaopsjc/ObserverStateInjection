/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import implementations.Disponivel;
import interfaces.livroEstado;
import java.util.Observable;

/**
 *
 * @author ice
 */
public class Livro extends Observable{
    private String nome;
    private livroEstado estadoAtual;

    public Livro(String nome) {
        this.nome = nome;
        this.estadoAtual = new Disponivel();
    }

    public String getNome() {
        return nome;
    }

    public String getEstadoAtual() {
        return estadoAtual.getEstado();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void emprestar()
    {
        this.estadoAtual.emprestar(this);
    }
    public void disponibilizar()
    {
        this.estadoAtual.disponibilizar(this);
    }
    public void indisponibilizar()
    {
        this.estadoAtual.indisponibilizar(this);
    }
    public void reservar()
    {
        this.estadoAtual.reservar(this);
    }
    
    public void setEstadoAtual(livroEstado novoEstado) {
        this.estadoAtual = novoEstado;
        setChanged();
        notifyObservers();
    }
    
}

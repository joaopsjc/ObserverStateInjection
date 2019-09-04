/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import modelo.Livro;

/**
 *
 * @author ice
 */
public interface livroEstado {
    
    public void emprestar(Livro livro);
    public void disponibilizar(Livro livro);
    public void indisponibilizar(Livro livro);
    public void reservar(Livro livro);
    public String getEstado();
}

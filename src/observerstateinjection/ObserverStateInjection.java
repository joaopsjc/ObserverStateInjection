/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerstateinjection;

import modelo.Assinante;
import modelo.Livro;

/**
 *
 * @author ice
 */
public class ObserverStateInjection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro livro1 = new Livro("Vinte Mil Léguas Submarinas");
        Livro livro2 = new Livro("A Arte da Guerra");
        Assinante assinante1 = new Assinante(livro1);
        assinante1.setNome("Joao");
        Assinante assinante2 = new Assinante(livro2);
        assinante2.setNome("Pedro");
        livro1.disponibilizar();
        livro1.reservar();
        livro2.indisponibilizar();
    }
}


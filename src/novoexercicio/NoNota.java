/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novoexercicio;

/**
 *
 * @author 20181CMQ.ADS0069
 */
public class NoNota {
    
    //DECLARAÇÃO DOS ATRIBUTOS DA LISTA
    private int dado;
    private NoNota proximo;
    
    //METODO CONSTRUTOR SEM PARAMETRO
    public NoNota(){
        this.proximo = null;
    }
    
    //METODO CONSTRUTOR COM PASSAGEM DE PARAMETRO
    public NoNota(int elemento){
        this.dado = elemento;
        this.proximo = null;
    }

    //GETTERS E SETTERS
    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public NoNota getProximo() {
        return proximo;
    }

    public void setProximo(NoNota proximo) {
        this.proximo = proximo;
    }
    
}

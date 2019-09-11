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
public class NoDisciplina {
    
    //DECLARAÇÃO DOS ATRIBUTOS DA LISTA
    private String dado;
    private NoDisciplina proximo;
    
    //METODO CONSTRUTOR SEM PARAMETRO
    public NoDisciplina(){
        this.proximo = null;
    }
    
    //METODO CONSTRUTOR COM PASSAGEM DE PARAMETRO
    public NoDisciplina(String elemento){
        this.dado = elemento;
        this.proximo = null;
    }

    //GETTERS E SETTERS
    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }

    public NoDisciplina getProximo() {
        return proximo;
    }

    public void setProximo(NoDisciplina proximo) {
        this.proximo = proximo;
    }
    
}

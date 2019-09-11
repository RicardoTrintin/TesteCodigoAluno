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
public class ListaNotas {
    
    private NoNota inicio;

    public ListaNotas() {
        this.inicio = null;
    }
    
    //INSERIR ELEMENTO NO FINAL DA LISTA
    public void inserirFim(int elemento) {
        NoNota novoElemento = new NoNota(elemento);

        if (isEmpty()) {
            this.inicio = novoElemento;
        } else {
            NoNota aux = this.inicio;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(novoElemento);
        }
    }

    //INSERIR ELEMENTO NO INICIO DA LISTA
    public void insereInicio(int elemento) {
        NoNota novoElemento = new NoNota(elemento);

        novoElemento.setProximo(this.inicio);
        this.inicio = novoElemento;
    }

    //EXCLUIR ELEMTNO NO INICIO DA LISTA
    public int excluirInicio() {
        Integer elemento = null;
        if (isEmpty()) {
            System.out.println("Lista vazia!");
        } else {
            elemento = this.inicio.getDado();
            this.inicio = this.inicio.getProximo();
        }
        return elemento;
    }

    //EXCLUIR ELEMTNO NO FINAL DA LISTA
    public int excluirFim() {
        
        Integer elemento = null;
        if (isEmpty()) {
            System.out.println("Lista vazia!");
        } else {
            NoNota anterior = null;
            NoNota aux = this.inicio;
            while (aux.getProximo() != null) {
                anterior = aux;
                aux = aux.getProximo();
            }
            elemento = aux.getDado();
            anterior.setProximo(null);
        }
        return elemento;
    }
    
    //PESQUISAR POR ELEMENTO E PRINTAR O ELEMENTO + (ELEMENTO PESQUISADO: )
    public void pesquisa(int elemento){
        int flag = 0;
        if (isEmpty()){
            System.out.println("Lista vazia");
        }else{
            NoNota aux = this.inicio;
            while (aux.getProximo() != null){
                if (aux.getDado() != elemento){
                    aux = aux.getProximo();
                }else{
                    break;
                }
            }
            
            System.out.println("Elemento pesquisado foi: "+aux.getDado());
        }
    }
    
    //PESQUISAR POR ELEMENTO PRINTANDO APENAS O ELEMTNO
    public void pesquisaSP(int elemento){
        int flag = 0;
        if (isEmpty()){
            System.out.println("Lista vazia");
        }else{
            NoNota aux = this.inicio;
            while (aux.getProximo() != null){
                if (aux.getDado() != elemento){
                    aux = aux.getProximo();
                }else{
                    break;
                }
            }
            
            System.out.println(aux.getDado());
        }
    }

    //PRINTAR NA TELA TODOS OS ELEMENTOS DA MINHA LISTA
    public void print() {
        if (isEmpty()) {
            System.out.println("Lista vazia");
        } else {
            NoNota aux = this.inicio;

            while (aux != null) {
                if (aux.getProximo() != null) {
                    System.out.println("Elemento: " + aux.getDado() + " quem é teu proximo?" + aux.getProximo().getDado());
                } else {
                    System.out.println("Elemento: " + aux.getDado() + " quem é teu proximo?" + aux.getProximo());
                }
                aux = aux.getProximo();
            }
        }
    }

    //VERIFICAR SE MINHA LISTA ESTA VAZIA
    public boolean isEmpty() {
        return (this.inicio == null);
    }
    
}

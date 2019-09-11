/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novoexercicio;

import javax.xml.crypto.Data;

/**
 *
 * @author Ricardo Trintin
 */
public class LocalDate {
    
    private int data;
    
    public LocalDate(int data){
        this.data = data;
    }
    
    
    public int idadeAluno(int nascimento){
        
        int result = 0;
        
        result = nascimento - 2019;
        
        return result;
    }
    
}

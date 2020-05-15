/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author virtual box
 */
public class Servico {
   
    private int id;
    private String descricao;
    private float valor;
    
    public Servico(){
        
    }
    
    public Servico(int id, String descricao, float valor){
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(){
        this.descricao = descricao;
    }
    
    public float getValor(){
        return valor;
    }
    
    public void setValor(float valor){
       this.valor = valor;
    }
    
    @Override
    public String toString(){
        return getDescricao();
    }
}

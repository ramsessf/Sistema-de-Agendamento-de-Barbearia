/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author virtual box
 */
public class Cliente extends Pessoa {
    
    private String endereco;
    private String cep;
 
    public Cliente(String endereco, String cep, int id, String nome, char sexo, String dataNascimento, String telefone, String email, String RG) {
        super(id, nome, sexo, dataNascimento, telefone, email, RG);
        this.endereco = endereco;
        this.cep = cep;
    }
        
    public Cliente(int id, String nome, String endereco, String cep){
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
     
}

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
public class Usuario extends Pessoa {
    
    private String senha;
    private String perfilAcesso;


    public Usuario(int id, String nome, char sexo, String dataNascimento, String telefone, String email, String RG, String senha, String perfilAcesso) {
        super(id, nome, sexo, dataNascimento, telefone, email, RG);
        this.senha = senha;
        this.perfilAcesso = perfilAcesso;
    }

    public Usuario(int id, String nome,String senha) {
        super(id, nome);
        this.senha = senha;
    }
    
    public String getSenha(){
        return senha;
    }
 
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public void setPerfilAcesso(String perfilAcesso){
        this.perfilAcesso = perfilAcesso;
    }
    
    
    
}

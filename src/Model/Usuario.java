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


    public Usuario(String senha, String perfilAcesso, int id, String nome, char sexo, String dataNascimento, String telefone, String email, String RG) {
        super(id, nome, sexo, dataNascimento, telefone, email, RG);
        this.senha = senha;
        this.perfilAcesso = perfilAcesso;
    }

    public Usuario(String senha, String perfilAcesso, int id, String nome) {
        super(id, nome);
        this.senha = senha;
        this.perfilAcesso = perfilAcesso;
    }
 
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public void setPerfilAcesso(String perfilAcesso){
        this.perfilAcesso = perfilAcesso;
    }
    
    
    
}

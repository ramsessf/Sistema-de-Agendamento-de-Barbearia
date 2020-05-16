/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.helpers;

import Model.Usuario;
import View.telas.TelaLogin;

/**
 *
 * @author virtual box
 */
public class LoginHelper implements IHelper {

    private final TelaLogin view;
    
    public LoginHelper(TelaLogin view){
        this.view = view;
        
    }
    
    public Usuario obtermodelo(){
        String nome = view.getTxtUsuario().getText();
        String senha = view.getTxtSenha().getText();
        
        Usuario usuario = new Usuario(0, nome, senha);
        return usuario;
        
    }
    
    public void setarModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getTxtUsuario().setText(nome);
        view.getTxtSenha().setText(senha);
        
    }
    
    @Override
    public void limparTela(){
        view.getTxtUsuario().setText("");
        view.getTxtSenha().setText("");
    }

    @Override
    public Object obterModelo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

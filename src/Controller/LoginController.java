/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.helpers.LoginHelper;
import Model.Usuario;
import View.telas.TelaLogin;
import View.telas.TelaMenuPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author virtual box
 */
public class LoginController {
    
    private final TelaLogin view;
    private final LoginHelper helper;
    
    public LoginController(TelaLogin view){
       this.view = view;
       this.helper = new LoginHelper(view);
        
    }
    
    public void entrarNoSistema(){
      Usuario modelo = helper.obtermodelo();
      
        TelaMenuPrincipal menuPrincipal = new TelaMenuPrincipal();
      if(modelo.getNome().equals("barbeiro") && modelo.getSenha().equals("barbeiro")){
          menuPrincipal.setVisible(true);
      }else{
          JOptionPane.showMessageDialog(null, "Usuário e senha inválidos!");
      }
      
    }
    
    public void fizTarefa(){
        System.out.println("procurei algo no banco");
        this.view.exibeMensagem("Execute o fiz tarefa");
    }
    
    
    
}

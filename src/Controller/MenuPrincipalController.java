/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.telas.TelaAgendamentoCliente;
import View.telas.TelaMenuPrincipal;

/**
 *
 * @author virtual box
 */
public class MenuPrincipalController {

    private final TelaMenuPrincipal view;
    
    public MenuPrincipalController(TelaMenuPrincipal view){
        this.view = view;
    }
    
    public void EntrarNoMenuAgenda(){
        TelaMenuPrincipal menuPrincipal = new TelaMenuPrincipal();
        menuPrincipal.dispose();
        
        TelaAgendamentoCliente agendaCliente = new TelaAgendamentoCliente();
        agendaCliente.setVisible(true);                 
    }
}
    
    

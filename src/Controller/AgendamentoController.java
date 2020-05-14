/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.helpers.AgendamentoHelper;
import Model.Agendamento;
import Model.DAO.AgendamentoDAO;
import View.telas.TelaAgendamentoCliente;
import java.util.ArrayList;

/**
 *
 * @author virtual box
 */
public class AgendamentoController {
    
   private final TelaAgendamentoCliente view;
   private final AgendamentoHelper helper;

    public AgendamentoController(TelaAgendamentoCliente view) {
        this.view = view;
        helper = new AgendamentoHelper(view);
    }
    
    public void atualizarAgenda(){
        //Busca lista de agendamento no banco
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll(); 
        
        //exibe a lista na view
        this.helper.setarRegistrosNaTabela(agendamentos);
                                   
    }
     
}
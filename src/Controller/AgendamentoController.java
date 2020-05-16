/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.helpers.AgendamentoHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
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

    public void atualizarComboCliente() {
        //Busca lista de clientes no banco
        ClienteDAO clienteDAO =  new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        //exibe a lista no combobox cliente
        this.helper.setarRegistosNoComboCliente(clientes);
    }
    
    public void atualizarComboServico(){
        //Busca lista de servicos no banco
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        
        //Exibe a lista no combobox servico
        this.helper.setarRegistrosNoComboServico(servicos);
    }
    
    public void obterValorServico(){
        Servico servico = this.helper.obterServico();
        
        this.helper.setarValorServico(servico.getValor());
        
    }
    
     
}
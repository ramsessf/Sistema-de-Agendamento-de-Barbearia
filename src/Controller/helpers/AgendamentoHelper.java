/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.helpers;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.telas.TelaAgendamentoCliente;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author virtual box
 */
public class AgendamentoHelper {

   private final TelaAgendamentoCliente view;
   private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:MM");
    
    
    public AgendamentoHelper(TelaAgendamentoCliente view){
        this.view = view;
    }
    
    public void setarRegistrosNaTabela(ArrayList<Agendamento> agendamentos){
        DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgendaClientes().getModel();
        tableModel.setNumRows(0);
     
        //Percorrer a lista preenchendo a tableModel
        for (Agendamento agendamento : agendamentos) {
            tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao()         
            
            });
            
        }
        
     }
    
    public void setarRegistosNoComboCliente(ArrayList<Cliente> clientes){
       DefaultComboBoxModel jcomboBoxCliente = (DefaultComboBoxModel)view.getCbCliente().getModel();
       
        for (Cliente cliente : clientes) {
           jcomboBoxCliente.addElement(cliente);        
        }         
    }
 

    public void setarRegistrosNoComboServico(ArrayList<Servico> servicos) {
       DefaultComboBoxModel jcomboBoxServico = (DefaultComboBoxModel) view.getCbServico().getModel();
       
        for (Servico servico : servicos) {
            jcomboBoxServico.addElement(servico);
            
        }
    }
    
       
    public void limparTela(){
        
    }
}

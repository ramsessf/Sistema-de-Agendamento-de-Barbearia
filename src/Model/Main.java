/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author virtual box
 */
public class Main {
    
    public static void main(String[] args) throws ParseException{
               
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:MM:ss");
       Cliente cliente = new Cliente(1,"Jose","ruas das fadas", "36983943");
        System.out.println(cliente);
        
       Usuario usuario = new Usuario("123", "Administrador", 1, "josefs");
        System.out.println(usuario);
        
       Servico servico = new Servico(23,"corte de cabelo", 15f);
        System.out.println(servico);
        
       Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "23/09/2019 09:15", "sem obs");
        System.out.println(agendamento.getCliente().getNome());
        
       
    }
    
    
}

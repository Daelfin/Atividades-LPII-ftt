/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auditoriathread;

import java.time.Instant;

/**
 *
 * @author Fábio
 */
public class AuditoriaThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        ThreadSecundaria secundaria = new ThreadSecundaria();
        try {
            secundaria.start();
            
            for(Integer i = 0; i < 20; i++){
                String log = i.toString();
                AuditoriaSingleton.obtemInstancia().salvar(log);
                System.out.println(Instant.now().toString() + " - Enviando algo pro log: " + log);
            }
            
        } finally {
            secundaria.ativo = false;
        }
        
        
    }
}
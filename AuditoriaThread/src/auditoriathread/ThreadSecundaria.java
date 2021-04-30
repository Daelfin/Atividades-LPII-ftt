/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auditoriathread;

import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fábio
 */
public class ThreadSecundaria extends Thread {

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    private boolean ativo = true;
    
    @Override
    public void run() {
        AuditoriaSingleton auditoria = AuditoriaSingleton.obtemInstancia();
        
        while (isAtivo() || auditoria.existemLogsNaFila()) {
            if (auditoria.existemLogsNaFila()) {
                String log = auditoria.getFila().poll();
                
                mockBancoDeDados db = new mockBancoDeDados();
                
                try {
                    db.Salvar(log);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadSecundaria.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                System.out.println(Instant.now().toString() + " - " + log + " registrado");
            }
        }
    }
}

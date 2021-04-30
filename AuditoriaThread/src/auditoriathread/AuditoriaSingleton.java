/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auditoriathread;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 *
 * @author Fábio
 */
public class AuditoriaSingleton {
        
    static private AuditoriaSingleton _instancia;    
    static private ConcurrentLinkedQueue<String> fila = new ConcurrentLinkedQueue<String>();
    
    /*Singleton*/
    private AuditoriaSingleton(){
    }
    
    public static AuditoriaSingleton obtemInstancia(){
        if(_instancia == null){
            _instancia = new AuditoriaSingleton();            
        }
        return _instancia;
    }
    /*Singleton*/
    
    public ConcurrentLinkedQueue<String> getFila() {
        return fila;
    }
    
    public void salvar(String log){
        fila.add(log);
    }
    
    public boolean existemLogsNaFila(){
        if(fila.isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }
}

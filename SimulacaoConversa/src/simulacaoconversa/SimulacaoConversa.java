/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacaoconversa;

/**
 *
 * @author Fábio
 */
public class SimulacaoConversa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa john = new Pessoa();
        john.setNome("John Smith");
        john.setIdade(25);
        john.setCidade("Nova York");
        john.setEstadoCivil("Casado");
        
        john.saudação();
        john.apresentacao();
        
        Pessoa kira = new Pessoa();
        kira.setNome("Yoshikage Kira");
        kira.setIdade(33);
        kira.setCidade("Morioh, na parte nordeste, onde todas as moradias são,");
        kira.setEstadoCivil("solteiro");
        
        kira.apresentacao();
    }
    
}

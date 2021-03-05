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
public class Pessoa {

    private String nome;
    private int idade;
    private String cidade;
    private String estadoCivil;
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getCidade(){
        return cidade;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public String getEstadoCivil(){
        return estadoCivil;
    }
    
    public void setEstadoCivil(String estadoCivil){
        this.estadoCivil = estadoCivil;
    }
    
    public void saudação(){
        System.out.println(nome + " diz: Olá!");
    }
    
    public void apresentacao(){
        System.out.println(nome + " diz: Meu nome é " + nome + ". Tenho " + idade + " anos. Minha casa fica em " + cidade + " e eu sou " + estadoCivil + "." );
    }
}

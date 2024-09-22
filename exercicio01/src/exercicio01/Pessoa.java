/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio01;

/**
 *
 * @author 0040482311010
 */
public class Pessoa {
    private String nome, sobrenome;
    
    public void setNome(String vNome){
        if(vNome != null)
        {
            nome = vNome;
        }
    }
    
    public void setSobrenome(String vSobrenome){
        if(vSobrenome != null)
        {
            sobrenome = vSobrenome;
        }
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }
    
    public void print(){
        System.out.println(nome + "" + sobrenome);
    }
}   //CLASSE PESSOA;

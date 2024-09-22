/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extecelagem;

/**
 *
 * @author 0040482311010
 */
public class Administracao extends Pessoa
{
    public double salarioFixo = super.getSalario_base();
    public int qtdFaltas;

    public Administracao(String nome, String rg, double salario_base) {
        super(nome, rg, salario_base);
    }

    public int getQtd_faltas() {
        return qtdFaltas;
    }

    public void setQtd_faltas(int qtd_faltas) {
        this.qtdFaltas = qtdFaltas;
    }
    
    public void registrarFalta()
    {
        qtdFaltas ++;
    }
    
    @Override
    public double salarioLiquido()
    {
        return salarioFixo - ((salarioFixo / 30) * qtdFaltas);
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.println("Salario base: " + salarioFixo);
        System.out.println("Quantidade de faltas: " + qtdFaltas);
        System.out.println("Salário líquido: " + salarioLiquido());
        
    }
    
    @Override
    public void novoMes()
    {
        qtdFaltas = 0;
    }
}

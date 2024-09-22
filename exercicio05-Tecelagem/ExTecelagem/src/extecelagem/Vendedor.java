/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extecelagem;

/**
 *
 * @author 0040482311010
 */
public class Vendedor extends Pessoa
{
    public double valorVenda;

    public Vendedor(double valorVenda, String nome, String rg, double salario_base) {
        super(nome, rg, salario_base);
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
    
    @Override
    public double salarioLiquido()
    {
        return super.getSalario_base() + (valorVenda * 0.03);
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.println("Valor fixo: " + super.getSalario_base());
        System.out.println("Vendas acumuladas: " + valorVenda);
        System.out.println("Salário líquido: " + salarioLiquido());
    }
    
    @Override
    public void novoMes()
    {
        setValorVenda(0);
    }
}

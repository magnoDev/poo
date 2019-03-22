/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author magno
 */
public class ContaCorrente extends Conta{

    private double limite;
    
    public ContaCorrente(){
        
    }
    
    public ContaCorrente(String nome, int numero, double saldo, int agencia,double limite){
        super(nome, numero, saldo, agencia);
        this.limite = limite;
    }
    
    public ContaCorrente(String nome, String numero, String saldo, String agencia, String limite){
        super(nome, numero, saldo, agencia);
        this.limite = Double.parseDouble(limite);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    @Override
    public boolean sacar(double valor){
        if(this.getSaldo() >= valor){
            this.setSaldo(getSaldo() - valor);
            return true;
        }else if(this.getLimite() >= (valor - this.getSaldo())){
            this.setLimite(this.getLimite() - (valor - this.getSaldo()));
            return true;
        }else{
            return false;
        }
    }
}
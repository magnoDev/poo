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
public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(){
        
    }
    
    public ContaPoupanca(String nome, int numero, double saldo, int agencia){
        super(nome, numero, saldo, agencia);
    }
    
    public ContaPoupanca(String nome, String numero, String saldo, String agencia){
        super(nome, numero, saldo, agencia);
    }
    
}

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
public class Conta {

    private String nomeCliente;
    private int numeroConta;
    private double saldo;
    private double limite;
    private int agencia;
    
    public Conta(){
        
    }
    
    public Conta(String nome, int numero, double saldo, double limite, int agencia){
        this.nomeCliente = nome;
        this.numeroConta = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.agencia = agencia;
    }
    
    public Conta(String nome, String numero, String saldo, String limite, String agencia){
        this.nomeCliente = nome;
        this.numeroConta = Integer.parseInt(numero);
        this.saldo = Double.parseDouble(saldo);
        this.limite = Double.parseDouble(limite);
        this.agencia = Integer.parseInt(agencia);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public boolean depositar(double valor){
        this.saldo += valor;
        return true;
    }
    
    public boolean sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
    
    public void imprimirSaldo(){
        System.out.println("Saldo = R$ "+this.saldo);
    }
    
}

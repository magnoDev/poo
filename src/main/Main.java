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

import javax.swing.JOptionPane;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String agencia = JOptionPane.showInputDialog("Digite o numero da agência:");
        String numeroConta = JOptionPane.showInputDialog("Digite o numeto da conta:");
        String nomeCliente = JOptionPane.showInputDialog("Informe o nome do cliente:");
        String limiteInicial = JOptionPane.showInputDialog("Informe o valor de limite:");
        String saldoInicial = JOptionPane.showInputDialog("Informe o valor do saldo:");
    }
    
}

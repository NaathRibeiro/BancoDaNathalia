/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancodenathalia;

/**
 *
 * @author aluno
 */
public class Conta { 

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the Agencia
     */
    public int getAgencia() {
        return Agencia;
    }

    /**
     * @param Agencia the Agencia to set
     */
    public void setAgencia(int Agencia) {
        this.Agencia = Agencia;
    }

    /**
     * @return the Saldo
     */
    public float getSaldo() {
        return Saldo;
    }

    /**
     * @param Saldo the Saldo to set
     */
    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }

    /**
     * @return the Limite
     */
    public float getLimite() {
        return Limite;
    }

    /**
     * @param Limite the Limite to set
     */
    public void setLimite(float Limite) {
        this.Limite = Limite;
    }
    private int numero;
    private int Agencia;
    private float Saldo;
    private float Limite;
    
    
}

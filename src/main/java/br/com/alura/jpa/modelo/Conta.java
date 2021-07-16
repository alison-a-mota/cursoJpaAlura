package br.com.alura.jpa.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer agencia;
    private Integer numero;
    private String titular;
    private Double saldo;

    public Conta(Integer agencia, Integer numero, String titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    public Conta(Integer agencia, Integer numero, String titular, Double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Long getId() {
        return id;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    @Deprecated
    public Conta() {

    }
}

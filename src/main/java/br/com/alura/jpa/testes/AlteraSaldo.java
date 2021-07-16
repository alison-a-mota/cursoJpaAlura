package br.com.alura.jpa.testes;

import br.com.alura.jpa.modelo.Conta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlteraSaldo {

    public static void main(String[] args) {

    //Instanciando uma Factory para poder manipular os dados no banco
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
    EntityManager em = emf.createEntityManager();

    Conta conta = em.find(Conta.class, 1L);

    //Abrindo uma transação, persistindo dados da "conta" no banco, e fazendo commit
    em.getTransaction().begin();

    conta.setSaldo(2500.50);
    conta.setTitular("Jackons");

    em.getTransaction().commit();
    }
}


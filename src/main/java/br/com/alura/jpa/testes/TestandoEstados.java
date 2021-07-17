package br.com.alura.jpa.testes;

import br.com.alura.jpa.modelo.Conta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestandoEstados {
    public static void main(String[] args) {

        //Transient
        Conta conta = new Conta(0001, 1234, "Eduardo");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        //Transient -> Managed
        em.persist(conta);

        //Managed -> Remove
        em.remove(conta);
        em.getTransaction().commit();
        em.close();
    }
}

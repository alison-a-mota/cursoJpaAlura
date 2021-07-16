package br.com.alura.jpa.testes;

import br.com.alura.jpa.modelo.Conta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CriaContaComSaldo {

    public static void main(String[] args) {

        //Instanciando uma Factory para poder manipular os dados no banco
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();

        //Instanciando um objeto tipo conta sem saldo e definindo os atributos
        Conta conta = new Conta(0001, 321565, "Alisu", 1250.50);

        //Abrindo uma transação, persistindo dados da "conta" no banco, e fazendo commit
        em.getTransaction().begin();
        em.persist(conta);
        em.getTransaction().commit();
    }
}

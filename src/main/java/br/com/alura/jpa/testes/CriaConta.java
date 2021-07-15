package br.com.alura.jpa.testes;

import br.com.alura.jpa.modelo.Conta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CriaConta {
    public static void main(String[] args) {

        //Instanciando uma Factory para poder manipular os dados no banco
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();

        //Instanciando um objeto tipo conta e definindo os atributos
        Conta conta = new Conta();
        conta.setTitular("Alisu");
        conta.setAgencia(0001);
        conta.setNumero(4108536);

        //Abrindo uma transação, persistindo dados da "conta" no banco, e fazendo commit
        em.getTransaction().begin();
        em.persist(conta);
        em.getTransaction().commit();


    }
}

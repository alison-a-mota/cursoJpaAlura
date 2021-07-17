package br.com.alura.jpa.testes;

import br.com.alura.jpa.modelo.Conta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CriaConta {
    public static void main(String[] args) {

        //use alura_jpa

        //Instanciando uma Factory para poder manipular os dados no banco
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();

        //Instanciando um objeto tipo conta sem saldo e definindo os atributos
        Conta conta = new Conta(0001, 4108536, "Luis");

        //Abrindo uma transação, persistindo dados da "conta" no banco, e fazendo commit
        em.getTransaction().begin();
        em.persist(conta);
        em.getTransaction().commit();
        //Fechando o Entity Manager
        em.close();

        //Abrindo outro Entity Manager
        EntityManager em2 = emf.createEntityManager();

        conta.setSaldo(1500.0);

        em2.getTransaction().begin();
        //Transformando em Managed
        em2.merge(conta);
        //Atualizando o banco
        em2.getTransaction().commit();
        em2.close();


    }
}

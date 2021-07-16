package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CriaTabelas {
    public static void main(String[] args) {

        //Instanciando uma Factory para poder criar uma tabela no banco de dados.
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory("contas");
        EntityManager entityManager = emf.createEntityManager();
        emf.close();

    }
}

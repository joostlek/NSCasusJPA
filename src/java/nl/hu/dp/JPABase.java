package nl.hu.dp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPABase {

    protected final EntityManager getConnection() {

        EntityManager em = null;
        String orclcfg = "nl.hu.ict.jpa.oracle";
        EntityManagerFactory entityManagerFactory;

        try {
            entityManagerFactory = Persistence.createEntityManagerFactory(orclcfg);
            em = entityManagerFactory.createEntityManager();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        return em;

    }


}
package nl.hu.dp;

import javax.persistence.EntityManager;

public class OVChipkaartOracleImpl extends JPABase implements OVChipkaatDAO {
    private EntityManager em = super.getConnection();
    public OVChipkaart get(int id) {
        return em.getReference(OVChipkaart.class, id);
    }

    public void save(OVChipkaart ovChipkaart) {
        em.getTransaction().begin();
        em.persist(ovChipkaart);
        em.getTransaction().commit();
    }
}

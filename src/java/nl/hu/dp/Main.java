package nl.hu.dp;
import javax.persistence.EntityManagerFactory;
import java.sql.Date;

public class Main {

    private static String orclcfg = "nl.hu.ict.jpa.oracle";
    private static EntityManagerFactory entityManagerFactory;

    public static void main(String[] args) {
        OVChipkaart kaart = new OVChipkaart();
        kaart.setKaartopdruk("mijn eerste kaart");
        Reiziger reiziger = new Reiziger("a", "a", "s", new Date(2018, 6, 14));
        reiziger.addKaart(kaart);
        ReizigerOracleImpl reizigerOracle = new ReizigerOracleImpl();
        reizigerOracle.save(reiziger);
        System.out.println("-- einde --");
    }
}

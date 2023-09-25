import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestAppartement {
    @Test
    public void testTypeBien() {
        Vendeur vendeur = new Vendeur("Dupuis", "Jean-Claude", "dp.jc@gmail.com", "06.74.74.00.00");
        Appartement appartement = new Appartement("123 Rue de la Ville", "Villeville", "12345", vendeur, "3");

        String typeDeBien = appartement.typeBien();

        assertEquals("T0", typeDeBien); 
    }
}

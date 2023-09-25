import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestAnnonce { 
    @Test
    public void testPrix() {
        TypePiece chambre = new TypePiece(TypePiece.CHAMBRE, true, true);
        TypePiece cuisine = new TypePiece(TypePiece.CUISINE, true, false);
        
        Vendeur vendeur = new Vendeur("Dupuis", "Jean-Claude", "dp.jc@gmail.com", "06.74.74.00.00");
        Appartement appartement = new Appartement("16 rue du lac", "ANNECY", "74000", vendeur, "1er étage");
        appartement.ajouterPiece(new PieceQuadrilatere(chambre, "0", 4, 3));
        appartement.ajouterPiece(new PieceTriangulaire(cuisine, "0", 6, 2.3));

        Annonce annonce = new Annonce("A123", "2023-09-28", "Belle maison", 2000.0, appartement);

        double prixAttendu = 20.0 * 2000.0 + 30.0 * 2000.0 * Annonce.COEF_NON_HABITABLE;

        assertEquals(prixAttendu, annonce.prix(), 0.001); 
    }
}
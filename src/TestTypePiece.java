import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestTypePiece {
    @Test
    public void testSurfaceTriangle() {
        TypePiece cuisine = new TypePiece(TypePiece.CUISINE, true, false);
        PieceTriangulaire pieceTriangulaire = new PieceTriangulaire(cuisine, "Rez-de-chaussée", 6, 2.3);

        double surfaceAttendue = 0.5 * 6 * 2.3;

        assertEquals(surfaceAttendue, pieceTriangulaire.surface(), 0.001); 
    }

    @Test
    public void testSurfaceTrapezoidale() {
        TypePiece salleDeBain = new TypePiece(TypePiece.SALLE_DE_BAIN, true, false);
        PieceTrapezoidale pieceTrapezoidale = new PieceTrapezoidale(salleDeBain, "Rez-de-chaussée", 2.6, 3.2, 3.1);

        double surfaceAttendue = 0.5 * (2.6 + 3.2) * 3.1;

        assertEquals(surfaceAttendue, pieceTrapezoidale.surface(), 0.001); 
    }

    @Test
    public void testSurfaceQuadrilatere() {
        TypePiece salleDeBain = new TypePiece(TypePiece.SALLE_DE_BAIN, true, false);
        PieceQuadrilatere pieceQuadrilatere = new PieceQuadrilatere(salleDeBain, "Rez-de-chaussée", 1.5, 2);

        double surfaceAttendue = 1.5 * 2;

        assertEquals(surfaceAttendue, pieceQuadrilatere.surface(), 0.001); 
    }

    @Test
    public void testSurfaceParallelogramme() {
        TypePiece salleDeBain = new TypePiece(TypePiece.SALLE_DE_BAIN, true, false);
        PieceParallelogramme pieceParallelogramme = new PieceParallelogramme(salleDeBain, "Rez-de-chaussée", 1.5, 2);

        double surfaceAttendue = 1.5 * 2;

        assertEquals(surfaceAttendue, pieceParallelogramme.surface(), 0.001); 
    }

    @Test
    public void testSurfaceCirculaire() {
        TypePiece chambre = new TypePiece(TypePiece.CHAMBRE, true, true);
        PieceCirculaire pieceCirculaire = new PieceCirculaire(chambre, "Rez-de-chaussée", 5.0);

        double surfaceAttendue = Math.PI * 5.0 * 5.0;

        assertEquals(surfaceAttendue, pieceCirculaire.surface(), 0.001); 
    }
}

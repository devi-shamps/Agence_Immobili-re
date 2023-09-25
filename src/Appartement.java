public class Appartement extends BienImmobilier {
    private String etage;
    private boolean ascenseur;

    public Appartement(String rue, String ville, String codePostal, Vendeur vendeur, String etage) {
        super(rue, ville, codePostal, vendeur);
        this.ascenseur = false;
        this.etage = etage;
    }

    public Appartement(String rue, String ville, String codePostal, Vendeur vendeur, String etage, boolean ascenseur) {
        super(rue, ville, codePostal, vendeur);
        this.ascenseur = ascenseur;
        this.etage = etage;
    }

    // A MODIFIER
    public String typeBien(){
        int nombreDePieces = 0;
        for (Piece piece : getPieces()) {
            if (piece.getTypePiece().isPiece()) {
                nombreDePieces++;
            }
        }

        if (nombreDePieces <= 7) {
            return "T" + nombreDePieces;
        } else {
            return "T7+";
        }
    }

    @Override
    public String toString() {
        String resultat ="";
        resultat = "Appartement de type "+ typeBien();
        if(ascenseur){
            resultat += " avec ascenseur ";
        }
        resultat += " situé au " + etage + " ";
        resultat += super.toString();
        return resultat;
    }

}

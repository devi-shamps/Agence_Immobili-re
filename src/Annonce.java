public class Annonce {
    public static final double COEF_NON_HABITABLE = 0.25;

    private String réference;
    private String date;
    private String titre;
    private double prixM2Habitable;
    private double prix = 0;
    private BienImmobilier bienImmobilier;

    public Annonce(String réference, String date, String titre, double prixM2Habitable, BienImmobilier bienImmobilier) {
        this.réference = réference;
        this.date = date;
        this.titre = titre;
        this.prixM2Habitable = prixM2Habitable;
        this.bienImmobilier = bienImmobilier;
        
    }

    public double prix() {
        prix = this.bienImmobilier.surfaceHabitable() * prixM2Habitable + this.bienImmobilier.surfaceNonHabitable() * prixM2Habitable * COEF_NON_HABITABLE; 
        return prix;
    }

    public String getRéference() {
        return réference;
    }
    public String getDate() {
        return date;
    }
    public String getTitre() {
        return titre;
    }
    public double getPrixM2Habitable() {
        return prixM2Habitable;
    }

    @Override
    public String toString() {
        return titre 
        + "\nAnnonce " + réference + " du " + date + "\n"
        + super.toString() 
        + "\n- Prix du m2 habitable : " + prixM2Habitable + " euros"
        + "\n- Prix du m2 non habitable : " + prixM2Habitable * COEF_NON_HABITABLE + " euros\n"
        + "Valeur du bien :" + prix + " euros\n" 
        + "\nContact : " + this.bienImmobilier.getVendeur().getEmail() + " / " + this.bienImmobilier.getVendeur().getNumeroTelephone();
    }
    
}

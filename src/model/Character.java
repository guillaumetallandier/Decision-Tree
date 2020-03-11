package business_intelligence.model;


public class Character {
    
    private int ID;
    private boolean chapeau;
    private boolean cigare;
    private boolean lunettes;
    private boolean boucleDoreille;

    
    public Character() {
        chapeau = false;
        cigare = false;
        lunettes = false;
        boucleDoreille = false;
        
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setChapeau(boolean chapeau) {
        this.chapeau = chapeau;
    }

    public boolean isChapeau() {
        return chapeau;
    }

    public void setCigare(boolean cigare) {
        this.cigare = cigare;
    }

    public boolean isCigare() {
        return cigare;
    }

    public void setLunettes(boolean lunettes) {
        this.lunettes = lunettes;
    }

    public boolean isLunettes() {
        return lunettes;
    }

    public void setBoucleDoreille(boolean boucle_d_oreille) {
        this.boucleDoreille = boucle_d_oreille;
    }

    public boolean isBoucleDoreille() {
        return boucleDoreille;
    }
}

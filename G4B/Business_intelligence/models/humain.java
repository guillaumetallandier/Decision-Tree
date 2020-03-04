package Business_intelligence.models;

public class humain{

  private boolean bras;
  private boolean chapeau;
  private boolean barbe;


  public humain(boolean bras, boolean chapeau, boolean barbe){
    this.bras=bras;
    this.chapeau=chapeau;
    this.barbe=barbe;
  }


  public boolean getBras(){
    return this.bras;
  }

  public boolean getChapeau(){
    return this.chapeau;
  }

  public boolean getBarbe(){
    return this.barbe;
  }

}

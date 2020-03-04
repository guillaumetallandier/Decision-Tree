package Business_intelligence.models;

public class humain{

  private boolean arms;
  private boolean hat;
  private boolean beard;
  private boolean isInClass;

  public humain(boolean arms, boolean hat, boolean beard){
    this.arms=arms;
    this.hat=hat;
    this.beard=beard;
    this.isInClass=isInClass();
  }


  public boolean getArms(){
    return this.arms;
  }

  public boolean getHat(){
    return this.hat;
  }

  public boolean getBeard(){
    return this.beard;
  }

  public boolean isInClass(){
    return this.arms && this.hat && this.beard;
  }

}

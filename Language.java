public class Language{
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;
  
  Language(String langName, int speakers, String regions, String wdOrder){
    this.name = langName;
    this.numSpeakers = speakers;
    this.regionsSpoken = regions;
    this.wordOrder = wdOrder;
  }
  
  public void getInfo(){
     System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder);
  }
  
 public static void main(String[] args){
    Language Spanish = new Language("Spanish", 100000000, "Spain and Mexico", "subject-verb-object" );
    Spanish.getInfo();
  }
}

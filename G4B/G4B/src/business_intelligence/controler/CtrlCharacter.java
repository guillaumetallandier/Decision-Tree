package business_intelligence.controler;

import java.util.ArrayList;
import business_intelligence.model.Character;

public class CtrlCharacter {
    
    private int id;
    
    private static int nextID = 0;
    
    private static ArrayList<Character> listCharacter = new ArrayList<Character>();
    
    public CtrlCharacter() {

    }
    
    public static Character creationCharacter() {
        Character c = new Character();
        c.setID(nextID);
        nextID++;
        listCharacter.add(c);
        return c;
    }
    
    public static Character getCellule(Integer id) {
        for(int i=0;i<listCharacter.size();i++){
            if(listCharacter.get(i).getID() == id){
                return listCharacter.get(i);
            }
        }
        return null;
    }

    public static ArrayList<Character> getListCharacter() {
        return listCharacter;
    }
}

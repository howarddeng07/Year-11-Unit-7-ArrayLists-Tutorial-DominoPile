import java.util.ArrayList;
import java.util.Random;

public class DominoPile {
    ArrayList<Domino> pile;
    public DominoPile(){
        pile = new ArrayList();
    }
    public void newStack6(){
        for(int i=0 ; i<=6 ; i++){
            for(int y=i ; y<=6 ; y++){
                Domino n = new Domino(i,y);
                pile.add(n);
            }
        }
    }
    public void shuffle(){
        for(int i=1 ; i<=10000 ; i++){
            Random ran = new Random();
            int r1 = ran.nextInt(pile.size()-1);
            int r2 = ran.nextInt(pile.size()-1);
            Domino a = pile.get(r1);
            Domino b = pile.get(r2);
            pile.set(r2,a);
            pile.set(r1,b);
        }
    }
    public ArrayList<Domino> getPile(){
        return pile;
    }
}
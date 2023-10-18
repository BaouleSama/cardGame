import java.util.ArrayList;

public class Player {

    Card c;
    int count;

    ArrayList deck = new ArrayList();

    public Player(){

    }

//    draw 5 card and store them in an array
    public ArrayList  drawCard(){
            String myDeck1;

       while ( count<5){
            c = new Card();
            myDeck1 = c.getFaceName() + " of  " + c.getSuitName();

//           check if there is no duplicate before add the card to the array
            if (!deck.contains(myDeck1)){
                deck.add(myDeck1);
            }
//            Skipp if there is duplicate
            else {
                continue;
            }

           count++;
       }

       return deck;
    }


@Override
    public String toString(){
        return "Your card is " + "\n" + String.join("\n",drawCard());
    }

}

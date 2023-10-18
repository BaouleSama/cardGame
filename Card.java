import java.util.Random;

public class Card {
    private int suit;
    private int face;
    private String faceName;
    private String suitName;
    private
    Random r = new Random();


    public Card(){
        suit = r.nextInt(4);
        face = r.nextInt(1,13);

    }


    public int getSuit() {
        return suit;
    }

    public int getFace() {
         return face;
    }

//    Give a suit String name from number
    public String getSuitName() {
        switch (suit) {
            case 0:
                return "Diamond";
            case 1:
                return "Club";
            case 2:
                return "Heart";
            case 3:
                return "Spades";
            default:
                return "Invalid Suit";
        }
    }

//    Assign face name to the number
    public String getFaceName(){
        switch (face){
            case 1:
                faceName ="1";
                break;
            case 2:
                faceName ="2";
                break;
            case 3:
                faceName ="3";
                break;
            case 4:
                faceName ="4";
                break;
            case 5:
                faceName ="5";
                break;
            case 6:
                faceName ="6";
                break;
            case 7:
                faceName ="7";
                break;
            case 8:
                faceName ="8";
                break;
            case 9:
                faceName ="9";
                break;
            case 10:
                faceName ="10";
                break;
            case 11:
                faceName ="11";
                break;
            case 12:
                faceName ="12";
                break;
            case 13:
                faceName ="13";
                break;
        }

        return faceName;

    }

  public String toString(){
        return getFaceName()+ " of " + getSuitName();
  }

}

package Casting.BlackJack2;

public class BlackjackCard extends Card {

    public BlackjackCard(int suitNumber, int rankNumber) {
        super(suitNumber, rankNumber);
    }

    public int getValue(){
        if (getRank().equals("Ace")) return 11;
        if (rankNumber > 10) return 10;
        return rankNumber;
    }

}

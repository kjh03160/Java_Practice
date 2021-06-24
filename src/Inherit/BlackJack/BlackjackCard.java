package Inherit.BlackJack;

public class BlackjackCard extends Card{

    public BlackjackCard(int suitNumber, int rankNumber) {
        super(suitNumber, rankNumber);
    }

    public int getValue(){
        if (isAce()) return 11;
        if (rankNumber > 10) return 10;
        return rankNumber;
    }

    public boolean isAce(){
        return rankNumber == 1;
    }
}

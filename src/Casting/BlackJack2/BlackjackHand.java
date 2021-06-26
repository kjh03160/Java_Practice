package Casting.BlackJack2;

public class BlackjackHand extends Deck {

    public int getValue() {
        int aceCount = 0;
        int value = 0;
        for (Card c : getCards()){
            BlackjackCard card = (BlackjackCard) c;
            if (card.getValue() == 11){
                aceCount += 1;
            }
            value += card.getValue();
        }
        while (aceCount-- > 0 && value > 21){
            value -= 10;
        }
        return value;
    }

    public boolean isBusted() {
        return getValue() > 21;
    }

    public boolean isBlackjack() {
        return getCards().size() == 2 && getValue() == 21;
    }
}
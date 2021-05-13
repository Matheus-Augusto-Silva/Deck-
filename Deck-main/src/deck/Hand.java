package deck;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private int length;
    private List<Card> cards = new ArrayList<>();

    public Hand(int length, List<Card> cards) {
        this.length = length;
        this.cards = cards;
    }
}

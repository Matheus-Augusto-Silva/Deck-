package deck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Deck {

    private final int length = 52;
    private final List<String> suits = Arrays.asList("HEARTS", "CLUBS", "DIAMONDS", "SPADES");
    private final List<String> values = Arrays.asList("ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN",
            "JACK", "QUEEN", "KING", "ACE");
    private final List<Card> cards = new ArrayList<>();

    public Deck(String fileName) {
    }

    public Deck() {
        suits.forEach(suit -> {
            values.forEach(value -> {
                cards.add(new Card(suit, value));
            });
        });
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Hand deal(int i) {
        List<Card> cardsHand = cards.stream().limit(i).collect(Collectors.toList());
        cardsHand.forEach(cards::remove);

        return new Hand(i, cardsHand);
    }

    public void save(String fileName) {
    //TODO
    }

    public int getLength() {
        return length;
    }

    public List<String> getSuits() {
        return suits;
    }

    public List<String> getValues() {
        return values;
    }

    public List<Card> getCards() {
        return cards;
    }
}

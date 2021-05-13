package deck;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Deck myDeck = new Deck();

        System.out.println("Deck inicial -------------------------------------------");
        System.out.println(myDeck.getCards().get(0).getSuit());
        System.out.println(myDeck.getCards().get(0).getValue());

        myDeck.shuffle();

        System.out.println("Deck embaralhado ---------------------------------------");
        System.out.println(myDeck.getCards().get(0).getSuit());
        System.out.println(myDeck.getCards().get(0).getValue());

        Hand hand = myDeck.deal(5);
        System.out.println("Mão entregue--------------------------------------------");
        System.out.println(hand);

        System.out.println("Deck restante ------------------------------------------");
        System.out.println(myDeck.getCards().size());


        /*String fileName = "deckSalvo.txt";
        myDeck.save(fileName);


        Deck myNewDeck = new Deck(fileName);

        System.out.println("Novo Deck criado a partir de um arquivo ----------------");
        System.out.println(myNewDeck);*/
    }
}

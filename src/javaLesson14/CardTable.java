package javaLesson14;

public class CardTable {

    Cards cards = new Cards();

    int numbersCardsForEachPlayer = 5;
    public void game(){
        cards.createDeck();
        cards.printDeck(cards.deck,"--- Create New Deck---");

        cards.deckShuffle(cards.deck);

        cards.printDeck(cards.deckShuffle,  "--- Deck after shuffle ---");

    }

}

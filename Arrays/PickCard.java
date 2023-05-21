public class PickCard {
    public static void main(String[] args) {
        String[] decks = {"Clubs","Diamond","Hearts","Spades"};
        String[] cards = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        int pickedDeck = (int)(Math.random() * decks.length);
        int pickedCard = (int)(Math.random() * cards.length);

        System.out.println("Your card is "+  cards[pickedCard] +" from "+ decks[pickedDeck]);

    }
}

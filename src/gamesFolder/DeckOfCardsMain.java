package gamesFolder;

public class DeckOfCardsMain {
    public static void main(String[] args) {
        DeckOfCards mydeckOfCards = new DeckOfCards();
        mydeckOfCards.shuffle();

        for (int i = 1; i <= 52; i++){
            System.out.printf("%-19s", mydeckOfCards.dealCard());

            if (i % 4 == 0){
                System.out.println();
            }
        }
    }
}

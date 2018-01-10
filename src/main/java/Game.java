import java.util.ArrayList;

public class Game {

    // players
    // deck
    // dealer
    // decide who wins

    private ArrayList<Player> players;
    private Deck deck;
    private Dealer dealer;

    public Game(Deck deck, Dealer dealer) {
        this.players = new ArrayList<>();
        this.deck = deck;
        this.dealer = dealer;
    }

    public int playerCount() {
        return players.size();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void dealerDealsCardsToPlayer() {
        dealer.getsCardsFromDeck(deck);
        Card card = dealer.dealCard();
        for(Player player: this.players) {
            player.addCard(card);
        }

    }
}

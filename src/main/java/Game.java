import java.util.ArrayList;

public class Game {

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

    public Player dealerDealsCardsToPlayers() {
        dealer.getsCardsFromDeck(deck);
        Card card = dealer.dealCard();
        for(Player player: this.players) {
            player.addCard(card);
        }
        if (players.get(0).cardInHandValue() > players.get(1).cardInHandValue()){
            return players.get(0);
        }
            else return players.get(1);
    }

}

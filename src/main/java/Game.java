import java.util.ArrayList;
import java.util.HashMap;

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

    public void dealerDealsCardsToPlayers() {
        dealer.getsCardsFromDeck(deck);
        Card card = dealer.dealCard();
        for(Player player: this.players) {
            player.addCard(card);
        }
//        if (players.cardInHandValue > players(1).cardInHandValue){
//            return players(0);
//        }
//            else return players(1);
    }



}

import java.util.*;
import java.util.Collections;
import java.util.HashMap;

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

    public void dealerDealsCardsToPlayers() {
        dealer.getsCardsFromDeck(deck);
        for (Player player : this.players) {
            Card card = dealer.dealCard();
            player.addCard(card);
        }
    }

//    public Player winner() {
//        if (players.get(0).cardInHandValue() > players.get(1).cardInHandValue()){
//            return players.get(0);
//        } else {
//            return players.get(1);
//        }
//    }


    public HashMap<Player, Integer> playerHashMap() {
        HashMap<Player, Integer> playerValues = new HashMap<>();
        for (Player player : this.players) {
            playerValues.put(player, player.cardInHandValue());
        }
        return playerValues;
    }


//    public Player winner(){
//        HashMap<Player, Integer> playerValues = new HashMap<>();
//        for (Player player : this.players) {
//            playerValues.put(player, player.cardInHandValue());
//        }
//
//        Player winningPlayer = Collections.max(playerValues.entrySet(), Map.Entry.comparingByValue()).getKey();
//
//        return winningPlayer;
//    }

    public ArrayList<Player> winners(){
        HashMap<Player, Integer> playerValues = new HashMap<>();
        for (Player player : this.players) {
            playerValues.put(player, player.cardInHandValue());
        }

        ArrayList<Player> winningPlayers = new ArrayList<>();
        for (HashMap.Entry<Player, Integer> entry : playerValues.entrySet()) {
            if (entry.getValue() == (Collections.max(playerValues.values()))) {
                winningPlayers.add(entry.getKey());
            }
        }
        return winningPlayers;
    }









}

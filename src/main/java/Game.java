import java.util.*;

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

//  // Deal one card to each player
    public void dealerDealsCardsToPlayers() {
        dealer.getsCardsFromDeck(deck);

        for (Player player : this.players) {
            Card card = dealer.dealCard();
            player.addCard(card);
        }
    }

//  // Deal all cards to players until no cards in deck:
//    public void dealerDealsCardsToPlayers() {
//        dealer.getsCardsFromDeck(deck);
//        do {
//            for (Player player : this.players) {
//                Card card = dealer.dealCard();
//                player.addCard(card);
//            }
//        } while (dealer.countDealerCards() > 0);
//    }


//  // Winner if only two players
//    public Player winner() {
//        if (players.get(0).cardInHandValue() > players.get(1).cardInHandValue()){
//            return players.get(0);
//        } else {
//            return players.get(1);
//        }
//    }


//  // Scores for each player
    public HashMap<Player, Integer> playerHashMap() {
        HashMap<Player, Integer> playerValues = new HashMap<>();
        for (Player player : this.players) {
            playerValues.put(player, player.cardInHandValue());
        }
        return playerValues;
    }

//  // winner, returns only first winner if multiple have same score
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


//  // Return winner or multiple winners
    public ArrayList<Player> winners(){

        HashMap<Player, Integer> playerValues = new HashMap<>();

        for (Player player : this.players) {
            playerValues.put(player, player.cardInHandValue());
        }
        int highestHandValue = (Collections.max(playerValues.values()));


        ArrayList<Player> winningPlayers = new ArrayList<>();

        for (HashMap.Entry<Player, Integer> entry : playerValues.entrySet()) {
            if (entry.getValue() == highestHandValue) {
                winningPlayers.add(entry.getKey());
            }
        }
        return winningPlayers;
    }









}

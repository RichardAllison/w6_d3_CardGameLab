import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Player player1;
    Player player2;
    Player player3;
    Player player4;
    Dealer dealer;
    Deck deck;

    @Before
    public void before() {
        player1 = new Player("Ross");
        player2 = new Player("Richard");
        player3 = new Player("James");
        player4 = new Player("Douglas");
        dealer = new Dealer();
        deck = new Deck();
        game = new Game(deck, dealer);
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);
        game.addPlayer(player4);
    }

    @Test
    public void canAddPlayers() {
        assertEquals(2, game.playerCount());
    }

    @Test
    public void canDealCards() {
        game.dealerDealsCardsToPlayers();
        assertEquals(1, player1.handCardCount());
        assertEquals(1, player2.handCardCount());
    }

    @Test
    public void canCheckWinners() {
        game.dealerDealsCardsToPlayers();
//        System.out.println(game.winner());
//        System.out.println(game.winner().cardInHandValue());
        System.out.println(game.winners());
//        System.out.println(game.winners().get(0).cardInHandValue());
        System.out.println(game.playerHashMap());

    }
}

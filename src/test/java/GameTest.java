import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Player player1;
    Player player2;
    Dealer dealer;
    Deck deck;

    @Before
    public void before() {
        player1 = new Player("Ross");
        player2 = new Player("Richard");
        dealer = new Dealer();
        deck = new Deck();
        game = new Game(deck, dealer);
    }

    @Test
    public void canAddPlayers() {
        game.addPlayer(player1);
        game.addPlayer(player2);
        assertEquals(2, game.playerCount());
    }


}

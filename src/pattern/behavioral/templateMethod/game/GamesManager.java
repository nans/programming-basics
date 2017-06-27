package pattern.behavioral.templateMethod.game;
/* Игра "Монополия".
 * Original: https://ru.wikipedia.org/wiki/
 * */
public class GamesManager {
    public GamesManager() {
        final GameCode gameCode = GameCode.CHESS;

        Game game;

        switch (gameCode) {
            case CHESS:
                game = new Chess();
                break;
            case MONOPOLY:
                game = new Monopoly();
                break;
            default:
                throw new IllegalStateException();
        }

        game.playOneGame(2);
    }
}

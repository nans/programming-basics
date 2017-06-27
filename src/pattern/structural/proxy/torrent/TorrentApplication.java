package pattern.structural.proxy.torrent;

public class TorrentApplication {
    public TorrentApplication() {
        TorrentFile film = new TorrentFile("http://url.com");
        film.checkSum();
        film.download();
        film.checkSum();

        ProxyTorrentFile game = new ProxyTorrentFile("http://url.com");
        game.checkSum();
        game.download();
        game.checkSum();
    }
}

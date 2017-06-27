package pattern.structural.proxy.torrent;

public class ProxyTorrentFile {
    private String url;
    private TorrentFile file;

    public ProxyTorrentFile(String url) {
        this.url = url;
    }

    public void download() {
        if (file == null) {
            file = new TorrentFile(url);
        }
        file.download();
    }

    public void checkSum() {
        if (file == null) {
            System.out.println("File not loaded.");
            return;
        }
        file.checkSum();
    }
}

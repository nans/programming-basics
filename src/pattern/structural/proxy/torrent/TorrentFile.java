package pattern.structural.proxy.torrent;

public class TorrentFile implements Torrent {
    private String url;
    private Boolean isDownloaded = false;

    public TorrentFile(String url) {
        this.url = url;
    }

    @Override
    public void download() {
        System.out.println("File downloading by url: " + url);
        isDownloaded = true;
    }

    public void checkSum() {
        if (isDownloaded) {
            System.out.println("The test is successful.");
        } else {
            System.out.println("The test is not successful.");
        }
    }
}

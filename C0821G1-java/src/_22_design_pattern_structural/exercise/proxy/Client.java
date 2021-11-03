package _22_design_pattern_structural.exercise.proxy;

public class Client {
    public static void main(String[] args) {
        Downloader downloader = new FileDownloaderProxy();
        downloader.download();
    }
}

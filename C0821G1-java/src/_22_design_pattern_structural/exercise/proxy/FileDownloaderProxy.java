package _22_design_pattern_structural.exercise.proxy;

public class FileDownloaderProxy implements Downloader{
    private FileDownloader UserAgent;

    public FileDownloaderProxy(FileDownloader userAgent) {
        UserAgent = userAgent;
    }

    public FileDownloaderProxy() {

    }

    @Override
    public void download() {

    }
}

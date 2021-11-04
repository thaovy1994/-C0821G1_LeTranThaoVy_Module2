package _22_design_pattern_structural.exercise.proxy;

public class FileDownloaderProxy implements Downloader{
private FileDownloader fileDownloader;
private String userAgent;
public FileDownloaderProxy(String userAgent){
    this.userAgent=userAgent;
}
    @Override
    public void download(String url) {
        if(fileDownloader== null){
            fileDownloader = new FileDownloader(this.userAgent);
        }else{
            System.out.println("");
        }
    }
}

package _22_design_pattern_structural.exercise.proxy;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader implements Downloader {
    private String userAgent;

    public FileDownloader(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public void download(String url) {
        try {
            URL link = new URL("https://james.codegym.vn/mod/assign/view.php?id=9334");
            URLConnection u = link.openConnection();
        //ghi file trực tiếp trên phần mềm
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

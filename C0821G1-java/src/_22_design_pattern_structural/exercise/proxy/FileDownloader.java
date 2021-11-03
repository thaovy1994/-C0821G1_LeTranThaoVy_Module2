package _22_design_pattern_structural.exercise.proxy;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader implements Downloader {
    @Override
    public void download() {
        try {
            URL url = new URL("https://james.codegym.vn/mod/assign/view.php?id=9334");
            URLConnection u = url.openConnection();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

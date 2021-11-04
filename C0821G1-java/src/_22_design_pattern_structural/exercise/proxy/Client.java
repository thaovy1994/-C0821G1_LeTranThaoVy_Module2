package _22_design_pattern_structural.exercise.proxy;

public class Client {
    public static void main(String[] args) {
        FileDownloaderProxy downloader = new FileDownloaderProxy("FireFox");
        downloader.download("https://james.codegym.vn/mod/assign/view.php?id=9334");
        System.out.println("***");
        downloader.download("google.com");
    }
}

package _22_design_pattern_structural.practice.facade;

public class Client {
    public void share(String message) {
        //Lớp Client sử dụng SocialMediaFacade để chia sẻ lên các mạng xã hội.
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade(new Twitter(), new Facebook(), new LinkedIn());
        socialMediaFacade.share(message);
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.share("This is a post");
    }
}

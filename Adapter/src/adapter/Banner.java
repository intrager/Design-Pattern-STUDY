package adapter;

public class Banner {
    private String bannerString;

    public Banner (String str) {
        this.bannerString = str;
    }

    public void showWithParen() {
        System.out.println("(" + bannerString + ")");
    }

    public void showWithAsterisk() {
        System.out.println("**" + bannerString + "**");
    }
}

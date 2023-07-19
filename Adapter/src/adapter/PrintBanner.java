package adapter;

public class PrintBanner implements Print {

    // Composition
    Banner banner;

    public PrintBanner(String str) {
        banner = new Banner(str);
    }

    @Override
    public void printWeek() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAsterisk();
    }
}

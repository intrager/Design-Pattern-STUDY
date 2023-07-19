package proxy;

public class Main {

    public static void main(String[] args) {
        Printable p = new PrinterProxy("Bruce");
        System.out.println("현재의 이름은 : " + p.getPrinterName() + "입니다");
        p.setPrinterName("Johnson");
        System.out.println("현재의 이름은 : " + p.getPrinterName() + "입니다");

        p.print("Hello, world");
        p.print("test");
        p.setPrinterName("Gosling");
        System.out.println("현재의 이름은 : " + p.getPrinterName() + "입니다");
    }
}

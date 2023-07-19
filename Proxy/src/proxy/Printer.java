package proxy;

public class Printer implements Printable {

    private String name;

    public Printer(String name) {
        this.name = name;
        heavyJob("======= Printer 생성 중 =======");
    }

    @Override
    public void setPrinterName(String name) {
        System.out.println("real : setPrinterName() [" + name + "]");
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        System.out.println("real : getPrinterName() [" + name + "]");
        return name;
    }

    @Override
    public void print(String str) {
        System.out.println(name + " [real printing]");
        System.out.println(str);
    }

    private void heavyJob(String msg) {
        System.out.println(msg);

        for(int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }
        System.out.println("생성완료");
    }
}

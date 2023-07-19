package proxy;

public class PrinterProxy implements Printable{

    private String name;
    private Printer real; // 처음에는 null

    public PrinterProxy(String name) {
        this.name = name;
    }

    // 중간에 다른 쪽에서 생성될 수 있으므로 synchronized(동기화)
    @Override
    public synchronized void setPrinterName(String name) {
        if(real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
        System.out.println("PrinterProxy : setPrinterName() [" + name + "]");
    }

    @Override
    public String getPrinterName() {
        System.out.println("PrinterProxy : setPrinterName() [" + name + "]");
        return name;
    }

    // print가 일어날 때도 real subject와 관련된 일이므로 synchronized
    @Override
    public synchronized void print(String str) {
        real();
        real.print(str);
    }

    public void real() {
        if(real == null) {
            real = new Printer(name);
        }
    }
}

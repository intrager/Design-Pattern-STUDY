package factory.before;

public class Car {

    /**
     * 상수의 개수가 많아지면
     * 프로그램 내에서 오류가 발생할 수 있음
     * -> 클래스화할 수 있음
     */
    public static final String SONATA = "Sonata";
    public static final String GRANDEUR = "Grandeur";
    public static final String GENESIS = "Genesis";

    String productName;

    public Car(String productName) {
        this.productName = productName;
    }

    public String toString() {
        return productName;
    }
}

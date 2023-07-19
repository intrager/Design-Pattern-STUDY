package decorator;

public class CoffeeTest {
    public static void main(String[] args) {

        Coffee ethiopiaAmericano = new EthiopiaAmericano();
        ethiopiaAmericano.brewing();
        System.out.println("=======================");

        Coffee ethiopiaLatte = new Latte(ethiopiaAmericano);
        ethiopiaLatte.brewing();
        System.out.println("=======================");

        Coffee ethiopiaMochaLatte = new Mocha(new Latte(new EthiopiaAmericano()));
        ethiopiaMochaLatte.brewing();
        System.out.println("=======================");

        Coffee kenyaMochaLatte = new Mocha(new Latte(new KenyaAmericano()));
        kenyaMochaLatte.brewing();
        System.out.println("=======================");

        Mocha kenyaMocha = new Mocha(new KenyaAmericano());
        kenyaMocha.brewing();
        System.out.println("=======================");

        WhippedCream ethiopiaWhippedMocha =
                new WhippedCream(new Mocha(new EthiopiaAmericano()));
        ethiopiaWhippedMocha.brewing();
        System.out.println("=======================");
    }
}

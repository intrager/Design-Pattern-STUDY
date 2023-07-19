package composite;

public class Client {
    public static void main(String[] args) {
        ProductCategory womanCategory = new Category(1234, "Woman", 0);
        ProductCategory manCategory = new Category(5678, "Man", 0);

        ProductCategory clothesCategoryW = new Category(2345, "Clothes", 0);
        ProductCategory bagCategoryW = new Category(3456, "Bag", 0);
        ProductCategory shoesCategoryW = new Category(4567, "Shoes", 0);

        womanCategory.addProduct(clothesCategoryW);
        womanCategory.addProduct(bagCategoryW);
        womanCategory.addProduct(shoesCategoryW);

        ProductCategory clothesCategoryM = new Category(23450, "Clothes", 0);
        ProductCategory bagCategoryM = new Category(34650, "Bag", 0);
        ProductCategory shoesCategoryM = new Category(45670, "Shoes", 0);

        manCategory.addProduct(clothesCategoryM);
        manCategory.addProduct(bagCategoryM);
        manCategory.addProduct(shoesCategoryM);

        ProductCategory shoes1 = new Product(121, "MUSINSA", 777777);
        ProductCategory shoes2 = new Product(122, "ZIGZAG", 555555);
        ProductCategory shoes3 = new Product(123, "ABLY", 333333);
        ProductCategory shoes4 = new Product(124, "BRANDI", 222222);
        ProductCategory shoes5 = new Product(125, "MUST\'IT", 111111);
        ProductCategory shoes6 = new Product(126, "TRENBE", 130000);

        shoesCategoryW.addProduct(shoes1);
        shoesCategoryW.addProduct(shoes2);
        shoesCategoryW.addProduct(shoes3);

        shoesCategoryM.addProduct(shoes4);
        shoesCategoryM.addProduct(shoes5);
        shoesCategoryM.addProduct(shoes6);

        ProductCategory bag1 = new Product(121, "Dealicious", 140000);
        ProductCategory bag2 = new Product(122, "bejewel", 150000);
        ProductCategory bag3 = new Product(123, "Gollala", 160000);
        ProductCategory bag4 = new Product(124, "FNS Holdings", 170000);
        ProductCategory bag5 = new Product(125, "SwatchOn", 180000);
        ProductCategory bag6 = new Product(126, "Rapport Labs", 190000);

        bagCategoryW.addProduct(bag1);
        bagCategoryW.addProduct(bag2);
        bagCategoryW.addProduct(bag3);

        bagCategoryM.addProduct(bag4);
        bagCategoryM.addProduct(bag5);
        bagCategoryM.addProduct(bag6);

        System.out.println(womanCategory.getCount());
        System.out.println(womanCategory.getPrice());
        System.out.println(manCategory.getCount());
        System.out.println(manCategory.getPrice());
    }
}

package abstractfactory.domain.product.dao.mysql;

import abstractfactory.domain.product.Product;
import abstractfactory.domain.product.dao.ProductDAO;

public class ProductMySqlDAO implements ProductDAO {
    @Override
    public void insertProduct(Product product) {
        System.out.println("insert into MySQL DB productId = " + product.getProductId());
    }

    @Override
    public void deleteProduct(Product product) {
        System.out.println("delete into MySQL DB productId = " + product.getProductId());
    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("update into MySQL DB productId = " + product.getProductId());
    }
}

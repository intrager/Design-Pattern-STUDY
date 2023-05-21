package abstractfactory.domain.product.dao.oracle;

import abstractfactory.domain.product.Product;
import abstractfactory.domain.product.dao.ProductDAO;

public class ProductOracleDAO implements ProductDAO {
    @Override
    public void insertProduct(Product product) {
        System.out.println("insert into Oracle DB productId = " + product.getProductId());
    }

    @Override
    public void deleteProduct(Product product) {
        System.out.println("delete into Oracle DB productId = " + product.getProductId());
    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("update into Oracle DB productId = " + product.getProductId());
    }
}

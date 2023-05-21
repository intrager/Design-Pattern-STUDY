package abstractfactory.domain.product.dao;

import abstractfactory.domain.product.Product;

public interface ProductDAO {
    public void insertProduct(Product product);
    public void deleteProduct(Product product);
    public void updateProduct(Product product);
}

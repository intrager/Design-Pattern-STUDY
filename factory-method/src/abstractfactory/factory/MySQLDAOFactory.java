package abstractfactory.factory;

import abstractfactory.domain.product.dao.ProductDAO;
import abstractfactory.domain.product.dao.mysql.ProductMySqlDAO;
import abstractfactory.domain.userinfo.dao.UserInfoDAO;
import abstractfactory.domain.userinfo.dao.mysql.UserInfoMySqlDAO;

public class MySQLDAOFactory extends DaoFactory {
    @Override
    public UserInfoDAO createUserInfoDAO() {
        return new UserInfoMySqlDAO();
    }

    @Override
    public ProductDAO createProductDAO() {
        return new ProductMySqlDAO();
    }
}

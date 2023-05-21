package abstractfactory.factory;

import abstractfactory.domain.product.dao.ProductDAO;
import abstractfactory.domain.product.dao.oracle.ProductOracleDAO;
import abstractfactory.domain.userinfo.dao.UserInfoDAO;
import abstractfactory.domain.userinfo.dao.oracle.UserInfoOracleDAO;

public class OracleDAOFactory extends DaoFactory {
    @Override
    public UserInfoDAO createUserInfoDAO() {
        return new UserInfoOracleDAO();
    }

    @Override
    public ProductDAO createProductDAO() {
        return new ProductOracleDAO();
    }
}

package abstractfactory.factory;

import abstractfactory.domain.product.dao.ProductDAO;
import abstractfactory.domain.userinfo.dao.UserInfoDAO;

public abstract class DaoFactory {
    public abstract UserInfoDAO createUserInfoDAO();
    public abstract ProductDAO createProductDAO();
}

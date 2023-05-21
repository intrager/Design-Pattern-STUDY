package abstractfactory.client;

import abstractfactory.domain.product.Product;
import abstractfactory.domain.product.dao.ProductDAO;
import abstractfactory.domain.userinfo.UserInfo;
import abstractfactory.domain.userinfo.dao.UserInfoDAO;
import abstractfactory.factory.DaoFactory;
import abstractfactory.factory.MySQLDAOFactory;
import abstractfactory.factory.OracleDAOFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("db.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties prop = new Properties();
        try {
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String DB_TYPE = prop.getProperty("DB_TYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setPassword("!@#$%");
        userInfo.setUserName("사람");

        Product product = new Product();
        product.setProductId("0011AA");
        product.setProductName("IV");

        DaoFactory daoFactory = null;
        UserInfoDAO userInfoDAO = null;
        ProductDAO productDAO = null;

        if(DB_TYPE.equals("ORACLE")) daoFactory = new OracleDAOFactory();
        else if(DB_TYPE.endsWith("MYSQL")) daoFactory = new MySQLDAOFactory();
        else {
            System.out.println("DB support error");
            return;
        }

        userInfoDAO = daoFactory.createUserInfoDAO();
        productDAO = daoFactory.createProductDAO();

        System.out.println("--USERINFO TRANSACTION--");
        userInfoDAO.insertUserInfo(userInfo);
        userInfoDAO.updateUserInfo(userInfo);
        userInfoDAO.deleteUserInfo(userInfo);

        System.out.println("--PRODUCT TRANSACTION--");
        productDAO.insertProduct(product);
        productDAO.updateProduct(product);
        productDAO.deleteProduct(product);
    }
}

package com.pangtaek.management.product.model.service;


import com.pangtaek.common.SearchCondition;
import com.pangtaek.management.product.model.dao.ProductDAO;
import com.pangtaek.management.product.model.dto.ProductDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public class ProductService {
    private static ProductDAO productDAO;

    public List<ProductDTO> selectAllProductList() {
        SqlSession sqlSession = com.pangtaek.common.Template.getSession();
        productDAO = sqlSession.getMapper(ProductDAO.class);

        List<ProductDTO> productList = productDAO.selectAllProductList();

        sqlSession.close();

        return productList;
    }

    public List<ProductDTO> selectProductByCondition(SearchCondition searchCondition) {

        SqlSession sqlSession = com.pangtaek.common.Template.getSession();
        productDAO = sqlSession.getMapper(ProductDAO.class);

        List<ProductDTO> productList = productDAO.selectProductByCondition(searchCondition);

        sqlSession.close();

        return productList;
    }

    public boolean registNewProduct(ProductDTO product) {
        SqlSession sqlSession = com.pangtaek.common.Template.getSession();
        productDAO = sqlSession.getMapper(ProductDAO.class);

        int result = productDAO.insertProduct(product);

        if (result > 0) {
            sqlSession.commit();
            sqlSession.close();

            return true;
        } else {
            sqlSession.rollback();
            sqlSession.close();

            return false;
        }
    }

    public boolean modifyProductInfo(ProductDTO product) {
        SqlSession sqlSession = com.pangtaek.common.Template.getSession();
        productDAO = sqlSession.getMapper(ProductDAO.class);

        int result = productDAO.updateProduct(product);

        if (result > 0) {
            sqlSession.commit();
            sqlSession.close();

            return true;
        } else {
            sqlSession.rollback();
            sqlSession.close();

            return false;
        }
    }

    public boolean deleteProduct(Map<String, String> parameter) {
        SqlSession sqlSession = com.pangtaek.common.Template.getSession();
        productDAO = sqlSession.getMapper(ProductDAO.class);

        int result = productDAO.deleteProduct(parameter);

        if (result > 0) {
            sqlSession.commit();
            sqlSession.close();
            return true;
        } else {
            sqlSession.rollback();
            sqlSession.close();
            return false;
        }

    }
}
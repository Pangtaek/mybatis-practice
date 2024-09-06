package com.pangtaek.management.product.model.dao;

import com.pangtaek.common.SearchCondition;
import com.pangtaek.management.product.model.dto.ProductDTO;

import java.util.List;
import java.util.Map;

public interface ProductDAO {

    List<ProductDTO> selectAllProductList();

    List<ProductDTO> selectProductByCondition(SearchCondition searchCondition);

    int insertProduct(ProductDTO product);

    int updateProduct(ProductDTO product);

    int deleteProduct(Map<String, String> parameter);
}

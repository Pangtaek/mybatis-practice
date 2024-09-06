package com.pangtaek.management.product.controller;

import com.pangtaek.common.SearchCondition;
import com.pangtaek.management.product.model.dto.ProductDTO;
import com.pangtaek.management.product.model.service.ProductService;
import com.pangtaek.management.product.view.ProductPrint;

import java.util.List;
import java.util.Map;

public class ProductController {
    public void selectAllProductList() {
        ProductService productService = new ProductService();
        List<ProductDTO> productList = productService.selectAllProductList();
        ProductPrint productPrint = new ProductPrint();

        if (productList != null && !productList.isEmpty()) {
            productPrint.printAllProductList(productList);
        } else {
            productPrint.printErrorMessage("EMPTY LIST");
        }
    }

    public void selectProductByCondition(SearchCondition searchCondition) {

        ProductService productService = new ProductService();
        List<ProductDTO> productList = productService.selectProductByCondition(searchCondition);
        ProductPrint productPrint = new ProductPrint();

        if (productList != null && !productList.isEmpty()) {
            productPrint.printAllProductList(productList);
        } else {
            productPrint.printErrorMessage("EMPTY LIST");
        }
    }


    public void registNewProduct(ProductDTO productDTO) {
        ProductService productService = new ProductService();
        productDTO.setReleaseDate(productDTO.getReleaseDate().replace("-", ""));
        productDTO.setProductionStatus("Y");

        List<ProductDTO> list = productService.selectAllProductList();
        boolean isFirst = true;
        for (ProductDTO product : list) {
            if (productDTO.getProductName().equals(product.getProductName())) {
                isFirst = false;
                break;
            }
        }
        if (isFirst) {
            productDTO.setProductionStatus("Y");
            productDTO.setSalesQuantity("0");
        }

        boolean result = productService.registNewProduct(productDTO);
        ProductPrint productPrint = new ProductPrint();

        if (result) {
            productPrint.printSuccessMessage("INSERTED SUCCESSFULLY");
        } else {
            productPrint.printErrorMessage("INSERTED FAIL");
        }
    }

    public void modifyProductInfo(ProductDTO product) {
        product.setReleaseDate(product.getReleaseDate().replace("-", ""));
        ProductService productService = new ProductService();
        ProductPrint productPrint = new ProductPrint();



        boolean result = productService.modifyProductInfo(product);


        if (result) {
            productPrint.printSuccessMessage("UPDATED SUCCESSFULLY");
        } else {
            productPrint.printErrorMessage("UPDATED FAIL");
        }

    }

    public void deleteProduct(Map<String, String> parameter) {
        ProductService productService = new ProductService();
        ProductPrint productPrint = new ProductPrint();
        boolean result = productService.deleteProduct(parameter);

        if (result) {
            productPrint.printSuccessMessage("DELETED SUCCESSFULLY");
        }else{
            productPrint.printErrorMessage("DELETED FAIL");
        }

    }
}

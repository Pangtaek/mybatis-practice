package com.pangtaek.management.product.view;

import com.pangtaek.common.SearchCondition;
import com.pangtaek.management.product.model.dto.ProductDTO;

import java.util.List;

public class ProductPrint {

    // * 모든 출력은 System.out.println()을 통해 콘솔에 출력하는 것을 의미합니다.
    // 주석을 지우고 다음 네 가지 메소드를 작성하세요.

    public void printAllProductList(List<ProductDTO> allProductList) {
        allProductList.forEach(System.out::println);
    }

    public void printProductList(List<ProductDTO> productList, SearchCondition searchCondition) {

        // 2. 조건에 따라 조회한 목록을 출력하는 메소드
        //    (조건 1) SearchCondition 객체로 검색 조건이 무엇인지 출력하세요.
        //    (조건 2) List<ProductDTO>로 받아온 데이터 목록을 전체 출력하세요.

    }

    public void printSuccessMessage(String successCode) {
        switch (successCode) {
            case "INSERTED SUCCESSFULLY":
                System.out.println("새로운 상품을 등록했습니다.");
                break;
            case "UPDATED SUCCESSFULLY":
                System.out.println("상품 정보 수정을 완료했습니다.");
                break;
            case "DELETED SUCCESSFULLY":
                System.out.println("제품 정보를 삭제했습니다.");
                break;
            default:
                break;
        }


    }

    public void printErrorMessage(String errorCode) {
        switch (errorCode) {
            case "EMPTY LIST":
                System.out.println("ERROR: 검색 결과가 없습니다.");
                break;
            case "INSERTED FAILED":
                System.out.println("ERROR: 상품 등록에 실패했습니다.");
                break;
            case "UPDATED FAIL":
                System.out.println("ERROR: 상품 정보 수정을 실패했습니다.");
                break;
            case "DELETED FAIL":
                System.out.println("ERROR: 제품 정보 삭제에 실패했습니다.");
                break;
            default:
                break;
        }

    }

}
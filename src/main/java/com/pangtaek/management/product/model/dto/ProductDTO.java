package com.pangtaek.management.product.model.dto;

public class ProductDTO {
    private  int productCode;               // 제품코드
    private String productName;             // 제품명
    private String originCost;              // 원가
    private String releaseDate;             // 출시일
    private String discountRate;            // 할인률
    private String salesQuantity;           // 판매량
    private String stockQuantity;           // 재고량
    private String categoryCode;            // 제품분류코드
    private String productionStatus;        // 생산여부

    public ProductDTO() {
    }

    public ProductDTO(int productCode, String productName, String originCost, String releaseDate, String discountRate, String salesQuantity, String stockQuantity, String categoryCode, String productionStatus) {
        this.productCode = productCode;
        this.productName = productName;
        this.originCost = originCost;
        this.releaseDate = releaseDate;
        this.discountRate = discountRate;
        this.salesQuantity = salesQuantity;
        this.stockQuantity = stockQuantity;
        this.categoryCode = categoryCode;
        this.productionStatus = productionStatus;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getOriginCost() {
        return originCost;
    }

    public void setOriginCost(String originCost) {
        this.originCost = originCost;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(String discountRate) {
        this.discountRate = discountRate;
    }

    public String getSalesQuantity() {
        return salesQuantity;
    }

    public void setSalesQuantity(String salesQuantity) {
        this.salesQuantity = salesQuantity;
    }

    public String getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(String stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getProductionStatus() {
        return productionStatus;
    }

    public void setProductionStatus(String productionStatus) {
        this.productionStatus = productionStatus;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "productCode=" + productCode +
                ", productName='" + productName + '\'' +
                ", originCost='" + originCost + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", discountRate='" + discountRate + '\'' +
                ", salesQuantity='" + salesQuantity + '\'' +
                ", stockQuantity='" + stockQuantity + '\'' +
                ", categoryCode='" + categoryCode + '\'' +
                ", productionStatus='" + productionStatus + '\'' +
                '}';
    }
}

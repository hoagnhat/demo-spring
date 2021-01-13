package com.example.spring_demo2.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class TempEntityPK implements Serializable {
    private long productId;
    private long categoryId;

    @Column(name = "productID", nullable = false)
    @Id
    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    @Column(name = "categoryID", nullable = false)
    @Id
    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TempEntityPK that = (TempEntityPK) o;
        return productId == that.productId && categoryId == that.categoryId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, categoryId);
    }
}

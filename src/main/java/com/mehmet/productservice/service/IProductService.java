package com.mehmet.productservice.service;

import com.mehmet.productservice.enums.Language;
import com.mehmet.productservice.repository.entity.product;
import com.mehmet.productservice.request.ProductCreateRequest;
import com.mehmet.productservice.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService
{
    product createProduct(Language language , ProductCreateRequest productCreateRequest);

    product getProduct(Language language,Long productId);

    List<product> getProducts(Language language);// tüm kayıtları döner

    product updateProduct(Language language, Long productId, ProductUpdateRequest productUpdateRequest);// Kayıtları güncellemekek için

    product deleteProduct(Language language, Long productId);
}

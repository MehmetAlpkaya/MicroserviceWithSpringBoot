package com.mehmet.productservice.repository.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product",schema = "stock_managment")
public class product {
    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//primary key değerlerinin hangi strateji ile oluşturulacağının IDENTITY: den başlayıp artarak ilerler
    private Long productId;

    @Column(name = "prudct_name")
    private String productName;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price")
    private double price;

    @Builder.Default // BU ALLANI CONSTRUCTER İLE DEFAULT OLARAK HER ZAMAN PARAMETRE OLARAK GEÇECEK DEMEK
    @Column(name="product_update_date")
    @Temporal(TemporalType.TIMESTAMP )// Bu annotation temporeal tipe
    @JsonFormat(pattern = "yy-MM-dd")
    private Date productUpdateDate=new Date();

    @Builder.Default
    @Column(name = "product_create_date")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yy-MM-dd")
    private Date productCreateDate=new Date();

    //crudRepository :Crud işlemlerini yapar yani save saveAll findById findAll delete gibi metodlar barındırır.
    //pagingAndSorting : paginations ve sorting işlemleri içerir içerisinde findAll mmetodları bullundurur
    //jpaRepository : Crud repository ve paginations and sorting repositorynin içerdiği tüm metodları içerir ve aynı zmanda
    //batch kayıtlarını silme ve flashinfg gibi metodları da vardır
    @Column(name = "is_deleted")
    private boolean deleted;
}

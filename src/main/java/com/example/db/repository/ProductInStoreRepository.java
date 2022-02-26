package com.example.db.repository;

import com.example.db.model.ProductInStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductInStoreRepository extends JpaRepository<ProductInStore, Integer> {

//    @Query(value = "select * from product_in_store as pis join product as p on pis.product_id=p.product_id",nativeQuery = true)
//    List<ProductInStore> findProductsInStore();
//
//    @Query(value = "select * from product_in_store as pis where product_in_store_id=?",nativeQuery = true)
//    List<ProductInStore> findProductInStoreById();
//
//    @Query(value= "select p.names, p.in_store, pis.product_in_store_id, c.catalogue_id, c.type_, os.web_address, pr.price\n" +
//            "from product as p\n" +
//            "join product_in_store as pis on p.product_id=pis.product_id\n" +
//            "join existss as e on pis.product_in_store_id=e.product_in_store_id\n" +
//            "join catalogue as c on e.catalogue_id=c.catalogue_id\n" +
//            "join online_stores as os on e.store_id=os.store_id\n" +
//            "join price as pr on pis.product_in_store_id=pr.product_in_store_id\n" +
//            "\n" +
//            "group by 1, 2, 3, 4, 5, 6, 7;\n" +
//            "\n" +
//            "select pc.names, pc.in_store, pc.product_in_store_id, pc.catalogue_id, pc.type_, pc.web_address, pc.price as najniska_cena\n" +
//            "from produkti_cena as pc\n" +
//            "where pc.price = (select min(price) from produkti_cena)",nativeQuery = true)
//    List<ProductInStore> findProductInStoreByLowestPrice();
}
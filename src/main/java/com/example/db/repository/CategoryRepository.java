package com.example.db.repository;

import com.example.db.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

//    @Query(value="select * from category where category_id=?", nativeQuery = true)
//    Optional<Category> findByCategoryId();
//
//    @Query(value="select distinct c.category_id, c.category_name,\n" +
//            "case when tabela.naracan_proizvod >= 1 then tabela.naracan_proizvod else 0 end as naracani_proizvodi\n" +
//            "from category as c\n" +
//            "join product as p on p.category_id = c.category_id\n" +
//            "join product_in_store as pis on p.product_id=pis.product_id\n" +
//            "join orders as o on o.product_in_store_id=pis.product_in_store_id\n" +
//            "join(\n" +
//            "\tselect distinct c2.category_id, c2.category_name, count(o.product_in_store_id) as naracan_proizvod\n" +
//            "\tfrom category as c2\n" +
//            "\tjoin product as p on p.category_id=c2.category_id\n" +
//            "\tjoin product_in_store as pis on p.product_id=pis.product_id\n" +
//            "\tjoin orders as o on o.product_in_store_id=pis.product_in_store_id\n" +
//            "\tgroup by 1, 2\n" +
//            ") as tabela on c.category_id=tabela.category_id",nativeQuery = true)
//    List<Category> findAllByCategory();
}
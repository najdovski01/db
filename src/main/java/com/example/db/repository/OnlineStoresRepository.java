package com.example.db.repository;

import com.example.db.model.OnlineStores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OnlineStoresRepository extends JpaRepository<OnlineStores, Integer> {

    @Query(value="select * from online_stores as os join product_in_store as pis on os.store_id=pis.store_id",nativeQuery = true)
    List<OnlineStores> findAllOnlineStores();

    @Query(value="select * from online_stores as os join product_in_store as pis on os.store_id=pis.store_id where os.store_id=?",nativeQuery = true)
    List<OnlineStores> findOnlineStoresById();

    @Query(value="select os.names, os.store_id,\n" +
            "coalesce((\n" +
            "\tselect count(pis.product_in_store_id)\n" +
            "\tfrom online_stores as os\n" +
            "\tjoin product_in_store as pis on os.store_id=pis.store_id\n" +
            "\t),0) as vkupno_proizvodi,\n" +
            "(\n" +
            "\tselect sum(p.price)\n" +
            "\tfrom online_stores as os\n" +
            "\tjoin product_in_store as pis on os.store_id=pis.store_id\n" +
            "\tjoin price as p on pis.product_in_store_id=p.product_in_store_id\n" +
            "\t\n" +
            ") as vkupna_vrednost,\n" +
            "(\n" +
            "select avg(p.price)\n" +
            "\tfrom online_stores as os\n" +
            "\tjoin product_in_store as pis on os.store_id=pis.store_id\n" +
            "\tjoin price as p on pis.product_in_store_id=p.product_in_store_id\n" +
            "\t\n" +
            ") as prosek_vrednost,\n" +
            "(\n" +
            "select count(sb.shopping_id)\n" +
            "\tfrom online_stores as os \n" +
            "\tjoin product_in_store as pis on os.store_id=pis.product_id\n" +
            "\tjoin orders as ord on pis.product_in_store_id=ord.product_in_store_id\n" +
            "\tjoin shopping_bag as sb on ord.shopping_id=sb.shopping_id\n" +
            "\twhere sb.order_date between now() - interval '3 months' and now()\n" +
            ") as vkupno_naracki\n" +
            "\n" +
            "\t\n" +
            "from online_stores as os\n" +
            "group by 1, 2\n" +
            "\n", nativeQuery = true)
    List<OnlineStores> findAllBySoldProducts();
}
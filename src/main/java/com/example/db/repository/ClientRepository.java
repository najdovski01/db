package com.example.db.repository;

import com.example.db.model.Client.Client;
import com.example.db.model.Client.ClientCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;


public interface ClientRepository extends JpaRepository<Client, ClientCompositeKey> {

//    @Query(value = "select * from project.client where user_id=?", nativeQuery = true)
//    Optional<Client> findClient(Integer user_id);
//
//    @Query(value = "select * from project.client ", nativeQuery = true)
//    public Optional<Client> findAllClients();
//
//    @Query(value="SELECT DISTINCT u.user_name, u.surname,\n" +
//            "CASE WHEN tabela.quarter=1 THEN tabela.kupeni_proizvodi ELSE 0 END AS prv_kvartal,\n" +
//            "CASE WHEN tabela.quarter=2 THEN tabela.kupeni_proizvodi ELSE 0 END AS vtor_kvartal,\n" +
//            "CASE WHEN tabela.quarter=3 THEN tabela.kupeni_proizvodi ELSE 0 END AS tret_kvartal,\n" +
//            "CASE WHEN tabela.quarter=4 THEN tabela.kupeni_proizvodi ELSE 0 END AS cetvrt_kvartal,\n" +
//            "\n" +
//            "CASE WHEN tabela.quarter=1 THEN tabela.suma ELSE 0 END AS prv_kvartal_suma,\n" +
//            "CASE WHEN tabela.quarter=1 THEN tabela.suma ELSE 0 END AS vtor_kvartal_suma,\n" +
//            "CASE WHEN tabela.quarter=1 THEN tabela.suma ELSE 0 END AS tret_kvartal_suma,\n" +
//            "CASE WHEN tabela.quarter=1 THEN tabela.suma ELSE 0 END AS cetvrt_kvartal_suma\n" +
//            "\n" +
//            "FROM project.shopping_bag AS sb\n" +
//            "JOIN client AS c ON sb.user_id = c.user_id\n" +
//            "JOIN users AS u ON c.user_id = u.user_id\n" +
//            "JOIN orders AS o ON sb.shopping_id = o.shopping_id\n" +
//            "JOIN product_in_store AS pis ON o.product_in_store_id = pis.product_in_store_id\n" +
//            "JOIN price AS pr ON pis.product_in_store_id = pr.product_in_store_id\n" +
//            "JOIN (\n" +
//            "\n" +
//            "SELECT DISTINCT c2.user_id, extract(quarter FROM sb2.order_date) AS quarter, sum(pr.price) AS suma,\n" +
//            "count(sb2.shopping_id) AS kupeni_proizvodi\n" +
//            "FROM shopping_bag AS sb2\n" +
//            "JOIN orders AS o ON sb2.shopping_id = o.shopping_id\n" +
//            "JOIN product_in_store AS pis ON o.product_in_store_id = pis.product_in_store_id\n" +
//            "join price as pr on pis.product_in_store_id=pr.product_in_store_id\n" +
//            "JOIN client AS c2 ON c2.user_id = sb2.user_id\n" +
//            "GROUP BY 1,2\n" +
//            ") AS tabela ON c.user_id = tabela.user_id",nativeQuery = true)
//    public List<Client> findLoyalClient(Integer shopping_id);
//

}

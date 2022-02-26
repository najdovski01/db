package com.example.db.repository;

import com.example.db.model.Roles;
import com.example.db.model.WorksAs.WorksAs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RolesRepository extends JpaRepository<Roles, Integer> {
//    @Query(value="select os.store_id, os.names, u.user_name, u.surname, wa.works_from, r.role_name, r.role_desc\n" +
//            "from online_stores as os\n" +
//            "join store_employee as se on os.store_id=se.store_id\n" +
//            "join users as u on se.user_id=u.user_id\n" +
//            "join works_as as wa on se.user_id=wa.user_id\n" +
//            "join roles as r on wa.id_role=r.id_role\n" +
//            "where extract(year from now()) - extract(year from wa.works_from) >= 6", nativeQuery = true)
//    List<Roles> findAllByRole();
}
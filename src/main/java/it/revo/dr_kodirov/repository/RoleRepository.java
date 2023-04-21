package it.revo.dr_kodirov.repository;

import it.revo.dr_kodirov.entity.Role;
import it.revo.dr_kodirov.entity.enums.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("http://127.0.0.1:5173")
public interface RoleRepository extends JpaRepository<Role, Integer> {
    List<Role> findRoleByRoleName(RoleName roleName);
}

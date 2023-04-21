package it.revo.dr_kodirov.repository;

import it.revo.dr_kodirov.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;
import java.util.UUID;

@CrossOrigin("http://127.0.0.1:5173")
public interface AuthRepository extends JpaRepository<User, UUID> {
    boolean existsByPhoneNumber(String phoneNumber);

    Optional<User> findUserByPhoneNumber(String phoneNumber);
}

package it.revo.dr_kodirov.component;

import it.revo.dr_kodirov.entity.Contact;
import it.revo.dr_kodirov.entity.Role;
import it.revo.dr_kodirov.entity.Tarmoqlar;
import it.revo.dr_kodirov.entity.User;
import it.revo.dr_kodirov.entity.enums.AwareStatus;
import it.revo.dr_kodirov.entity.enums.RoleName;
import it.revo.dr_kodirov.repository.AuthRepository;
import it.revo.dr_kodirov.repository.RoleRepository;
import it.revo.dr_kodirov.repository.rest.ContactRepository;
import it.revo.dr_kodirov.repository.rest.TarmoqlarlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class DataLoader implements CommandLineRunner {
    @Autowired
    AuthRepository authRepository;

    @Autowired
    TarmoqlarlRepository tarmoqlarlRepository;

    @Autowired
    ContactRepository contactRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String initMode;

    @Override
    public void run(String... args) throws Exception {
        if (initMode.equals("update")) {
            roleRepository.save(
                    new Role(
                            RoleName.ADMIN
                    )
            );
            roleRepository.save(
                    new Role(
                            RoleName.USER
                    )
            );
            contactRepository.save(
                    new Contact(
                            "bla bla",
                            "fas@gmail.com",
                            "0987654321",
                            "adasdsadsa",
                            "salomboy qozilar"
                    )
            );
            tarmoqlarlRepository.save(
                    new Tarmoqlar(
                            "instagram",
                            "telegram",
                            "watsapp",
                            "facebook",
                            "google",
                            "youtube"
                    )
            );
            authRepository.save(
                    new User(
                            "Doctor",
                            "Kodirov",
                            "912218588",
                            passwordEncoder.encode("Doctor123"),
                            roleRepository.findAll()
                    )
            );
        }
    }
}

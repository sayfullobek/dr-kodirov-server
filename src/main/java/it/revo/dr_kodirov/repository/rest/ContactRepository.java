package it.revo.dr_kodirov.repository.rest;

import it.revo.dr_kodirov.entity.Contact;
import it.revo.dr_kodirov.projection.CustomCarusel;
import it.revo.dr_kodirov.projection.CustomContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.UUID;

@CrossOrigin("http://127.0.0.1:5173")
@RepositoryRestResource(path = "contact", collectionResourceRel = "list", excerptProjection = CustomContact.class)
public interface ContactRepository extends JpaRepository<Contact, UUID> {
}

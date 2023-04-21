package it.revo.dr_kodirov.repository.rest;

import it.revo.dr_kodirov.entity.Carusel;
import it.revo.dr_kodirov.entity.Message;
import it.revo.dr_kodirov.projection.CustomCarusel;
import it.revo.dr_kodirov.projection.CustomMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.UUID;

@CrossOrigin("http://127.0.0.1:5173")
@RepositoryRestResource(path = "message", collectionResourceRel = "list", excerptProjection = CustomMessage.class)
public interface MessageRepository extends JpaRepository<Message, UUID> {
}

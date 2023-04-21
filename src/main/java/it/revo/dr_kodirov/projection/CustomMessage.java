package it.revo.dr_kodirov.projection;

import it.revo.dr_kodirov.entity.Carusel;
import it.revo.dr_kodirov.entity.Message;
import org.springframework.data.rest.core.config.Projection;

import java.util.UUID;

@Projection(types = Message.class, name = "customMessage")
public interface CustomMessage {
    UUID getId();

    String getName();

    String getPhoneNumber();

    String getMessage();
}

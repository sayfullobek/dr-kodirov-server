package it.revo.dr_kodirov.projection;

import it.revo.dr_kodirov.entity.Contact;
import org.springframework.data.rest.core.config.Projection;

import java.util.UUID;

@Projection(types = Contact.class, name = "customContact")
public interface CustomContact {
    UUID getId();

    String getAddress();

    String getEmail();

    String getPhoneNumber();

    String getWorkAddress();

    String getMalumotlarim();
}

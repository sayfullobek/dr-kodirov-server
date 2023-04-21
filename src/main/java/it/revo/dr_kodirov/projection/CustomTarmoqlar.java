package it.revo.dr_kodirov.projection;

import it.revo.dr_kodirov.entity.Contact;
import it.revo.dr_kodirov.entity.Tarmoqlar;
import org.springframework.data.rest.core.config.Projection;

import java.util.UUID;

@Projection(types = Tarmoqlar.class, name = "customTarmoqlar")
public interface CustomTarmoqlar {
    UUID getId();

    String getInstagram();

    String getTelegram();

    String getWatsapp();

    String getFacebook();

    String getGoogle();

    String getYoutube();
}

package it.revo.dr_kodirov.projection;

import it.revo.dr_kodirov.entity.Carusel;
import org.springframework.data.rest.core.config.Projection;

import java.util.UUID;

@Projection(types = Carusel.class, name = "customCarusel")
public interface CustomCarusel {
    UUID getId();

    String getNameUz();

    String getNameEn();

    String getNameRu();

    String getDescriptionUz();

    String getDescriptionEn();

    String getDescriptionRu();

    String getImg();
}

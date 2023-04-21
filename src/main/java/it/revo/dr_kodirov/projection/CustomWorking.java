package it.revo.dr_kodirov.projection;

import it.revo.dr_kodirov.entity.Working;
import org.springframework.data.rest.core.config.Projection;

import java.util.UUID;

@Projection(types = Working.class, name = "customWorking")
public interface CustomWorking {
    UUID getId();

    String getNameUz();

    String getNameEn();

    String getNameRu();

    String getDescriptionUz();

    String getDescriptionEn();

    String getDescriptionRu();

    String getImg();
}

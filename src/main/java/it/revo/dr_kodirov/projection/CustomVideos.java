package it.revo.dr_kodirov.projection;

import it.revo.dr_kodirov.entity.Videos;
import it.revo.dr_kodirov.entity.Working;
import org.springframework.data.rest.core.config.Projection;

import java.util.UUID;

@Projection(types = Videos.class, name = "customVideos")
public interface CustomVideos {
    UUID getId();

    String getNameUz();

    String getNameEn();

    String getNameRu();

    String getVideos();

    String getImg();
}

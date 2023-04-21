package it.revo.dr_kodirov.repository.rest;

import it.revo.dr_kodirov.entity.Videos;
import it.revo.dr_kodirov.projection.CustomVideos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.UUID;

@CrossOrigin("http://127.0.0.1:5173")
@RepositoryRestResource(path = "videos", collectionResourceRel = "list", excerptProjection = CustomVideos.class)
public interface VideosRepository extends JpaRepository<Videos, UUID> {
}

package it.revo.dr_kodirov.repository.rest;

import it.revo.dr_kodirov.entity.Carusel;
import it.revo.dr_kodirov.projection.CustomCarusel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.UUID;

@CrossOrigin("http://127.0.0.1:5173")
@RepositoryRestResource(path = "carusel", collectionResourceRel = "list", excerptProjection = CustomCarusel.class)
public interface CaruselRepository extends JpaRepository<Carusel, UUID> {
}

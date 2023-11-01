package web.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.mvc.domain.Place;

public interface PlaceRepository extends JpaRepository<Place, Long> {

    Place findPlaceByVideoId(Long videoId);
}

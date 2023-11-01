package web.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.mvc.domain.Video;

import java.util.List;

public interface VideoRepository extends JpaRepository<Video, Long> {

}

package web.mvc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import web.mvc.domain.Place;
import web.mvc.domain.Video;
import web.mvc.repository.PlaceRepository;
import web.mvc.repository.VideoRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class HomeServiceImpl implements HomeService {
    private final VideoRepository videoRepository;
    private final PlaceRepository placeRepository;

    @Override
    public List<Video> findVideoAll() {
        List<Video> videoList = videoRepository.findAll();
        return videoList;
    }

    @Override
    public Place findPlaceInfo(Long videoId) {
        Place place = placeRepository.findPlaceByVideoId(videoId);
        return place;
    }

    @Override
    public List<Place> findPlaceAll() {
        List<Place> placeList = placeRepository.findAll();
        return placeList;
    }
}

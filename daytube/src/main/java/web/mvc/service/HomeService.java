package web.mvc.service;

import web.mvc.domain.Place;
import web.mvc.domain.Video;

import java.util.List;

public interface HomeService {
    /**
     * 전체 영상 조회 Video 조회
     * @return
     */
    public List<Video> findVideoAll();

    /**
     * 해당 장소 정보 조회
     * @return
     */
    public Place findPlaceInfo(Long videoId);

    /**
     * 장소 전부 검색 (데이터 틀 용)
     */
    public List<Place> findPlaceAll();

}

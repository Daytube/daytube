package web.mvc;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import web.mvc.domain.Place;
import web.mvc.domain.Video;
import web.mvc.service.HomeService;

import java.util.List;

@SpringBootTest
@Transactional
public class HomeTest {
    @Autowired
    private HomeService homeService;

    //url title youtuber place
    @Test
    void 전체비디오조회() {
        List<Video> videoList = homeService.findVideoAll();

        for (Video video : videoList) {
            System.out.println("{");
            System.out.println("    id: " + video.getId() + ",");
            System.out.println("    url: " + video.getLink()+",");
            System.out.println("    youtuber: " + video.getYoutuber()+",");
            System.out.println("    title: " + video.getPlaces());
            System.out.println("}");
            System.out.println("-------------------------");
        }
    }

    //name, location, grade, hours, contact
    @Test
    void 전체장소조회() {
        List<Place> placeList = homeService.findPlaceAll();

        for (Place place : placeList) {
            System.out.println("{");
            System.out.println("    id: " + place.getId() + ",");
            System.out.println("    name: " + place.getName() + ",");
            System.out.println("    location: " + place.getLocation()+",");
            System.out.println("    grade: " + place.getGrade()+",");
            System.out.println("    hours: " + place.getHours()+",");
            System.out.println("    contact: " + place.getContact());
            System.out.println("}");
            System.out.println("-------------------------");
        }
    }
}

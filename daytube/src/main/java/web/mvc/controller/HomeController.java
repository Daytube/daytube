package web.mvc.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import web.mvc.domain.Place;
import web.mvc.domain.Video;
import web.mvc.service.HomeService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HomeController {
    private final HomeService homeService;

    @GetMapping("/home")
    public String videoList(Model model) {
        List<Video> videoList = homeService.findVideoAll();
        model.addAttribute("videoList", videoList);
        return "home";
    }

    @GetMapping("/getPlace")
    public String placeInfo(@RequestParam Long videoId, Model model) {
        Place place = homeService.findPlaceInfo(videoId);
        model.addAttribute("placeInfo", place);
        return "placeInfo";
    }

}

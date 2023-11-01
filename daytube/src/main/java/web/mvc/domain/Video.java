package web.mvc.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.nio.file.LinkOption;

@Entity
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String youtuber; // 유튜버
    private String title; // 영상 제목
    private String link; // 영상 링크
    private String places; // 영상 장소들 '|' 로 파싱 되어있음
}

package web.mvc.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name; // 장소명
    private String location; // 위치
    private String grade; // 평점
    private String hours; // 운영시간
    private String contact; // 연락처
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "video_id")
    private Video video;
    private String map; // 지도주소
    private int taste; // 맛
    private int cost; // 가성비
    private int mood; // 분위기
    private int service; // 서비스
    private int revisiting; // 재방문의사


}

package site.metacoding.test5;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Data를 리턴
public class NumberController {

    @CrossOrigin // DMZ 개방
    // 다른 도메인의 자바스크립트 요청만 금지
    @GetMapping("/number")
    public List<Integer> number() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println(list);
        // ViewResolver 작동(@Controller) = 파일을 찾아주는 친구
        // MessageConverter 작동(@RestController) = JSON으로 변환해서 응답 {"list" : [1, 2, 3, 4]}
        return list; // [1, 2, 3, 4]
    }

    @GetMapping("/user")
    public User user() {
        User u = new User(1, "ssar", "1234");
        System.out.println(u);
        return u;
    }
}

package com.hoon.webService.webController;

import com.hoon.webService.domain.posts.PostsRepository;
import com.hoon.webService.dto.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
/*
@AllArgsConstructor 어노테이션을 사용하면 생성자를 대신 생성해주기 때문에
PostRepository를 주입 받을때 @Autowired를 사용하지 않아도 된다.
참고로 @Autowired는 비권장방식이다.
*/
public class WebRestController {

    private PostsRepository postsRepository;

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto) {
        postsRepository.save(dto.toEntity());
    }

}

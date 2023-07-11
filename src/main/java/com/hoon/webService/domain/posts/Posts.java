package com.hoon.webService.domain.posts;

import com.hoon.webService.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Posts extends BaseTimeEntity {

    @Id
    @GeneratedValue
    private Long id;
    /*
    @Id 어노테이션은 테이블 pk를 나타낸다.
    @GeneratedValue 어노테이션은 테이블의 pk 생성규칙을 나타내는데,
    디폴트값은 auto로, 번호를 자동증가하는 정수형 값이 된다.
    */

    @Column(length = 500, nullable = false)
    private String title;
    /*
    @Column 어노테이션은 테이블의 컬럼을 나타내는 어노테이션으로 굳이 사용하지 않아도 된다.
    사용하는 경우는 컬럼의 기본값 외에 변경이 필요한 옵션이 있을 경우에 사용한다.
    (ex. VARCHAR(255)가 기본이라면 이것의 크기를 500으로 늘리고 싶은경우)
    */

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}


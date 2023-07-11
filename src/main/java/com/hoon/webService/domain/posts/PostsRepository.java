package com.hoon.webService.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

/*
보통 ibatis나 MyBatis등에서 Dao라고 불리는 DB 레이어 접근자다.
JPA에선 이를 Repository라고 부르며 인터페이스로 생성한다.
단순히 인터페이스를 생성한 후 JpaRepository<Entity 클래스, PK 타입>를 상속하면
기본적인 CRUD 메소드가 생성된다.
*/
public interface PostsRepository extends JpaRepository<Posts, Long> {
}

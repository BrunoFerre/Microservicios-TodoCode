package com.microsv.post_service.repository;

import com.microsv.post_service.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    @Query("SELECT p FROM Post p WHERE p.user_id = :user_id")
    List<Post> findAllPostByUserId(@Param("user_id") Long user_id);
}

package pweb.api.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pweb.api.blog.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}

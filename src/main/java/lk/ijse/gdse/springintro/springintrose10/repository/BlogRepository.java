package lk.ijse.gdse.springintro.springintrose10.repository;

import lk.ijse.gdse.springintro.springintrose10.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog,Integer> {//JpaRepository<Blog,Integer> is the super interface of BlogRepository


}

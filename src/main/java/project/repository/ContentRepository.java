package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.model.Content;

@Repository
public interface ContentRepository extends JpaRepository<Content, Integer> {
}

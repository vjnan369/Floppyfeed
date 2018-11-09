package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.model.Content;

public interface ContentRepository extends JpaRepository<Content, Integer> {
}

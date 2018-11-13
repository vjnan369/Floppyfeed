package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.model.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
}

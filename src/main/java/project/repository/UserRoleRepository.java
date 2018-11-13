package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import project.model.UserRole;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
    @Query("select userRole from UserRole userRole where userRole.userId = ?1")
    UserRole findByUserId(@Param("userId") int userId);
}

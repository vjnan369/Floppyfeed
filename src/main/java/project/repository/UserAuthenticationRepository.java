package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import project.model.User;
import project.model.UserAuthentication;

@Repository
public interface UserAuthenticationRepository extends JpaRepository<UserAuthentication, Integer> {
    @Query("select c from UserAuthentication c where c.email = ?1")
    UserAuthentication findByEmail(@Param("email") String email);
}

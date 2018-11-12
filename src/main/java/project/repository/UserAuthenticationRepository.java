package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.model.UserAuthentication;

@Repository
public interface UserAuthenticationRepository extends JpaRepository<UserAuthentication, Integer> {
//    @Query("SELECT email from user_authentication where email = ?1")
//    public User findByEmail(String email);
}

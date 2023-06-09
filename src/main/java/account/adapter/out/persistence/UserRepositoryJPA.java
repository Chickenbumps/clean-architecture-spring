package account.adapter.out.persistence;

import account.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepositoryJPA extends JpaRepository<User, Long> {
    Optional<User> findUsersByEmail(String email);
    boolean existsEmail(String email);

    User findeUserByEmail(String email);

    User findUserById(Long id);
}

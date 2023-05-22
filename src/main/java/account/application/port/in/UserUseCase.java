package account.application.port.in;

import account.domain.User;

import java.util.Optional;

public interface UserUseCase {
    void save(User user) throws Exception;
    User findByEmail(String email);

    Optional<User> findById(Long userId);
    User getLogInUser();
}

package account.application.service;

import account.adapter.out.persistence.UserRepositoryJPA;
import account.application.port.in.UserUseCase;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService implements UserUseCase {
    private final UserRepositoryJPA userRepository;

    @Autowired
    public UserService(UserRepositoryJPA userRepository) {
        this.userRepository = userRepository;
    }



}

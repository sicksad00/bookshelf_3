package ru.bookshelf.accounts.services;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.bookshelf.accounts.models.User;
import ru.bookshelf.accounts.repositories.UsersRepository;

/**
 * @author Raphael Kalimullin <raphaelkalimullin@gmail.com>
 */
@AllArgsConstructor
@Service
public class RegistrationService {

    private final UsersRepository usersRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public void register(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole("ROLE_USER");
        usersRepository.save(user);
    }
}

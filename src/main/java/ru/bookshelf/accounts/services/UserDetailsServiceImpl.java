package ru.bookshelf.accounts.services;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.bookshelf.accounts.repositories.UsersRepository;
import ru.bookshelf.accounts.security.UserDetailsImpl;

import javax.annotation.Nonnull;

/**
 * @author Raphael Kalimullin <raphaelkalimullin@gmail.com>
 */
@AllArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(@Nonnull String login) throws UsernameNotFoundException
    {
        var user = this.usersRepository.findByLogin(login);
        if (user.isEmpty())
            throw new UsernameNotFoundException("Пользователь не найден.");
        return new UserDetailsImpl(user.get());
    }
}

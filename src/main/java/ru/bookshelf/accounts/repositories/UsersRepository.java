package ru.bookshelf.accounts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.bookshelf.accounts.models.User;

import javax.annotation.Nonnull;
import java.util.Optional;

/**
 * @author Raphael Kalimullin <raphaelkalimullin@gmail.com>
 */
@Repository
public interface UsersRepository extends JpaRepository<User, Long>
{
    Optional<User> findByLogin(@Nonnull String login);
}

package ru.bookshelf.accounts.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Nonnull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Raphael Kalimullin <raphaelkalimullin@gmail.com>
 */
@Data
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Nonnull
    @Column(name = "login")
    private String login;

    @Nonnull
    @Column(name = "password")
    private String password;

    @Nonnull
    @Column(name = "email")
    private String email;

    @Nonnull
    @Column(name = "role")
    private String role;

    public User(@Nonnull String login,
                @Nonnull String password,
                @Nonnull String email,
                @Nonnull String role)
    {
        this.login = login;
        this.password = password;
        this.email = email;
        this.role = role;
    }
}

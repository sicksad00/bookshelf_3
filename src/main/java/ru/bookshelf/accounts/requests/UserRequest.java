package ru.bookshelf.accounts.requests;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * @author Raphael Kalimullin <raphaelkalimullin@gmail.com>
 */
@Data
@Builder
public class UserRequest {

    @NotEmpty(message = "Имя не должно быть пустым")
    @Size(min = 2, max = 100, message = "Имя должно быть от 2 до 100 символов длиной")
    private String username;

    private String password;

    private String email;
}
package ru.bookshelf.books.requests;

import lombok.Builder;
import lombok.Data;

import javax.annotation.Nullable;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Raphael Kalimullin <raphaelkalimullin@gmail.com>
 */
@Data
@Builder
public class BookRequest {

    @NotBlank(message = "Название книги не должно быть пустым.")
    @Size(min = 1, max = 255, message = "Название книги должно содержать от 1 до 255 символов.")
    private String title;

    @Nullable
    private String coverUrl;

    @Nullable
    private String description;

    @Min(value = 1, message = "Количество страниц должно быть положительным.")
    @NotNull(message = "Количество страниц должно быть указано.")
    private Integer pageCount;
}
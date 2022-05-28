package ru.bookshelf.books.enteties;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Raphael Kalimullin <raphaelkalimullin@gmail.com>
 */
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "books")
public class Book {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Nonnull
    @Column(name = "title")
    private String title;

    @Nullable
    @Column(name = "cover_url")
    private String coverUrl;

    @Nullable
    @Column(name = "description")
    private String description;

    @Column(name = "page_count")
    private int pageCount;

    public Book(@Nonnull String title, @Nullable String coverUrl, @Nullable String description, int pageCount) {
        this.title = title;
        this.coverUrl = coverUrl;
        this.description = description;
        this.pageCount = pageCount;
    }
}
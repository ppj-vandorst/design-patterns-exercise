package creational.builder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BuilderTest {

    @Test
    public void itShouldCreateABookUsingTheBuilderPattern() {
        Book book = new Book.Builder("12345", "Return of the King")
                .withAuthor("J.R.R. Tolkien")
                .withYearOfRelease(1955)
                .withNumberOfPages(600)
                .build();

        assertThat(book.getIsbn()).isEqualTo("12345");
        assertThat(book.getTitle()).isEqualTo("Return of the King");
        assertThat(book.getAuthor()).isEqualTo("J.R.R. Tolkien");
        assertThat(book.getYearOfRelease()).isEqualTo(1955);
        assertThat(book.getNumberOfPages()).isEqualTo(600);
    }
}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArraysTest {

    Book[] books;

    ArraysEngine engine = new ArraysEngine();

    @BeforeEach
    public void init() {
        books = new Book[]{
                null,
                new Book("1984", "Джордж Оруэлл", 328),
                new Book("Улисс", "Джеймс Джойс", 736),
                null,
                new Book("Война и мир", "Лев Толстой", 1225),
                new Book("Гарри Поттер и философский камень", "Джоан Роулинг", 336),
                null,
                null,
                new Book("Преступление и наказание", "Фёдор Достоевский", 551),
                new Book("Гордость и предубеждение", "Джейн Остин", 384),
                null
        };
    }

    @Test
    public void testGetActualSize() {
        System.out.print("Тест метода getActualSize()   ");
        assertEquals(6, engine.getActualSize(books));
        System.out.println(" - успех");
    }

    @Test
    public void testGetBookTitles() {
        System.out.print("Тест метода getBookTitles()   ");
        String[] expected = {
                "1984", "Улисс", "Война и мир", "Гарри Поттер и философский камень", "Преступление и наказание", "Гордость и предубеждение"
        };
        assertArrayEquals(expected, engine.getBookTitles(books));
        System.out.println(" - успех");
    }

    @Test
    public void testFindBookByTitle() {
        System.out.print("Тест метода findBookByTitle() ");
        Book expected = books[1];
        assertEquals(expected, engine.findBookByTitle(books, "1984"));
        System.out.println(" - успех");
    }

    @Test
    public void testCountTotalPages() {
        System.out.print("Тест метода countTotalPages() ");
        assertEquals(3560, engine.countTotalPages(books));
        System.out.println(" - успех");
    }

    @Test
    public void testFindLargestBook() {
        System.out.print("Тест метода findLargestBook() ");
        Book expected = books[4];
        assertEquals(expected, engine.findLargestBook(books));
        System.out.println(" - успех");
    }
}


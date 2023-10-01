package com.example;

import java.util.List;


import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookServiceTest {

    private BookService bookService;
    private BookRepository mockRepository;

    @BeforeEach
    public void setUp() {
        mockRepository = mock(BookRepository.class);
        bookService = new BookService(mockRepository);
    }

    @Test
    public void testGetAllBooks() {
        // Настраиваем поведение мок объекта
        when(mockRepository.findAll()).thenReturn(List.of(new Book("Book 1", "Author 1")));

        // Вызываем метод и проверяем результат
        assertEquals(1, bookService.getAllBooks().size());
    }
}

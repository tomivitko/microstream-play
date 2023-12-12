package com.example.microstreamsplay;

import one.microstream.storage.embedded.types.EmbeddedStorage;
import one.microstream.storage.embedded.types.EmbeddedStorageManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.nio.file.Paths;
import java.util.List;

@Component
public class BooksRepository {
    private final BookRootObject database = new BookRootObject();
    private final EmbeddedStorageManager storageManager;

    public BooksRepository(@Value("${microstream.store.location}") final String location) {
        this.storageManager = EmbeddedStorage.start(this.database, Paths.get(location));
    }

    public void add(final Book book) {
        database.addBook(book);
        storageManager.store(database.getBooks());
    }

    public List<Book> getAll() {
        return database.getBooks();
    }
}

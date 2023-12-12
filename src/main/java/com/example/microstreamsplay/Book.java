package com.example.microstreamsplay;


import one.microstream.persistence.binary.types.Binary;
import one.microstream.persistence.binary.types.BinaryTypeHandler;

public record Book(String name, String year, Author author, String test) {

    static BinaryTypeHandler<Book> provideTypeHandler(){
        return Binary.TypeHandler(
                Book.class,
                Binary.Field_int("year",
                        e -> Integer.parseInt(e.year),
                        (e, value) -> e.year = String.valueOf(value))
        );
    }
}

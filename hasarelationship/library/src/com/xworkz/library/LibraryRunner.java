package com.xworkz.library;

import com.xworkz.library.dao.LibraryDao;
import com.xworkz.library.dto.LibraryDto;

public class LibraryRunner {

    public static void main(String[] args) {

        // Create a new dto DTO
        LibraryDto dto = new LibraryDto();
        dto.title = "To Kill a Mockingbird";
        dto.author = "Harper Lee";
        dto.isbn = "978-0060935467";
        dto.price = 18.99;
        dto.publicationYear = 1960;
        dto.isAvailable = true;

        // Create a DAO object and use it to add and retrieve dto details
        LibraryDao dao = new LibraryDao();
        dao.addBook(dto);
        dao.getBookDetails();
    }
}

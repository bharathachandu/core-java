package com.xworkz.library.dao;

import com.xworkz.library.dto.LibraryDto;

public class LibraryDao {
    LibraryDto dto;

    public boolean addBook(LibraryDto dto) {
        boolean isAdded = false;
        System.out.println("Adding book to the library...");
        if (dto != null) {
            this.dto = dto;
            isAdded = true;
        }
        return isAdded;
    }

    public void getBookDetails() {

            System.out.println("Title: " + dto.title);
            System.out.println("Author: " + dto.author);
            System.out.println("ISBN: " + dto.isbn);
            System.out.println("Price: $" + dto.price);
            System.out.println("Publication Year: " + dto.publicationYear);
            System.out.println("Available: " + (dto.isAvailable ? "Yes" : "No"));
        }
}

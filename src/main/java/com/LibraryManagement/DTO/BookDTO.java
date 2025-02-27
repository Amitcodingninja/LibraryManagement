package com.LibraryManagement.DTO;

import lombok.Data;

@Data
public class BookDTO {
    private String title;
    private String author;
    private String isbn;
    private Integer quantity;
    private Boolean isAvailable;

//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public String getIsbn() {
//        return isbn;
//    }
//
//    public void setIsbn(String isbn) {
//        this.isbn = isbn;
//    }
//
//    public Integer getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(Integer quantity) {
//        this.quantity = quantity;
//    }
//
//    public Boolean getAvailable() {
//        return isAvailable;
//    }
//
//    public void setAvailable(Boolean available) {
//        isAvailable = available;
//    }
}

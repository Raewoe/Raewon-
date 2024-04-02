package com.ohgiraffers.section01.object.book;

public class Book {

    private int num;
    private String title;
    private String author;
    private int price;


    public void setNum(int num) {
        this.num = num;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "num=" + num +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public Book(int num, String title, String author, int price) {
        this.num = num;
        this.title = title;
        this.author = author;
        this.price = price;

    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        Book other =(Book) obj;

        if (this.num != other.num) {
            return false;
        }
        if (this.title == null) {
            if (other.title != null) {
                return false;
            }
        } else if (!this.title.equals((other.title))) {
            return false;
        }

        if (this.price != other.price) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;

        final int PRIME = 31;

        result = PRIME * result + this.num;

        result = PRIME * result + this.title.hashCode();

        result = PRIME * result + this.author.hashCode();

        result = PRIME * result + this.price;

        return result;
    }
}

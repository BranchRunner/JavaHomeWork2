package com.pb.bondarev.hw5;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Reader reader1 = new Reader();
        Reader reader2 = new Reader();
        Reader reader3 = new Reader();

        book1.setName("Подорожі");
        book2.setName("Словник");
        book3.setName("Енциклопедія");

        book1.setAvt("Іванов І.І.");
        book2.setAvt("Сидоров А.В.");
        book3.setAvt("Гусєв К.В.");

        book1.setYear(2000);
        book2.setYear(1980);
        book3.setYear(2010);

        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());
        System.out.println(book3.getInfo());
        System.out.println();

        reader1.setFio("Петров В.В.");
        reader2.setFio("Іванов С.Г.");
        reader3.setFio("Кальченко А.О.");

        reader1.setNumbil(425);
        reader2.setNumbil(160);
        reader3.setNumbil(704);

        reader1.setFac("ФФЕКС");
        reader2.setFac("ФМФ");
        reader3.setFac("ФЕ");

        reader1.setBirt("1987");
        reader2.setBirt("1989");
        reader3.setBirt("1991");

        reader1.setNumtel("0931234567");
        reader2.setNumtel("0667654321");
        reader3.setNumtel("0671726345");

        System.out.println(reader1.getInfoRe());
        System.out.println(reader2.getInfoRe());
        System.out.println(reader3.getInfoRe());

        System.out.println("Скільки взяли книжок?");
        reader1.setKil(scan.nextLine());
        //System.out.println(reader1.takeBook());

        System.out.println("Які книжки взяли?");
        reader1.setYaki(scan.nextLine());
        System.out.println(reader1.takeBook());






    }

    private static Book getBook2(Book book2) {
        return book2;
    }
}

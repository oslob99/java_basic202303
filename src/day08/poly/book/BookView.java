package day08.poly.book;

import day05.member.Gender;

import java.util.Scanner;

public class BookView {

    Scanner sc = new Scanner(System.in);
    BookUser user;
    LibraryRepository lr = new LibraryRepository();
    public void startUser(){
        System.out.println("# 회원 정보를 입력해주세요.");
        System.out.print("이름 : ");
        String userName = sc.nextLine();
        System.out.print("나이 : ");
        int userAge = Integer.parseInt(sc.nextLine());
        System.out.print("성별(M/F) : ");
        Gender userGender = (sc.nextLine().toUpperCase().charAt(0)=='M')?Gender.MALE:Gender.FEMALE;

        lr.register(new BookUser(userName,userAge,userGender,0));

    }


}

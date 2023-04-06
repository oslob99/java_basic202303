package day08.poly.book;

import day05.member.Gender;

import java.util.Scanner;

import static day05.member.Gender.*;
import static day07.static_.Utility.input;

public class LibraryView {

//    private static Scanner sc;
    private static LibraryRepository repository;

    // static 데이터는 생성자에서 초기화하면 안됨
    // static 필드의 초기화는 static initializer를 사용
    static {
//        sc = new Scanner(System.in);
        repository = new LibraryRepository();
    }

    // 회원정보 입력 처리
    private static void makeNewBookUser(){
        System.out.println("\n# 회원 정보를 입력해주세요.");
        String name = input("# 이름 : ");
        int age = Integer.parseInt(input("# 나이 : "));
        Gender gender = inputGender();

        // 입력받은 데이터 객체로 포장
        BookUser userInfo = new BookUser();
        userInfo.setName(name);
        userInfo.setAge(age);
        userInfo.setGender(gender);
        userInfo.setCouponCount(0);

        // 입력받은 유조객체를 저장소로 보내기
        repository.register(userInfo);
    }


    private static Gender inputGender() { // 정확하게 성별을 입력할때까지 반복 입력받는 메서드
        while (true) {
            String inputGender = input("# 성별(M/F) : ");
            Gender gender;
            switch (inputGender.toUpperCase().charAt(0)){
                case 'M':
                    return MALE;
                case 'F':
                    return FEMALE;
                default:
                    System.out.println("\n# 성별을 잘못 입력했습니다.");
            }
        }
    }

    // 화면 처리
    public static void start(){
        makeNewBookUser();

        // 메인 메뉴 띄우기
        while (true){
            showMainScreen();

            selectMenu();
        }
    }

    private static void selectMenu() {
        String menuNum = input("- 메뉴 번호 : ");

        switch (menuNum){
            case "1" :
                // 마이페이지 : 가입한 회원정보 출력
                BookUser user = repository.findBookUser();
                System.out.println("\n****** 회원님 정보 *******");
                System.out.println("# 회원명 : "+user.getName());
                System.out.println("# 나이 : "+user.getAge());
                System.out.println("# 성별 : "+user.getGenderToString());
                System.out.println("# 쿠폰개수 : "+user.getCouponCount());
                break;
            case "2" :
                String[] infoList = repository.getBookInfoList();
                System.out.println("\n====== 모든 도서 정보 ======");
                for (int i = 0; i < infoList.length; i++) {
                    String info = infoList[i];
                    System.out.println((i+1)+"번째 도서 : "+info);
                }
                break;
            case "3" :
                // 사용자에게 검색어를 입력받는다
                String keyword = input("# 검색어 : ");

                // 저장소에게 해당 검색어를 주면서 검색에 걸린 책 정보를 내놓으라고 해야함
                String[] bookInfoList = repository.searchBookInfoList(keyword);
                if (bookInfoList.length>0) {
                    for (String info : bookInfoList) {
                        System.out.println(info);
                    }
                }else {
                    System.out.println("\n검색 결과 없다고!");
                }
                break;
            case "4" :
                // 대여가능한 책의 목록을 번호와 함께 출력
                String[] bilList = repository.getBookInfoList();
                System.out.println("====== 대여 도서 목록 ======");
                for (int i = 0; i < bilList.length; i++) {
                    System.out.println((i+1)+"번째 도서 : "+bilList[i]);
                }
                String rentNum = input("# 대여할 도서 번호 입력 : ");
                RentStatus rentStatus = repository.rentBook(Integer.parseInt(rentNum));
                if(rentStatus == RentStatus.RENT_SUCCESS_WITH_COUPON){
                    System.out.println("# 성공적으로 요리책이 쿠폰발급과 함께 대여 완료!");
                }else if(rentStatus == RentStatus.RENT_SUCCESS){
                    System.out.println("# 도서가 성공적으로 대여 완료!");
                }else {
                    System.out.println("# 도서 대여 실패!!");
                }
                break;
            case "9" :
                System.out.println("# 프로그램을 종료합니다");
                System.exit(0);
                break;
            default:
                System.out.println("\n# 다시 입력!!");
        }
    }



    // 메인 메뉴창을 출력하는 메서드
    private static void showMainScreen() {
        System.out.println("=========== 도서 메뉴 ===========");
        System.out.println("# 1. 마이페이지");
        System.out.println("# 2. 도서 전체 조회");
        System.out.println("# 3. 도서 검색");
        System.out.println("# 4. 도서 대여하기");
        System.out.println("# 9. 프로그램 종료하기");
    }


}

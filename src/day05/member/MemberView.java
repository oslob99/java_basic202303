package day05.member;

import java.util.Scanner;

public class MemberView {

    Scanner sc ;
    MemberRepository mr;

    public MemberView (){
        this.sc = new Scanner(System.in);
        this.mr = new MemberRepository();
    }

    void  mainView(){

        System.out.println("\n#### 회원 관리 시스템 ####");
        System.out.println("* 1. 회원 정보 등록하기");
        System.out.println("* 2. 개별회원 정보 조회하기");
        System.out.println("* 3. 전체회원 정보 조회하기");
        System.out.println("* 4. 회원정보 수정하기");
        System.out.println("* 5. 회원정보 삭제하기");
        System.out.println("* 6. 끝내기");
        System.out.println("===========================");
    }

//    프로그램 화면 흐름을 제어하는 기능

    void  viewProcess(){

        while (true) {
            mainView();
            String menuNum = input(">> ");

            switch (menuNum){
                case "1":
                    signUp();
                    break;
                case "2":
                    showDetailMember();
                    break;
                case "3":
                    mr.showMembers();
                    stop();
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    String answer = input("# 정말로 종료합니까? [y/n]");
                    if(answer.toLowerCase().charAt(0) == 'y'){
                        System.out.println("# 프로그램 종료합니다");
                        System.exit(0);
                    } else {
                        continue;
                    }
                    break;
                default:
                    System.out.println("\n# 메뉴 번호를 다시 입력하세요");
            }
        }
    }

    String input(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    // 엔터를 누르기 전까지 멈추는 기능
    void stop(){
        System.out.println("\n====== 엔터를 눌러서 계속... =======");
        sc.nextLine();
    }

    // 회원 등록 입력 처리
    void signUp(){
        System.out.println("\n# 회원 등록을 시작합니다");
        String email;

        while (true) {
            email = input("# 이메일: ");
            if (!mr.isDuplicateEmail(email)){
                break;
            }
            System.out.println("# 중복된 이메일입니다이");
        }
        String name = input("# 이름: ");
        String password = input("# 패스워드: ");

        Gender gender;

        checkGender: while (true) {
            String inputGender = input("# 성별[M/F]: ");
            switch (inputGender.toUpperCase().charAt(0)){
                case 'M':
                    gender = Gender.MALE;
                    break checkGender;
                case 'F':
                    gender = Gender.FEMALE;
                    break checkGender;
                default:
                    System.out.println("# 성별을 M/F로 정확히 입력해주세요");
            }
        }
        int age = Integer.parseInt(input("# 나이: "));

        // 실제 저장 명령
        Member newMember = new Member(mr.getMemberId()+1,email, password,name,gender,age);
        mr.addMember(newMember);

        System.out.println("\n# 회원가입 성공");
        stop();
    }

    // 회원 개별조회를 위한 입출력처리

    void showDetailMember(){
        // 이메일 입력하세요
        System.out.println("# 조회를 시작합니다!");
        String inputEmail = input("# 이메일: ");
        boolean a = mr.showMember(inputEmail);


        // 찾은 회원 정보
    }

}

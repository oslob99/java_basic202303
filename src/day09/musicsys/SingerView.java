package day09.musicsys;

import static day07.static_.Utility.input;

public class SingerView {
    SingerRepasitory repasitory = new SingerRepasitory();

    public void start(){
        startSing();
        String inputNum = input(">> ");

        switch (inputNum){
            case "1":
                System.out.println("\n# 노래 등록을 시작합니다");
                String singerName = input("- 가수명 : ");
                String singName = input("- 곡명 : ");
                if (repasitory.findUser(singerName) != null){
                    repasitory.inputSinger(singerName, singName);
                    System.out.printf("# 아티스트 %s님이 신규 등록되었습니다.",singerName);
                }else {
                    if(repasitory.findSong(singerName,singName)){
                        System.out.printf("# [%s]은(는) 이미 등록된 노래입니다",singName);
                    }else {
                        repasitory.addSong(singerName,singName);
                        System.out.printf("# %s님의 노래목록에 '%s'곡이 추가되었습니다",singerName,singName);
                    }
                }

                break;
            case "2":
                break;
            case "3":
                System.out.println("프로그램을 종료합니다");
                System.exit(0);
            default:
                System.out.println("번호좀 잘써라");
        }

    }




    // 음악 관리 프로그램 시작(보여주기)

    // 등록된 가수가 몇 명있는지 출력하기


    // 입력된 가수가 배열에 있는지 확인하고 없으면 등록하기


    public void startSing(){
        System.out.println("**** 음악 관리 프로그램 ****");
        System.out.printf("# 현재 등록된 가수: %d명\n",repasitory.countSingers());
        System.out.println("# 1. 노래 등록하기");
        System.out.println("# 2. 노래 정보 검색");
        System.out.println("# 3. 프로그램 종료");
        System.out.println("===================================");
    }



}

package day09.ssong;

import com.sun.source.tree.WhileLoopTree;
import day10.exception.TryExample1;

import java.security.KeyStore;

import static day07.static_.Utility.input;

public class ArtistView {
    private static ArtistRepository repository;

    static {
        repository = new ArtistRepository();
    }
    public void start(){
        while (true){
            startMenu();
            selectMenu();
        }
    }



    public void startMenu(){
        System.out.println("\n\n****** 음악 관리 프로그램 ******");
        System.out.printf("# 현재 등록된 가수: %d명\n", repository.count());
        System.out.println("# 1. 노래 등록하기");
        System.out.println("# 2. 노래 정보 검색");
        System.out.println("# 3. 프로그램 종료");
    }

    public void selectMenu(){
        try {
            int menuNum = Integer.parseInt(input(">>"));
            switch (menuNum){
                case 1:
                    System.out.println("\n# 노래 등록을 시작합니다.");
                    String inputArt = input("- 가수명 : ");
                    String inputSong = input("- 곡명 : ");
                    if (repository.findArtist(inputArt)){
                            if(repository.findSong(inputArt,inputSong)){
                                System.out.printf("# [%s]은(는) 이미 등록된 노래입니다",inputSong);
                            }else {
                                repository.addSong(inputArt,inputSong);
                                System.out.printf("# %s님의 노래목록에 '%s'곡이 추가되었습니다",inputArt,inputSong);
                            }
                    }else {
                        repository.addArtist(inputArt,inputSong);
                        System.out.printf("# 아티스트 %s님이 신규 등록되었습니다",inputArt);
                    }

                    break;
                case 2:
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못된 메뉴번호");

            }

        }catch (NumberFormatException e){
            System.out.println("숫자를 입력하거라!");
        }
    }

}

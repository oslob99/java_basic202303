package day07.inherit;

public class Warrior extends Player{

    int rage; // 분노게이지

    public Warrior(){
        this("이름없음");
    }

    public Warrior(String nickName){
        super(nickName);
        this.rage = 20;
    }

    // 캐릭터 상태창을 보는기능

    // 파워슬래시
    public void powerSlash(){
        System.out.println("파워슬래시를 시전합니다.");
    }

    // 오버라이딩
    // 조건: 부모의 시그니처(리턴타입, 이름, 파라미터)를 똑같이 사용
    //      접근제한자는 무저건 부모보다 public 해야함
    @Override // 오버라이딩 검사
    public void showStatus(){
        super.showStatus();
        System.out.println("# rage : "+ this.rage);
    }

}

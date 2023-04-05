package day07.inherit;



// 수퍼 클래스(부모클래스) : 객체의 공통기능과 속성을 설계
public class Player {

    String nickName; // 캐릭터 이름
    int level;
    int hp;
    int Exp;

    // 부모의 생성자


    public Player(String nickName) {
        System.out.println("Player의 생성자 호출!");
        this.nickName = nickName;
        this.level =1;
        this.hp = 50;
    }

    // 캐릭터 상태창을 보는 기능
    public void showStatus() {
        System.out.println("\n======= Character's Info =========");
        System.out.println("# name: " + this.nickName);
        System.out.println("# level: " + this.level);
        System.out.println("# hp: " + this.hp);
    }

    public void damage(){
        int boltDamage = (int) (Math.random()*6+10);
        this.hp -= boltDamage;
        System.out.println(this.nickName+"님이 "+boltDamage+"의 피해를 입었습니다. (남은 체력: "+this.hp+")");

    }

}

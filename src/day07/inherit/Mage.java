package day07.inherit;

public class Mage extends Player{


    int mana; // 마력 게이지

    public Mage(String nickName) {
        super(nickName);
        this.mana = 100;
    }

    // 썬더 볼트
    public void thunderBolt(Player ... targets){
        System.out.println("# "+this.nickName+"님 썬더볼트 시전!!!!");
        System.out.println("==========================");

        for (int i = 0; i < targets.length; i++) {
            if(super.nickName.equals(targets[i].nickName)) continue;
            targets[i].damage();
        }

    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# mana : "+ this.mana);
    }
}

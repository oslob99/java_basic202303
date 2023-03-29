package day02;

public class ArrayCopy {
    public static void main(String[] args) {

        // 배열 복사 알고리즘
//        String[] pets = new String[] {"멍멍이","야옹이","짹짹이"};


        // 선언과 동시에 초기화한다면 new Type[] 생략가능
        String[] pets = {"멍멍이","야옹이","짹짹이"};

//        for(String p : new String[]{"야옹이","냠냠이","콩콩이"}) {}

        // 1. 원본과 동일한 사이즈의 배열을 하나 더 생성
        String[] petsCopy = new String[pets.length];

        // 2. 원본의 각 인덱스값들을 사본에 인덱스로 일일히 복사
        for (int i = 0; i < pets.length; i++) {
            petsCopy[i] = pets[i];

        }

    }
}

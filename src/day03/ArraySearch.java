package day03;

public class ArraySearch {
        static String [] foods = {"삼겹살","치킨","피자","햄버거"};

        public static int indexOf(String target){
            // 인덱스 탐색 알고리즘
            int index = -1;

            for (int i = 0; i < foods.length; i++) {
                if(target.equals(foods[i])){
                    index = i;
                    break;
                }
            }


            return index;
        }
    public static void main(String[] args) {


        foods[0] = foods[1];

        foods[2] = "족발";

        int index = indexOf("족발");
//        // 인덱스 탐색 알고리즘
//        int index = -1;
//        String target = "족발";
//
//        for (int i = 0; i < foods.length; i++) {
//            if(target.equals(foods[i])){
//                index = i;
//                break;
//            }
//        }
        System.out.println("index = " + index);

    }
}

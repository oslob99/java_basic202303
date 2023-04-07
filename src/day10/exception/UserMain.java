package day10.exception;

public class UserMain {

    public static void main(String[] args) {

        LoginUser lu = new LoginUser("abc123","1234");
        try {
            lu.loginValidate("abc123","123");
        } catch (LoginValidateException e) {
            // getMessage : 에러원인 메시지를 리턴
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

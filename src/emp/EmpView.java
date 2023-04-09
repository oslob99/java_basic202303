package emp;

import static day07.static_.Utility.input;

public class EmpView {

    private static EmpRepository repository;

    static {
        repository = new EmpRepository();
    }

    public EmpLogin loginStart() { // 로그인 체크하는 메서드
        while (true) { // 로그인 반복문
            String inputId = input("# 아이디 입력 : ");
            LoginStatus loginId = repository.loginIdCheck(inputId);
            if (loginId == LoginStatus.ID_FAIL) {
                System.out.println("아이디가 틀렸습니다!");
                continue;
            }
            String inputPwd = input("# 비밀번호 입력 : ");
            LoginStatus loginPwd = repository.loginPwdCheck(inputId, inputPwd);
            if (loginPwd == LoginStatus.PWD_FAIL)
                System.out.println("비밀번호가 틀렸습니다");
            else {
                System.out.println("로그인 성공!");
                return new EmpLogin(inputId,inputPwd);
            }
        }
    }

    public void menuStart(EmpLogin login) {
        while (true) {
            System.out.println("\n****** 메뉴 ******");
            System.out.println("1. 사원 전체목록");
            System.out.println("2. 사원 등록");
            System.out.println("3. 사원 수정");
            System.out.println("4. 사원 삭제");
            System.out.println("5. 종료");

            inputMenuNum(login);

        }

    }

    public void inputMenuNum(EmpLogin login){
        try {
            int inputNum = Integer.parseInt(input(">> "));
            switch (inputNum) {
                case 1:
                    EmpVo empVo = repository.showAll(login.id);
                    showAllEmp(empVo);
                    break;
                case 2:
                    String[] insertMember = new String[2];
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }catch (NumberFormatException e){
            System.out.println("잘못된 입력입니다!");
        }

    }

    private void showAllEmp(EmpVo empVo) {
        String gender = "";
        if (empVo.getGender() == Gender.MALE) gender = "남성";
        else gender = "여성";
        System.out.printf("\n[%d, %s, %s, %s]",empVo.getEmpNo(),empVo.getEmpName(),gender,empVo.getDepart());
        System.out.println(", 좋아하는 음식 : "+empVo.getFavoriteFoods());
    }


    public void start() {
        EmpLogin login = loginStart();
        menuStart(login);
    }

}

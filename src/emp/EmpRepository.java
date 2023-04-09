package emp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EmpRepository {

    private static Map<String,String> empLogin; // 로그인 아이디와 비밀번호
    private static Map<String,EmpVo> empVoMap; // Key : 사원ID, Value : EmpVo

    static {
        empLogin = new HashMap<>();
        empLogin.put("admin","1234");
        empLogin.put("master","5678");
        empVoMap = new HashMap<>();
        Set<String> favoriteFood = new HashSet<>();
        favoriteFood.add("열라면");
        empVoMap.put("admin",new EmpVo(1,"김감독",Gender.MALE,"개발부",favoriteFood));
    }

    public LoginStatus loginIdCheck(String inputId){
        if (empLogin.containsKey(inputId)){
            return LoginStatus.ID_SUCCESS;
        }else {
            return LoginStatus.ID_FAIL;
        }
    }
    public LoginStatus loginPwdCheck(String inputId, String inputPwd){
        if (empLogin.get(inputId).equals(inputPwd)){
            return LoginStatus.PWD_SUCCESS;
        }else {
            return LoginStatus.PWD_FAIL;
        }
    }



    // 메뉴 메서드

    public EmpVo showAll(String id){
        return empVoMap.get(id);
    }


}

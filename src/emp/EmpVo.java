package emp;

import java.util.Set;

public class EmpVo {

    private int empNo; // 사원번호(기본키)
    private String empName; // 사원이름
    private Gender gender; // 성별
    private String depart; // 부서
    private Set<String> favoriteFoods; // 중복없는 좋아하는 음식

    public EmpVo() {
    }

    public EmpVo(int empNo, String empName, Gender gender, String depart, Set<String> favoriteFoods) {
        this.empNo = empNo;
        this.empName = empName;
        this.gender = gender;
        this.depart = depart;
        this.favoriteFoods = favoriteFoods;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public Set<String> getFavoriteFoods() {
        return favoriteFoods;
    }

    public void setFavoriteFoods(Set<String> favoriteFoods) {
        this.favoriteFoods = favoriteFoods;
    }
}

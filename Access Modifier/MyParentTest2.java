package Study1; //패키지가 스터디1 으로 바뀜

import Study.MyParent; // 스터디 패키지에있는 MyParent 클래스를 받아오기위해 임포트

class MyChild extends MyParent {
    public void printMembers() {
        //System.out.println(prv); //에러 private 는 같은 클래스 안에서만 사용
        //System.out.println(dft); //에러 default 는 같은 패키지 내에서만 사용가능
        System.out.println(prt); //ok
        System.out.println(pub); //ok
    }
}
public class MyParentTest2 {
    public static void main(String[] args) {
        MyParent p = new MyParent();

        //System.out.println(p.prv); //에러
       // System.out.println(p.dft); //에러
        //System.out.println(p.prt); //에러
        System.out.println(p.pub); //ok 패키지가 다르고 해도 접근제한이 없음
    }
}

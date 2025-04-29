package Study;

public class TryCatch {
    public static void main(String[] args){
        System.out.println(1);
        System.out.println(2);

        try{
            System.out.println(3);
            System.out.println(4/0);
            System.out.println(5);
        } catch (ArithmeticException ae) { //연산오류일때 사용하는 예외처리
            if (ae instanceof ArithmeticException)
                System.out.println("true");
                System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception"); //연산오류일때의 위의 catch문을 수행하고 바로 try-catch문을 빠져나갔으므로 이건 실행되지않음
        }//try-catch 끝
        System.out.println(6);
    }//main 메서드 끝
}

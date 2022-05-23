/**
 * @author 本当迷
 * @Description
 * @date 2022/5/23-13:35
 */
public class Test {
    public static void main(String[] args) {
        try {
            EcmDef(2, -2);
        } catch (CustomException e) {
            throw new RuntimeException(e);
        }
    }
    public static void EcmDef(int a, int b) throws CustomException {
        if(a < 0 || b < 0){
            throw new CustomException("分子分母不能小于0");
        }
        System.out.println(a / b);
    }

}

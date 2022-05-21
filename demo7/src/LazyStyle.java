/**
 * @author 本当迷
 * @Description 懒汉式
 * @date 2022/5/21-13:09
 */
public class LazyStyle {
    private static LazyStyle laz = null;

    public static LazyStyle create(){
        if(laz == null){
            laz = new LazyStyle();
        }
        return laz;
    }
}

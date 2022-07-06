import java.util.ArrayList;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/1-20:39
 */
public class Temp {
    public static void main(String[] args) {
        final ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(11);
        arrayList.add("22");
        arrayList.remove(new String("22"));
        System.out.println(arrayList);
    }
}

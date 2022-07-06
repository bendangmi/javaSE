import java.util.Random;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/3-10:16
 */
public class 体现反射的动态性 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        for(int i = 0; i < 100; i++){
            int num = new Random().nextInt(3);
            String classPath = "";
            switch(num){
                case 0:
                    classPath = "java.util.Date";
                    break;
                case 1:
                    classPath = "java.lang.Object";
                    break;
                case 2:
                    classPath = "Person";
            }

            final Object instance = getInstance(classPath);
            System.out.println(instance);

        }
    }

    public static Object getInstance(String classPath) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        final Class<?> aClass = Class.forName(classPath);
        return aClass.newInstance();
    }
}

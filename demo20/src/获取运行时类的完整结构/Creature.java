package 获取运行时类的完整结构;

import java.io.Serializable;

/**
 * @author 本当迷
 * @Description
 * @date 2022/7/3-11:33
 */
public abstract class Creature <T> implements Serializable {
    private char gender; // 性别
    public double weight; // 体重

    private void breath(){
        System.out.println("可以呼吸！");
    }

    public void eat(){
        System.out.println("可以吃东西");
    }
}

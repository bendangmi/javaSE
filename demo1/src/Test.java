public class Test {

    public static class Husband extends People{
        Wife wife;

        Husband(String idCard, String name) {
            this.idCard = idCard;
            this.name = name;
        }

        @Override
        public void print() {
            System.out.println("身份证号为：" + idCard + " 名字为:" + name + " 妻子的名字为：" + wife.name);
        }
    }
    public static class Wife extends People{
        Husband husband;
        Wife(String idCard, String name) {
            this.idCard = idCard;
            this.name = name;
        }

        @Override
        public void print() {
            System.out.println("身份证号为：" + idCard + " 名字为:" + name + " 丈夫的名字为：" + husband.name);
        }
    }
}


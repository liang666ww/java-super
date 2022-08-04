package super内存图;

public class Zi extends Fu {
    public int age = 20;
    public Zi(){
        //!!!!!!!进入子类后默认有个super!!!!!!!!
        System.out.println("Zi类无参构造方法被调用");
    }
    public void show(){
        int age = 30;
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);
    }

}

public class SubClass extends SuperClass{


    public void m1() {

        System.out.println("i am in sub class");
    }

    public static void main(String[] args) {
        /*SubClass subClass=new SubClass();
        subClass.m1();*/
        SuperClass superClass=new SuperClass();
       // superClass.m1();
        SuperClass superClass1=new SubClass();
        superClass1.m1();

    }
}

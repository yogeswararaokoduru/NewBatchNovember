public class OverLoading {



   public void m1(int j){
       System.out.println("one param");
   }

    public void m1(int j,String s){
        System.out.println("one int one string param");
    }
    public void m1(int j,int k){
        System.out.println("two int arguments param");
    }

    public static void main(String[] args) {
        //System.out.println("i am learning java");
        OverLoading overLoading=new OverLoading();
        overLoading.m1(10,"yogi");
    }
}

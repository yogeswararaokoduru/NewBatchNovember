public class ExceptionExample {
    public static void main(String[] args) {
        ExceptionExample ex=new ExceptionExample();
        int addResult=ex.add(10,20);
        int multResult=ex.multi(10,20);
        int divresult=ex.divi(100,20);
        System.out.println("addResult result"+addResult);
        System.out.println("multResult result"+multResult);
        System.out.println("divresult result"+divresult);
    }

    public int divi(int i,int k){
       int diviResult =i/k;
       return diviResult;
    }
    public int add(int i,int j){
        int c=i+j;

        return c;
    }
    public int multi(int i,int j){
        int intResult=i*j;
        return intResult;
    }
}

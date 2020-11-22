public class ExceptionExampleThrows {

    public static void main(String[] args) {
        ExceptionExampleThrows ex=new ExceptionExampleThrows();

        int divresult= 0;
        try {
            divresult = ex.divi(100,0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("divresult result "+divresult);

    }

    public int divi(int i,int k)throws Exception{
        int diviResult = 0;
        if(k>0){
            diviResult =i/k;
        }

       return diviResult;
    }

}

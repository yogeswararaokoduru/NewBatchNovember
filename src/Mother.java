public class Mother implements Baby{

    public void hart(){
        System.out.println("heart ready");
    }

    @Override
    public void eyes() {
        System.out.println("syes ready");
    }

    @Override
    public void legs() {
        System.out.println("legs ready");
    }

    @Override
    public void nose() {
        System.out.println("nose ready");
    }

    public static void main(String[] args) {
        Mother mother=new Mother();
        mother.eyes();

        Long l=19191l;
        Long l2=19191l;
        System.out.println(l==l2);
        System.out.println(l.equals(l2));
    }
}

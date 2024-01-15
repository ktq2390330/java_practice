// ウ：不可
class Change_to_int{
    public static void main(String[] args) {
        double a=10.0;
        String b="10";

        int int_a=(int)a;
        int int_b=Integer.parseInt(b);

        System.out.println("ア:"+int_a);
        System.out.println("イ:"+int_b);
    }
}
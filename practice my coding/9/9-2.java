class Print_Hello{
    static void print_10times(String str){
        for (int i=0; i<10; i++){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        String x="Hello";
        print_10times(x);
    }
}
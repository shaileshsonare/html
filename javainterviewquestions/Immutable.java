class Main extends String {
    
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = s1;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.concat(" WORLD"));

        // s1 = "world";

        s1 = s1.concat("world");

        System.out.println(s1);
        System.out.println(s2);


    }

}

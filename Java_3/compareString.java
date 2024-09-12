class compareString {
    public static void main(String[] args) {
        String f1 = new String("apple");
        String f2 = new String("apple");

        String a1 = "orange";
        String a2 = "orange";

        System.out.println(f1==f2);  // false
        System.out.println(a1==a2);  // true

        System.out.println(f1.equals(f2));  // true
        System.out.println(a1.equals(a2));  // true

        String a = "one";
        String b = "one";
        String c = b;
        System.out.println(a==c);  // true

        String p = "tow";
        String q = new String("two");
        String r = q;
        System.out.println(p==r);  // false
    }
}

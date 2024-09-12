class DataTypes {
    public static void main(String[] args) {
        /*
        toString  => converts into string type
        toBinaryString  => converts into binary value
        valueOf   => converts into integer from string (it returns object of Integer class)
        parseInt  => converts into integer from string (it returns int data type)
         */
        String s = Integer.toString(55);  // here Integer is a class
        System.out.println(s);

        String x = Integer.toBinaryString(15); //toOctalString(), toHexString() are also there
        System.out.println(x);

        int y = Integer.valueOf(x);
        System.out.println(y);

        int z = Integer.parseInt(x);
        System.out.println(z);
    }
}

/*
String methods 
  charAt()
  charArray()......
*/
class Main {
    public static void main(String[] args) {
        // put your code here
        String filled = "*";
        String voided = " ";
        System.out.println(filled.repeat(8));
//        System.out.println(" ");
        System.out.println(voided.repeat(6) + filled.repeat(2));
//        System.out.println(" ");
        System.out.println(voided.repeat(6) + filled.repeat(2));
//        System.out.println(" ");
        System.out.println(voided.repeat(6) + filled.repeat(2));
//        System.out.println(" ");
        System.out.println(filled.repeat(2) + voided.repeat(4) + filled.repeat(2));
//        System.out.println(" ");
        System.out.println(filled.repeat(2) + voided.repeat(4) + filled.repeat(2));
//        System.out.println(" ");
        System.out.println(voided + filled.repeat(7));


    }
}

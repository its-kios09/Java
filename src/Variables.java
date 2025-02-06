public class Variables {
//    variables in java
//    Local - are variables which are declared inside the body of the method - can be only used inside the method declared in. Local variables can't use the static keyword
//    Instance - are variables which are declared outside the body of the method
//    Static - are variables which are which you can create as a single copy and share all the instance of the class
//    Static -  only created when the programs start and destroyed after the program stops
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x++);
        System.out.println(x--);
        System.out.println(--x);
        System.out.println(++x);
    }
}

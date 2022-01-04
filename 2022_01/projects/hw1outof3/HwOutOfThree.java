public class HwOutOfThree {
    public static void main(String[] args) {
        System.out.println(run("Simon", "Morris", "Simon Morris"));
    }

    static String run(String first, String last, String full) {
        return first + " " + last + " " + full;
    }

}

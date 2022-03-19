public class Squirrels {
    public static void main(String[] args) {

        System.out.println(cigarParty(30, false));// → false
        System.out.println(cigarParty(50, false)); //→ true
        System.out.println(cigarParty(70, true)); //→ t//rue
    }

    public static boolean cigarParty(int cigars, boolean weekend) {
        // if weekend && cigars>40
        // else if !weekend && cigars>40 && cigars<60

        if (weekend && cigars > 40) {
            return true;
        } else if (!weekend && cigars > 40 && cigars < 60) {
            return true;
        } else {
            return false;
        }
    }
}

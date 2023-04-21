package unit10;
public class PiDay {

    // infinite series for π
    // https://en.wikipedia.org/wiki/Pi#Rate_of_convergence
    public static double piDay(int n, boolean subtract) {
      // TODO
      //base case to prevent stack overflow (though technically pi should have it)
      if (n >= 10000) {
        return (double)4/n;
      }
      else {
        if (subtract) {
          return -4.0/n + piDay(n+2, false);
        }
          return 4.0/n + piDay(n+2, true);
      }

    }

    public static void main(String args[]) {
        //  Gregory–Leibniz
        double pi = piDay(1, false);

        // Nilakantha
    //     double pi = 3.0 + piDay(3, false);

        System.out.println("pi = " + pi);
    }
}
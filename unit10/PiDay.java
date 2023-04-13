public class PiDay {

    // infinite series for π
    // https://en.wikipedia.org/wiki/Pi#Rate_of_convergence
    public static double piDay(int n, boolean subtract) {
      // TODO
      //base case to prevent stack overflow (though technically pi should have it)
      if (n == 1000) {
        return ;
      }
      else {
        return  
      }

    }

    public static void main(String args[]) {
        //  Gregory–Leibniz
        //double pi = piDay(1, false);

        // Nilakantha
        double pi = 3.0 + piDay(3, false);

        System.out.println("pi = " + pi);
    }
}
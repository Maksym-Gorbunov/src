public class GuessingGame {
    public static void main(String[] args) {
        try {
            if (args.length == 2) {
                if ((args[0].matches("[0-9]*")) && (args[1].matches("[0-9]*"))) {
                    int low = Integer.parseInt(args[0]);
                    int high = Integer.parseInt(args[1]);
                    Guesser guesser = new Guesser(low, high);
                    guesser.start();
                } else {
                    System.out.println("Arguments type error, integer required");
                    usage();
                    System.exit(1);
                }
            } else {
                System.out.println("2 arguments required, " + args.length + " was passed.");
                usage();
                System.exit(1);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            usage();
        }
    }

    public static void  usage(){
        System.out.println("Usage: java GuessingGame low high\n"+
                            "       where low is an integer for the lower bound\n"+
                            "       and high is an integer for the upper bound\n"+
                            "       of the interval for the numbers of the GuessingGame");
    }
}



public class TestGetReply {
    public static void main(String[] args) {
        String s = null;
        try{
            if(s.equals("Max")) {
                System.out.println("Ay, caramba");
            }
        } catch (Exception e){
            System.err.println("Test success! Can't run equal on NULL");
        }
    }
}

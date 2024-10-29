public class Main {
    public static void main(String[] args) {
        CRUD crud = new CRUD();
        System.out.println("What is your name?");
        String input1 = System.console().readLine();
        System.out.println("What is your Admission Number?");
        String input2 = System.console().readLine();
        System.out.println("What is your Course?");
        String input3 = System.console().readLine();
        System.out.println("What is your Password?");
        String input4 = System.console().readLine();

        crud.Register("student", input1, input2, input3,input4);
    }
}

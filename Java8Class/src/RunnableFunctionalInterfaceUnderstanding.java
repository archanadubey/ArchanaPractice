public class RunnableFunctionalInterfaceUnderstanding {

    public static void main(String[] args) {
        System.out.println("Runnable Funtional Interface Understanding");

        // before java 8 Annynimous class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hellow World from Annonimous Inner class");
                System.out.println("We can write our code here by overriding the run method of runnable Interface");

            }

        };
        Thread t1 = new Thread(runnable);
        t1.start();
    }
}

public class Main {
    public static void main(String[] args) {
        String s1="El instituto Clara del Rey está en Madrid";
//        String[] palabras=s1.split("e");
        String[] palabras=s1.split(" ");
        for (String palabra: palabras)
            System.out.println(palabra);
    }
}
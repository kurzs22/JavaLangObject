public class Main {
    public static void main(String[] args) {
        Person ich = new Person("Stefan Kurz");
        Person klon = new Person("Stefan Kurz");
        Person bruder = new Person("Frank Kurz");

        System.out.println("ich.getName() = " + ich.getName());
        System.out.println("ich.hashCode() = " + ich.hashCode());
        System.out.println("klon.getName() = " + klon.getName());
        System.out.println("klon.hashCode() = " + klon.hashCode());
        System.out.println("klon.equals(ich) = " + klon.equals(ich));
        System.out.println("ich.equals(ich) = " + ich.equals(ich));
        System.out.println("bruder.equals(ich) = " + bruder.equals(ich));
    }
}
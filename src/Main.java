public class Main {
    public static void main(String[] args) {
        SimpleCalculator math = new SimpleCalculator();
        math.setFirstNumber(0.0);
        math.setSecondNumber(1.25);
        System.out.println("Add: " + math.getSubtractionResult());

        Person people = new Person();
        people.setFirstName("John");
        people.setLastName("");
        people.setAge(17);
        System.out.println("Name: " + people.getFullName());
        System.out.println("Teen? : " + people.isTeen());
    }
}

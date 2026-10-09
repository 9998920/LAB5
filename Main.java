public class Main {
    public static void main(String[] args) {
        Person student1 = new Student("Гармаш", "Глєб", 18, "АІ-254", "КВ123456");
        Person student2 = new Student("Іванова", "Влада", 18, "АІ-254", "КВ123457");
        Person lecturer1 = new Lecturer("Петренко", "Василь", 45, "Комп'ютерних наук", 25000.50);
        Person lecturer2 = new Lecturer("Сидоренко", "Марія", 38, "Вищої математики", 22000.00);

        Person[] universityPeople = {student1, student2, lecturer1, lecturer2};

        System.out.println("=== Демонстрація поліморфізму ===");
        for (Person person : universityPeople) {
            System.out.println(person.toString());
        }
    }
}

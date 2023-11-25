/**
 * Создать справочник сотрудников
 * Необходимо:
 * Создать класс справочник сотрудников, который содержит внутри
 * коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
 * - Табельный номер
 * - Номер телефона
 * - Имя
 * - Стаж
 * Добавить метод, который ищет сотрудника по стажу (может быть список)
 * Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
 * Добавить метод, который ищет сотрудника по табельному номеру
 * Добавить метод добавление нового сотрудника в справочник
 */

public class Main {
    public static void main(String[] args) {
        WorkerCatalog catalog = new WorkerCatalog();
        catalog.addWorker(
                new Worker(
                        01,
                        "89123123123",
                        "Иванов Иван Иванович",
                        2));
        catalog.addWorker(
                new Worker(
                        02,
                        "892222222222",
                        "Петров Петр Петрович",
                        2));
        catalog.addWorker(
                new Worker(
                        03,
                        "89333333333",
                        "Сидоров Олег Георгевич",
                        3));
        catalog.addWorker(
                new Worker(
                        04,
                        "89444444444",
                        "Берсерков Гатс Александрович",
                        3));
        catalog.addWorker(
                new Worker(
                        05,
                        "8955555555",
                        "Пушкин Александр Сергеевич",
                        4));
        catalog.addWorker(
                new Worker(
                        06,
                        "8966666666",
                        "Бонд Джеймс Бондович",
                        19));

        System.out.println("Сотрудники добавленные с каталог");
        System.out.println(catalog.printCatalog());

        System.out.println("\nПолучение сотрудника по стажу");
        System.out.println("Сотрудники со стажем менее 5 лет: " +
                catalog.findByFromMinExperience(5).toString() + "\n");
        System.out.println("Сотрудники со стажем более 5 лет: " +
                catalog.findByFromMaxExperience(5).toString() + "\n");

        System.out.println("\nПолучение сотрудника по номеру телефона");
        System.out.println("Получение сотрудника с номером 89444444444: " + catalog.findByPhoneNumber("89444444444"));

        System.out.println("\nПолучение сотрудника по табельному номеру ");
        System.out.println("Получение сотрудника с номером 03: " + catalog.findByPersonnelNumber(03));
    }
}
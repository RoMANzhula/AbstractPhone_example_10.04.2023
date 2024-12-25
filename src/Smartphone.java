public class Smartphone extends CellPhone { //публічний клас Смартфон
    private String operationSystem; //додаємо приватне поле - операційна система

    ////обов'язкова реалізація конструктора від класу-батька
    public Smartphone(int yearOfIssue, int hoursOfBattery, String operationSystem) {
        super(yearOfIssue, hoursOfBattery); //наслідувані поля від класу-батька
        this.operationSystem = operationSystem; //ініціалізація поля класу
    }

    public void install(String program) { //створюємо метод для встановлення програмного забезпечення, на вхід метод отримує рядкову назву програми
        System.out.println("Встановлюю " + program + " для " + operationSystem); //виводимо - Встановлюю програму для операційної системи
    }
}

public class Smartphone extends CellPhone { //публичный класс смартфон
    private String operationSystem; //добавляем приватное поле - операционнаяСистема

    ////обязательная реализация конструктора от класса-родителя
    public Smartphone(int yearOfIssue, int hoursOfBattery, String operationSystem) {
        super(yearOfIssue, hoursOfBattery); //наследуемые поля от класса-родителя
        this.operationSystem = operationSystem; //инициализация поля класса
    }

    public void install(String program) { //создаем метод для добавления программного обеспечения, на вход метод получает строковое название программы
        System.out.println("Installing " + program + " for " + operationSystem); //печатаем - Устанавливаю программу для операционной системы
    }
}

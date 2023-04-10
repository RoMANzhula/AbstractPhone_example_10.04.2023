public class ThomasEdisonPhone extends AbstractPhone { //публичный класс ТелефонТомаЭдисона, унаследованный от абстрактного класса АбстрактныйТелефон

    //реализация обязательного конструктора класса по унаследованному классу
    public ThomasEdisonPhone(int yearOfIssue) {
        super(yearOfIssue);
    }

    //обязательная реализация-переопределение методов родительского класса AbstractPhone
    @Override
    public void callTo(int outputNumber) {
        System.out.println("Вращайте ручку");
        System.out.println("Сообщите номер абонента, сэр");
    }

    @Override
    public void callingUs(int inputNumber) {
        System.out.println("Ding-ding...");
    }
}

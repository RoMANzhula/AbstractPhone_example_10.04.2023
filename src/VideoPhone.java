public class VideoPhone extends AbstractPhone { //публичный класс ВидеоТелефон, унаследованный от абстрактного класса AbstractPhone

    //обязательная реализация родительского конструктора
    public VideoPhone(int yearOfIssue) {
        super(yearOfIssue);
    }


    //обязательная реализация-наследование методов родительского класса
    @Override
    public void callTo(int outputNumber) {
        System.out.println("Подключаю видеоканал для вызова абонента " + outputNumber);
    }

    @Override
    public void callingUs(int inputNumber) {
        System.out.println("У вас входящий видеовызов от абонента " + inputNumber);
    }
}

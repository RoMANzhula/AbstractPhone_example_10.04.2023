public class VideoPhone extends AbstractPhone { // Публічний клас VideoPhone, який успадковує абстрактний клас AbstractPhone

    // Обов'язкова реалізація конструктора батьківського класу
    public VideoPhone(int yearOfIssue) {
        super(yearOfIssue);
    }

    // Обов'язкова реалізація методів батьківського класу
    @Override
    public void callTo(int outputNumber) {
        System.out.println("Підключаю відеоканал для дзвінка абоненту " + outputNumber);
    }

    @Override
    public void callingUs(int inputNumber) {
        System.out.println("У вас вхідний відеодзвінок від абонента " + inputNumber);
    }
}

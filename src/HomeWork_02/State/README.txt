Состояние — это поведенческий паттерн, позволяющий динамически изменять поведение объекта при смене его состояния.

Поведения, зависящие от состояния, переезжают в отдельные классы. Первоначальный класс хранит ссылку на один из таких объектов-состояний и делегирует ему работу.

В данном примере состояния класса Man реализованы с помощью вложенных классов:
StateRest
AverageLoad
HighLoad
Связанных с основным классом Man с помощью HAS A (в классе Man есть ссылка Абстрактного класса ManStatement)
Состояния переопределяют методы класса Man

Состояние Men изменяется с помощью метода переключателя changeState()

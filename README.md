# Домашнее задание

Этап 1
======

- [ ] Создать абстрактный класс Person, содержащий поле "name" типа String
- [ ] Создать класс клиента Client, унаследованный от Person, который имеет поля "fio" типа String, "birthday" типа Date и "document" типа DUL
и принимает все их в конструкторе. В суперкласс Person передается параметр fio.
- [ ] Создать класс DUL (документ, удостоверяющий личность) содержащий поля type, seria, number code - все они типа String и date - типа Date.
Все поля заполняются через сеттеры
- [ ] Создать класс "Operator", содержащий поля "login" и "vsp" типа String, передаваемые в конструкторе. "login" передается в суперкласс

2.1 Создать интерфейс ICurrencyConverter, содержащий один метод "convert", принимающий в качестве входных параметров данные для конвертации
"data" типа ConvertData и "operator" типа Operator. Результатом выполнения метода будет ConvertionResult.
2.2 Класс ConvertData будет содержать в себе следующие данные для конвертации: данные о клиенте, который совершает конвертацию (Client),
деньги, которые необходимо сконвертировать (Money) и валюта, в которую необходимо сконвертировать (Currency)
2.2.1 Класс Money содержит в себе валюту (Currency) и количество денег (double)
2.2.2 Класс Currency на самом деле является перечислением (enum) и содержит в себе несколько валют
2.3 Класс ConvertionResult содержит результат операции "fromMoney" (Money) и "toMoney" (Money). Параметры передаются в конструкторе

3.1 Создать класс CurrencyConverter, реализующий интерфейс ICurrencyConverter. Логика метода следующая:
a. Оператор создает заявку на конвертацию
b. С помощью заявки производится вычисление
c. Формируется результат конвертации, которые содержит "fromMoney" (Money) и "toMoney" (Money)
Разберем пункты подробнее:
3.2 Класс "ConvertionRequest" заявка на конвертацию содержит конвертируемые деньги (Money), целевая валюта (Currency)
и курсы валют (fromRate и toRate тип double), а  так же статическое поле counter (считаем кол-во заявок)
3.3 Метод создания заявки в классе Operator формирует заявку, заполняя ее данными из входного параметра ConvertData. Текущие
курсы валют оператор получает с помощью метода getCurrencyRate, которые принимает на вход Currency и с помощью оператора switch отдает нужный курс.
В результате на выходе метода мы получаем заявку ConvertionRequest
3.4 Вычисление производится по формуле: сумма_после_конвертации = (текущая_сумма * текущий_курс) / целевой_курс_конвертации
3.5 Результат конвертации просто собирает и отдает полученные данные

4.1 Главным классом будет класс Converter, который содержит поля Converter, Operator, DUL, Client а так же поле Printer (разберем позже)
converter и printer инициализируются в конструкторе, остальные поля инициализируются в ходе выполнения метода "run" (public void).
Таким образом, формирует необходимые для конвертации данные и конвертируем. Полученный результат распечатываем с помощью принтера (Printer)
4.2. Класс принтер - умеет распечатывать результат конвертации. Имеет метод print, который на вход принимает параметр ConvertionResult
и печатает результат в виде:

Обмен валюты произведен успешно.
Получено от клиента: 10000,00 RUB
Необходимо перевести в валюту: USD
Отдано клиенту: 176,06 USD

В методе рекомендуется использовать форматный вывод System.out.printf
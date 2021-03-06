## Урок 6 - Методы
_страница:159_

> сигнатура метода - название метода + список параметров (порядок параметров имеет значение)

в проекте может быть несколько методов с одинаковыми названиями, которые выполняют похожие действия,
но с разными входными параметрами (разные типы, разное количество и т.д)

сигнатура метода позволяет различать такие методы как разные.

> IDEA : F7 или F8 - в режиме отладки (debugger)

установив точки останова по коду, запускаем работу программы в режиме отладки.
клавиши F7 и F8 позволяют управлять процессом отладки:
- F7 - после точки останова последовательно делает остановки на каждой строчке кода
- F8 - после одной точки останова сразу переходит к следующей, пропуская детали

> множественный параметр - можно объявить метод указав, что он принимает произвольное количество входных параметров

```
public static void method(int... vars)
```
в этом случае входные параметры неявно засовываются в массив, который будет иметь название `vars`,
т.е. такая запись фактически равна такой:

```
public static void method(int[] vars)
```

но при этом, все другие параметры, не множественные, должны располагаться до множественного параметра.

Множественный параметр удобен тем, что мы знаем - он работает как массив, но при этом нам не надо указывать размер 
этого массива.

> IDEA : Alt + Enter

комбинация позволяет решить проблему, о которой сообщает среда разработки.
например, добавить импорт библиотек под желаемый метод, либо создать описание нового метода, который был введён к коде.

Методы могут быть вложеными один в другой, кроме того методы можно указывать в качестве параметров для других методов.
В последнем случае, результат работы одного метода будет входным параметром второго метода, в котором первый указан 
в качестве параметра.

> Рекурсия - когда метод вызывает сам себя. Количество рекурсивных вызовов - глубина рекурсии.



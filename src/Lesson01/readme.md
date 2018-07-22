# Урок 1 - Hello Java!
_страница:8_

Основные отличия/преимущества Java

> строгая типизация + кроссплатформенность

Истоки: Патрик Нортон + Джеймс Гослинг

Первое название : Oak -> Java (1995)

## Переменные среды
```
JAVA_HOME = C:\Program Files\Java\jdk-10
Path = %JAVA_HOME%\bin;...
```

> JAVA_HOME - чтобы различные прикладные средства знали где находится java на компьютере

> Path - чтобы сам Windows/система знала с помощью каких средств запускать java-программу

## Запуск простейшей программы

```
    C:\> cd D:\Projects\
    D:\> javac ./Main.java
    D:\> java Main
Hello World!
```

```
    C:\> javac D:\Projects\Main.java
    C:\> java -classpath D:\Projects\ Main
Hello World!
```
  
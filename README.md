# Лабораторная работа №1. Создание activity и передача параметров между ними

**Выполнила:** Торопчина
**Язык программирования:** Kotlin

## Что делает приложение?
Приложение состоит из двух экранов и передает параметр с первого экрана на второй по нажатию на кнопку.

## Внешний вид

1. После запуска открывается **экран 1**(`activity_main`) с кнопкой "Переход на 2ой экран".
2. По нажатию на кнопку происходит:
   - Переход на **экран 2** (`activity_second`).
   - Передача параметра из `activity_main` в переменную экрана `activity_second`.
   - На экране 2 отображается текст:  
     **"Переданный параметр: Торопчина"**.

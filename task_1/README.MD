# Промежуточная аттестация
___
___ 

## Задание 1

***

1)   Используйте команды операционной системы Linux и создайте две новых директории – «Игрушки для школьников» и «Игрушки для дошколят»

***
mishany@mishany-B450M-DS3H-V2:~/Рабочий стол/task_1$ ls -l

итого 0

mishany@mishany-B450M-DS3H-V2:~/Рабочий стол/task_1$ mkdir "Игрушки для школьников"

mishany@mishany-B450M-DS3H-V2:~/Рабочий стол/task_1$ ls -l

итого 4

drwxrwxr-x 2 mishany mishany 4096 мар 22 07:59 'Игрушки для школьников'

mishany@mishany-B450M-DS3H-V2:~/Рабочий стол/task_1$ mkdir "Игрушки для дошколят"

mishany@mishany-B450M-DS3H-V2:~/Рабочий стол/task_1$ ls -l

итого 8

drwxrwxr-x 2 mishany mishany 4096 мар 22 08:00 'Игрушки для дошколят'

drwxrwxr-x 2 mishany mishany 4096 мар 22 07:59 'Игрушки для школьников'

mishany@mishany-B450M-DS3H-V2:~/Рабочий стол/task_1$

![создание двух новых директории – «Игрушки для школьников» и «Игрушки для дошколят»](image/1.png)

***

2)   Создайте в директории «Игрушки для школьников» текстовые файлы - «Роботы», «Конструктор», «Настольные игры»
***
mishany@mishany-B450M-DS3H-V2:~/Рабочий стол/task_1$ cd "Игрушки для школьников"

mishany@mishany-B450M-DS3H-V2:~/Рабочий стол/task_1/Игрушки для школьников$ ls -l

итого 0

mishany@mishany-B450M-DS3H-V2:~/Рабочий стол/task_1/Игрушки для школьников$ touch "Роботы.txt" "Конструктор.txt" "Настольные игры.txt"

mishany@mishany-B450M-DS3H-V2:~/Рабочий стол/task_1/Игрушки для школьников$ ls -l

итого 0

-rw-rw-r-- 1 mishany mishany 0 мар 22 08:06  Конструктор.txt

-rw-rw-r-- 1 mishany mishany 0 мар 22 08:06 'Настольные игры.txt'

-rw-rw-r-- 1 mishany mishany 0 мар 22 08:06  Роботы.txt

mishany@mishany-B450M-DS3H-V2:~/Рабочий стол/task_1/Игрушки для школьников$ 

![Создание в директории «Игрушки для школьников» текстовые файлы - «Роботы», «Конструктор», «Настольные игры»Alt text](image/2.png)

***

3)    Создайте в директории «Игрушки для дошколят» текстовые файлы «Мягкие игрушки», «Куклы», «Машинки»

***
mishany@mishany-B450M-DS3H-V2:~/Рабочий стол/task_1/Игрушки для школьников$ cd ..

mishany@mishany-B450M-DS3H-V2:~/Рабочий стол/task_1$ cd "Игрушки для дошколят"

mishany@mishany-B450M-DS3H-V2:~/Рабочий стол/task_1/Игрушки для дошколят$ ls -l

итого 0

mishany@mishany-B450M-DS3H-V2:~/Рабочий стол/task_1/Игрушки для дошколят$ touch "Мягкие игрушки.txt" Куклы.txt Машинки.txt

mishany@mishany-B450M-DS3H-V2:~/Рабочий стол/task_1/Игрушки для дошколят$ ls -l

итого 0

-rw-rw-r-- 1 mishany mishany 0 мар 22 08:12  Куклы.txt

-rw-rw-r-- 1 mishany mishany 0 мар 22 08:12  Машинки.txt

-rw-rw-r-- 1 mishany mishany 0 мар 22 08:12 'Мягкие игрушки.txt'

mishany@mishany-B450M-DS3H-V2:~/Рабочий стол/task_1/Игрушки для дошколят$ 

![Создание в директории «Игрушки для дошколят» текстовые файлы «Мягкие игрушки», «Куклы», «Машинки»](image/3.png)

***

4)   Объединить 2 директории в одну «Имя Игрушки»

***

mishany@mishany-B450M-DS3H-V2:~/Рабочий стол/task_1$ ls -l

итого 8

drwxrwxr-x 2 mishany mishany 4096 мар 22 08:12 'Игрушки для дошколят'

drwxrwxr-x 2 mishany mishany 4096 мар 22 08:06 'Игрушки для школьников'

mishany@mishany-B450M-DS3H-V2:~/Рабочий стол/task_1$ ls 
'Игрушки для школьников' Конструктор.txt  'Настольные игры.txt'   Роботы.txt

mishany@mishany-B450M-DS3H-V2:~/Рабочий стол/task_1$ ls 
'Игрушки для дошколят' Куклы.txt   Машинки.txt  'Мягкие игрушки.txt'

mishany@mishany-B450M-DS3H-V2:~/Рабочий стол/task_1$ mkdir "Имя Игрушки" && cp /home/mishany/"Рабочий стол"/task_1/"Игрушки для дошколят"/*.txt /home/mishany/"Рабочий стол"/task_1/"Имя Игрушки" && cp /home/mishany/"Рабочий стол"/task_1/"Игрушки для школьников"/*.txt /home/mishany/"Рабочий стол"/task_1/"Имя Игрушки" && rm -r /home/mishany/"Рабочий стол"/task_1/"Игрушки для школьников" /home/mishany/"Рабочий стол"/task_1/"Игрушки для дошколят"

mishany@mishany-B450M-DS3H-V2:~/Рабочий стол/task_1$ ls -l

итого 4

drwxrwxr-x 2 mishany mishany 4096 мар 22 09:57 'Имя Игрушки'

mishany@mishany-B450M-DS3H-V2:~/Рабочий стол/task_1$ ls 'Имя Игрушки' 

Конструктор.txt   Куклы.txt   Машинки.txt  'Мягкие игрушки.txt'  'Настольные игры.txt'   Роботы.txt

mishany@mishany-B450M-DS3H-V2:~/Рабочий стол/task_1$ 


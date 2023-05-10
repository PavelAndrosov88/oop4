package view;

import presenter.DemoData;

import java.util.Scanner;

public class Menu {
    public Menu() {
        dd = new DemoData();
    }

    private DemoData dd;

    public void mainMenu() throws Exception {
        Scanner scan = new Scanner(System.in);
        int ex = 0;
        do {
            System.out.print("Что будем проверять? 0 - Выход, 1 - Integer, 2 - String, 3 - Double: ");
            ex = scan.nextInt();
            switch (ex) {
                case 1:
                    this.intDemo();
                    break;
                case 2:
                    this.strDemo();
                    break;
                case 3:
                    this.dblDemo();
                    break;
            }

        } while (ex != 0);


    }

    private void intDemo() throws Exception {
        System.out.println("Пример использования DynArray с типом данных Integer");
        System.out.println(dd.intDA);
        dd.intDA.add(10);
        System.out.println("Добавление в конец элемента со значением 10");
        System.out.println(dd.intDA);
        dd.intDA.add(45, 2);
        System.out.println("Добавление элемента со значением 45 на позицию 2");
        System.out.println(dd.intDA);
        dd.intDA.remove(10);
        System.out.println("Удаление элемента с позиции 10");
        System.out.println(dd.intDA);
        dd.intDA.remove((Integer) 45);
        System.out.println("Удаление элемента со значением 45");
        System.out.println(dd.intDA);
        System.out.println("Минимум");
        System.out.println(dd.intDA.min(Integer::compare));
        System.out.println("Максимум");
        System.out.println(dd.intDA.max(Integer::compare));
        System.out.println("Замена элемента №10 значением 77");
        dd.intDA.replace(77, 10);
        System.out.println(dd.intDA);
        System.out.println("Длина массива");
        System.out.println(dd.intDA.size());
        System.out.println("Сумма элементов массива");
        System.out.println(dd.intDA.sum());
        System.out.println("Сортировка пузырьком");
        dd.intDA.bubbleSort(Integer::compare);
        System.out.println(dd.intDA);

    }

    private void strDemo() throws Exception {
        System.out.println("Пример использования DynArray с типом данных String");
        System.out.println(dd.strDA);
        dd.strDA.add("LAST");
        System.out.println("Добавление в конец элемента со значением LAST");
        System.out.println(dd.strDA);
        dd.strDA.add("SECOND", 2);
        System.out.println("Добавление элемента со значением SECOND на позицию 2");
        System.out.println(dd.strDA);
        dd.intDA.remove(10);
        System.out.println("Удаление элемента с позиции 10");
        System.out.println(dd.strDA);
        dd.strDA.remove("SECOND");
        System.out.println("Удаление элемента со значением SECOND");
        System.out.println(dd.strDA);
        System.out.println("Минимум (длина строки)");
        System.out.println(dd.strDA.min((s0, s1) -> s0.length() - s1.length()));
        System.out.println("Максимум (длина строки)");
        System.out.println(dd.strDA.max((s0, s1) -> s0.length() - s1.length()));
        System.out.println("Замена элемента №10 значением TEN");
        dd.strDA.replace("TEN", 10);
        System.out.println(dd.strDA);
        System.out.println("Длина массива");
        System.out.println(dd.strDA.size());
        System.out.println("Сортировка вставками");
        dd.strDA.insertionSort((s0, s1) -> s0.length() - s1.length());
        System.out.println(dd.strDA);
    }

    private void dblDemo() throws Exception {
        System.out.println("Пример использования DynArray с типом данных Double");
        System.out.println(dd.dblDA);
        dd.dblDA.add(10.0);
        System.out.println("Добавление в конец элемента со значением 10.0");
        System.out.println(dd.dblDA);
        dd.dblDA.add(45.0, 2);
        System.out.println("Добавление элемента со значением 45.0 на позицию 2");
        System.out.println(dd.dblDA);
        dd.dblDA.remove(3);
        System.out.println("Удаление элемента с позиции 3");
        System.out.println(dd.dblDA);
        dd.dblDA.remove(45.0);
        System.out.println("Удаление элемента со значением 45.0");
        System.out.println(dd.dblDA);
        System.out.println("Минимум");
        System.out.println(dd.dblDA.min(Double::compare));
        System.out.println("Максимум");
        System.out.println(dd.dblDA.max(Double::compare));
        System.out.println("Замена элемента №4 значением 77.8");
        dd.dblDA.replace(77.8, 4);
        System.out.println(dd.dblDA);
        System.out.println("Длина массива");
        System.out.println(dd.dblDA.size());
        System.out.println("Сумма элементов массива");
        System.out.println(dd.dblDA.sum());
        System.out.println("Произведение элементов массива");
        System.out.println(dd.dblDA.mul());
        System.out.println("Сортировка выбором");
        dd.dblDA.selectionSort(Double::compare);
        System.out.println(dd.dblDA);
    }
}

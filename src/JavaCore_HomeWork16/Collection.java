package JavaCore_HomeWork16;

import java.util.*;

interface MyIterator extends Iterator {};
interface Anonym {
    void thirdOddElement();
};

public class Collection {
    static Random rnd = new Random();
    private Object[] arr;

    public Collection(int arr) {
        this.arr = new Object[arr];
        for (int i = 0; i < arr; i++) {
            this.arr[i] = rnd.nextInt(50);
        }
    }

    public Object[] getArr() {
        return arr;
    }

    public void setArr(Object[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    /*
    * Перший клас виводив значення масиву від першого до останнього. Зробити заміну непарних елементів на нуль і вивести на екран даний масив.
    */
    public void printFTL() {
        MyIterator iter = this.new iteratorFirstToLast();
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }

    private class iteratorFirstToLast implements MyIterator {
        int nextIndex = 0;
        @Override
        public boolean hasNext() {
            return (nextIndex < arr.length);
        }

        @Override
        public Object next() {
            Object retValue = (nextIndex % 2 == 0) ? 0 : arr[nextIndex];
            nextIndex++;
            return retValue;
        }
    }


    /*
    * Другий клас виводив від останнього до першого значення через одну цифру.
    */
    public void printLTF() {
        MyIterator iter = this.new iteratorLastToFirst();
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }

    private class iteratorLastToFirst implements MyIterator {
        int nextIndex = arr.length - 1;
        @Override
        public boolean hasNext() {
            return (nextIndex > 0);
        }
        @Override
        public Object next() {
            Object retValue = arr[nextIndex];
            nextIndex -= 2;
            return retValue;
        }
    }

    /*
    * Прогнати від останнього до першого елементу масиву. Перевірити кожен третій елемент масиву від останнього чи він непарний, якщо так то вивести дані елементи на консоль.
    */
    public void printThirdOddElement() {
        Anonym anon = new Anonym() {
            @Override
            public void thirdOddElement() {
                for (int i = arr.length - 1; i > 0; i -= 3) {
                        if(Integer.valueOf((Integer) arr[i]).intValue() % 2 != 0){
                            System.out.print(arr[i] + " ");
                        }
                    }
            }
        };
        anon.thirdOddElement();
    }

    /*
    * Пройтись від першого до останнього елементу масиву, перевірити кожен п’ятий елемент масиву, якщо він парний то відняти від нього число 100, і вивести на консоль ці числа.
    */
    public void printFiveEvenElement(){
        class Reduce100 {
            int retValue;
            public Reduce100(int retValue) {
                this.retValue = retValue;
                System.out.print(this.retValue - 100 + " ");
            }
        }
        for (int i = 0; i < arr.length; i += 5){
            if(Integer.valueOf((Integer) arr[i]).intValue() % 2 == 0){
                Reduce100 r = new Reduce100(Integer.valueOf((Integer) arr[i]).intValue());

            }
        }
    }




}

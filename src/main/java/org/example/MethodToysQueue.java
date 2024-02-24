package org.example;
import java.util.PriorityQueue;

import static org.example.OtherFunctions.*;

/**
 * Создание игрушек и их коллекции в виде очереди приоритетов
 */
public class MethodToysQueue{

    private static final PriorityQueue<Toys> toysPriorityQueue = new PriorityQueue<>();
    /**
     * Метод создания коллекции игрушек PriorityQueue
     */

    public static void makeToys(int quantity){
        for (int i = 0; i < quantity; i++) {
            Toys toy=makeOnlyToy();
            System.out.println(toy);
            toysPriorityQueue.add(toy);
        }
    }

    /**
     * Метод создания игрушки
     */
    public static Toys makeOnlyToy() {
        String nameMessage = "Введите название игрушки: ";
        String name = inputString(nameMessage);
        String numberMessage = "Введите % вероятности выигрыша игрушки: ";
        Integer percentageOfLoss = inputNumber(numberMessage);
        return new Toys(name, percentageOfLoss);
    }

    /**
     * Изменение вероятности % выпадения приза
     */
    public static void changeToys(){
        System.out.println(toysPriorityQueue.peek());
        int k = inputNumber("Введите новую вероятность выигрыша приза ");
        assert toysPriorityQueue.peek() != null;
        toysPriorityQueue.peek().setPercentageOfLoss(k);
        System.out.println(toysPriorityQueue.peek());

    }

    /**
     * Розыгрыш приза и выдача победителю с фиксацией данных в файл
     */
    public static void winToy(){

    }


    /**
     * Печать списка призов
     */
    public static void showToys(){
        if (toysPriorityQueue.isEmpty()){
            System.out.println("Список призов пуст ");
        } else {
            for (Toys elem : toysPriorityQueue){
                System.out.println(elem);
            }
        }
    }



}

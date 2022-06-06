package org.academiadecodigo.bootcamp;

import java.util.PriorityQueue;

public class ToDoList  {

    public boolean isEmpty;

    private Item item;

    PriorityQueue<Item> priorityQueue;

    public ToDoList() {

        priorityQueue = new PriorityQueue<>();

    }


    public boolean isEmpty() {


        return priorityQueue.isEmpty() ;

    }


    //removes priority tasks first

    public Item poll() {

        return priorityQueue.poll();

    }


    public void add(ImportanceLevel importanceLevel, int priority, String task) {

        priorityQueue.add(new Item(importanceLevel, priority, task));

    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////

    public class Item implements Comparable<Item> {

        private ImportanceLevel importanceLevel;

        private int priority;

        private String task;


        public Item(ImportanceLevel importanceLevel, int priority, String task) {

            this.importanceLevel = importanceLevel;

            this.priority = priority;

            this.task = task;


        }

        @Override


        public String toString(){

            return task;
        }



        @Override
        public int compareTo(Item item) {
            if (importanceLevel ==  item.importanceLevel ) {
               if(priority < item.priority) {
                   return -1;
               }
            }


            if (importanceLevel == ImportanceLevel.HIGH && item.importanceLevel == ImportanceLevel.LOW) {

                return -1;

            }

            if (importanceLevel == ImportanceLevel.MEDIUM && item.importanceLevel == ImportanceLevel.LOW) {

                return -1;

            }

            if (importanceLevel == ImportanceLevel.MEDIUM && item.importanceLevel == ImportanceLevel.HIGH) {


                return 1;
            }


            if (importanceLevel == ImportanceLevel.HIGH && item.importanceLevel == ImportanceLevel.MEDIUM) {

                return -1;

            }


            if (importanceLevel == ImportanceLevel.LOW && item.importanceLevel == ImportanceLevel.MEDIUM) {

                return 1;

            }

            if (importanceLevel == ImportanceLevel.LOW && item.importanceLevel == ImportanceLevel.HIGH) {

                return 1;

            }

            return 0;


        }


    }

}




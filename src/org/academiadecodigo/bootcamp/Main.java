package org.academiadecodigo.bootcamp;


public class Main {

    public static void main(String[] args) {

        ToDoList todoList = new ToDoList();

        // we are adding tasks to our todoList >> add( x, y, z)

        todoList.add(ImportanceLevel.MEDIUM, 1, "Jump out of my window");
        todoList.add(ImportanceLevel.HIGH, 2, " If I fail, Eat my kitten");
        todoList.add(ImportanceLevel.LOW, 1, "Do a flip while falling");
        todoList.add(ImportanceLevel.LOW, 2, "If I landed safe ..then Perfect ... If not, visit other patients at the emergency department");
        todoList.add(ImportanceLevel.HIGH, 1, "Hack UberEats");



        // if todolist is full >> remove what??
        // remove tasks done >> in this case it's gonna be 1st task(priority)

        while(!todoList.isEmpty()) {
            System.out.println(todoList.poll());
        }






    }
}

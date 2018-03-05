package todos;

import java.util.Scanner;

public class ToDos {
    public static void main(String[] args) {
        System.out.println("======== TO DO LIST APP =========");
        Scanner scanner = new Scanner(System.in);
        int answer;
        String[] toDoList = new String[10];
        int index = 0;
        do{
            ToDosViews.menuView();
            answer = scanner.nextInt();
            scanner.nextLine();
            switch (answer) {
                case 1:
                    if (index == toDoList.length) {
                        ToDosViews.noSpaceWarningMessage();
                        ToDosViews.waitForUser(scanner);
                    }else {
                        addToDo(scanner, toDoList, index);
                        index++;
                    }
                    break;
                case 2:
                    listToDos(toDoList, index);
                    ToDosViews.waitForUser(scanner);
                    break;
                case 3:
                    deleteToDo(scanner, toDoList);
                    reorganizeToDoList(toDoList);
                    index--;
                    break;
            }
        }while(answer != 0);
    }

//    public static void activateToDo (String[] todos, int i){
//        String active = todos[i];
//        todos[i] = active + "(X)";
//    }

    private static void listToDos(String[] toDoList, int toDosToDisplay) {
        if (toDosToDisplay == 0){
            ToDosViews.noToDoViewsDisplayMessage();
        }
        for (int i = 0; i < toDosToDisplay; i++) {
            System.out.println(String.valueOf((i+1) + ". " + toDoList[i]));
        }
    }


    public static void addToDo(Scanner scanner, String[] board, int index) {
        ToDosViews.newToDoMessage();
        String answer = scanner.nextLine();
        board[index] = answer;
    }

    public static void deleteToDo(Scanner scanner, String[] board){
        ToDosViews.deleteToDoMessage();
        int index = scanner.nextInt();
        board[index-1] = "";
        ToDosViews.toDoDeletedMessage();
    }

    public static void reorganizeToDoList(String[] board){
        int index = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i] != ""){
                board[index] = board[i];
                index++;
            }
        }
    }
}

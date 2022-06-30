package practice;

import java.util.ArrayList;

public class TodoList {
    ArrayList<String> todos = new ArrayList<>();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        todos.add(todo);
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указанный индекс,
        //  проверьте возможность добавления
        if (index < todos.size()) {
            todos.add(index, todo);
        } else {
            todos.add(todo);
        }
    }

    public void edit(int index, String todo) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        if (index < todos.size()) {
            todos.set(index, todo);
        }
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        if (todos.size() > 0 && index >= 0 && index < todos.size()) {
            todos.remove(index);
        }
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return todos;
    }

}
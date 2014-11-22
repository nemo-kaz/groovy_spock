package tddbc

/**
 * Created by knemoto2 on 2014/11/22.
 */
class Todo {
    private def todo = []

    int add(String s) {
        todo.add(s)
        return 1
    }

    String last() {

        return todo.last()
    }
}

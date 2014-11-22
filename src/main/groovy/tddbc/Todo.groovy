package tddbc

/**
 * Created by knemoto2 on 2014/11/22.
 */
class Todo {
    private def todo = []

    def add(String s) {
        todo.add(s)
    }

    String last() {

        return todo.last()
    }

    String first() {
        return todo.first()
    }

    String all() {
        return todo.toString()
    }

    def removeFirst() {
        todo.remove(0)
    }

    def removeLast() {
        todo.remove(todo.size()-1)
    }

    def removeAll() {
        todo.clear()
    }

    def swap(int i, int j) {
        Collections.swap(todo,i,j)
    }

    def load() {
        removeAll()
         new File('src/test/resources/LoadTestfile.csv').eachLine{
             add(it)
         }

    }

}

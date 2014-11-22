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

    def load(String filename) {
        removeAll()
         new File(filename).eachLine{
             add(it)
         }

    }

    def save(String filename) {
        new File (filename).withWriter {writer ->
            todo.each(){
                writer<< it+"\n"
            }
        }
    }
}

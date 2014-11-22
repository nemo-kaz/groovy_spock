package tddbc

import spock.lang.Specification

/**
 * Created by knemoto2 on 2014/11/22.
 */
class TodoTest extends Specification {

    def "TODOを追加できる"() {
        when:
        Todo todo=new Todo()
        then:
        todo.add("なにすかること") == 1
    }


    def "最後に追加したTODOのみの詳細を見れる"() {
        when:
        Todo todo=new Todo()
        todo.add("new task")
        then:
        todo.last() == "new task"
    }


    def "最後に追加したTODOのみの詳細を見れる2"() {
        when:
        Todo todo=new Todo()
        todo.add("new task 2")
        then:
        todo.last() == "new task 2"
    }



}



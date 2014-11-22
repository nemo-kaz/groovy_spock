package tddbc

import spock.lang.Specification

/**
 * Created by knemoto2 on 2014/11/22.
 */
class TodoTest extends Specification {
    def todo = new Todo()

    def "TODOを追加できる"() {
        expect:
        todo.add("task") == 1
    }


    def "最後に追加したTODOのみの詳細を見れる"() {
        when:
        todo.add(input)
        then:
        todo.last() == output
        where:
        input           | output
        "new task"      | "new task"
        "new task 2"    | "new task 2"
    }


    def "最初に追加したTODOのみの詳細を見れる"() {
        when:
        todo.add("first")
        todo.add("second")
        then:
        todo.first()=="first"
    }

    def "追加したTODO全てを一覧で見れる"(){
        when:
        todo.add("first")
        todo.add("second")
        todo.add("third")
        then:
        todo.all() == "[first, second, third]"
    }


}



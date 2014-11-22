package tddbc

import spock.lang.Specification

/**
 * Created by knemoto2 on 2014/11/22.
 */
class TodoSpec extends Specification {
    def todo = new Todo()

    def setup() {
        todo.add("first")
        todo.add("second")
        todo.add("third")
    }

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
        expect:
        todo.first()=="first"
    }

    def "追加したTODO全てを一覧で見れる"(){
        expect:
        todo.all() == "[first, second, third]"
    }

    def "最初に追加したTODOを削除できる"(){
        when:
        todo.removeFirst()
        then:
        todo.first() == "second"
    }

    def "最後に追加したTODOを削除できる"(){
        when:
        todo.removeLast()
        then:
        todo.last() == "second"
    }

    def "追加した全てのTODOを削除できる"(){
        when:
        todo.removeAll()
        then:
        todo.all() == "[]"
    }
}



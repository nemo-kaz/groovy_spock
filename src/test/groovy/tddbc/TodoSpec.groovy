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
        when:
        todo.add("task")
        then:
        todo.todo.toString() == "[first, second, third, task]"
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

    def "TODOの順序を入れ替えられる"(){
        when:
        todo.swap(0,2)
        then:
        todo.all() == "[third, second, first]"
    }

    def "ファイルから読み込める"(){
        when:
        todo.load("src/test/resources/LoadTestfile.csv")
        then:
        todo.all() == "[load, test, case]"
    }

    def "ファイルに保存できる(上書き)"(){
        when:
        todo.save("src/test/resources/SaveTestfile.csv")
        todo.removeAll()
        todo.load("src/test/resources/SaveTestfile.csv")
        then:
        todo.all() == "[first, second, third]"

    }


}




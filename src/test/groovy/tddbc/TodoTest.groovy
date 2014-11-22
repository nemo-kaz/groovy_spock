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




}



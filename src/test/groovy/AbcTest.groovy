import spock.lang.Specification
import spock.lang.Unroll

class AbcTest extends Specification {

    def "simple"() {
        when:
        "" == ""

        then:
        "" == ""
    }

    @Unroll
    def "aaa #param"() {
        when:
        param == param

        then:
        param == param

        where:
        [param] << ["1"]
    }
}

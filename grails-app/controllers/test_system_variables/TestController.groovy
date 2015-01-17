package test_system_variables

class TestController {

    def index() {
        // check that -Dtest_variable=test was applied correctly.
        assert 'test'.equals(System.getProperty('test_variable'))
        render('Ok')
    }

    def error() {
        render('Error.')
    }
}

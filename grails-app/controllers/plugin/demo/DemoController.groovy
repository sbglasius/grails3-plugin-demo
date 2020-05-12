package plugin.demo

import org.springframework.beans.factory.annotation.Value

class DemoController {

    @Value('${my.value}')
    String myValue

    def index() {
        render text: myValue


    }
}

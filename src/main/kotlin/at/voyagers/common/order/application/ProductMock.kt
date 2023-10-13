package at.voyagers.common.order.application

import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository

@Component
class ProductReader {

}

@Component
class ProductWriter {

    fun decrease(productOptionId: String, amount: Int) {

    }

}

@Repository
interface ProductRepository {

}
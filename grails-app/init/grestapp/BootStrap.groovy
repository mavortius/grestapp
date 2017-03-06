package grestapp

class BootStrap {

    def init = { servletContext ->
        Product.saveAll(
                new Product(name: "Apple", price: 2.0),
                new Product(name: "Orange", price: 3.0),
                new Product(name: "Banana", price: 1.0),
                new Product(name: "Cake", price: 4.0)
        )
    }
    def destroy = {
    }
}

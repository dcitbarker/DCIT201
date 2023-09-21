class ShoppingCart:
    items = []
    totalPrice = 0.0

#item must be a list. eg [item, price]
    def addItem(self, item):
        self.items.append(item)
    
    def removeItem(self, item):
        self.items.remove(item)


    def getTotalPrice(self):
# loop through the list and add up the prices
        self.totalPrice = 0.0
        for x in self.items:
            price = x[1]
            self.totalPrice = self.totalPrice + price
        return self.totalPrice

#end of class

shoppingCart = ShoppingCart()
shoppingCart.addItem(["Watch", 30])
shoppingCart.addItem(["Belt", 20])
shoppingCart.addItem(["Glasses", 250])

print(shoppingCart.getTotalPrice())

shoppingCart.removeItem(["Watch", 30])
print(shoppingCart.getTotalPrice())



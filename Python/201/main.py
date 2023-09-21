class Customers:
    def setName(self, name):
        self.name = name
    
    def identify(self):
        print("I am " + self.name)
    
    def __hidenMethod(self):
        print("I am hidden")    
        
cust = Customers()
cust.setName("Anthony Shedeur")
cust.identify();

cust.hidenMethod()

#using imports
from smple_modules import *
mod = aModule("")



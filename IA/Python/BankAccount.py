from abc import ABC, abstractmethod

class BankAccount(ABC):

    @abstractmethod
    def deposit(self):
        pass

    @abstractmethod
    def withdraw(self):
        pass

class CheckingAccount(BankAccount):

    def deposit(self, amount):
        self.balance = amount
        
    def withdraw(self, amount):
        self.balance = self.balance - amount - 0.50

class SavingsAccount(BankAccount):

    def deposit(self, amount):
        self.balance = amount
    
    def withdraw(self, amount):
        if self.balance > amount :
            self.balance = self.balance - amount



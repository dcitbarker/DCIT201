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
        print("Deposit Sucessful")
        
    def withdraw(self, amount):
        self.balance = self.balance - amount - 0.50
        print("Withdrawal Sucessful")

class SavingsAccount(BankAccount):

    def deposit(self, amount):
        self.balance = amount
        print("Deposit Sucessful")
    
    def withdraw(self, amount):
        if self.balance > amount :
            self.balance = self.balance - amount
            print("Withdrawal Sucessful")

#end of class
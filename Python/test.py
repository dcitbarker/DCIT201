#defining a class

class Mark:
    def showDetails():
        print("Amazing!")
    
class Student(Mark):
    age = 34
    def __init__(self, name, age, gender):
        self.name = name
        self.age = age
        self.gender = gender
        
    def studentDetails(self):
        print("My name is " + self.name + ". I am " + self.age + 
              " yrs old and a " + self.gender)

    def setHeight(self, height):
        self.height = height
        
    def getHeight(self):
        return self.height

student = Student("Shedeur", "21", "Male")
student.setHeight(5.1)
print(student.getHeight())
"""
student.studentDetails()


print(student.getHeight())


# list = [2, 4, 6, 8, 10]
# for i in range(0, len(list)):
#     print(list[i], end= " ")

# print()

# m = 10
# i = 0
# while i <= m:
#     print(i)
#     i = i + 1

# print("End")
"""
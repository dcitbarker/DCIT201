class Students:
    name = ""
    studentID = ""
    courseList = []

    def setName(self, name):
        self.name = name
    
    def getName(self):
        return self.name
    
    def setStudentID(self, student_id):
        self.studentID = student_id
    
    def getStudentID(self):
        return self.studentID

    def addCourse(self, course):
        self.courseList.append(course)
    
    def removeCourse(self, course):
        self.courseList.remove(course)

    def displayCourses(self):
        x = 1
        for course in self.courseList:
            print(course)

#end of class

student = Students()
student.setName("Anthony Shedeur")
student.setStudentID("10981589")
student.addCourse("DCIT 201")
student.addCourse("DCIT 203")
student.addCourse("DCIT 205")
student.addCourse("PHYS 241")
student.addCourse("PHYS 245")
student.addCourse("URGC 220")
student.addCourse("MATH 223")

student.displayCourses()

student.removeCourse("PHYS 245")
student.removeCourse("DCIT 203")

print()
student.displayCourses()



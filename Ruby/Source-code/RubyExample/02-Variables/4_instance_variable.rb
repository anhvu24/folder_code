 class Student
  def initialize student_id, student_name
    @student_id = student_id
    @student_name = student_name
  end
  
  def show
    puts "Student Name and ID : "
    puts @student_id, @student_name
  end
end

#Student.new(1, "Sara").show
#Student.new(2, "Raju").show

First = Student.new(3,"Mai")
First.show

Second = Student.new(4, "Duyen")
Second.show

First.show


#Result
=begin
Student Name and ID :
1
Sara
Student Name and ID :
2
Raju
=end

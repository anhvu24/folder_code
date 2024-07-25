class Staff
    def initialize(name, staff_id, department, distance, project, time)
        @name = name
        @staff_id = staff_id
        @department = department
        @distance = distance
        @project = project
        @time = time

    end

    def show_info
        #show name
        puts "- Name: #{@name}"

        #show staff id
        puts "- Staff id: #{@staff_id}"

        #show department
        puts "- Department: #{@department.upcase}"

        #show salary
        salary = 5000
        if @department == "qa"
            puts "- Salary per month: #{salary*1.4}"
        elsif @department == "dev"
            puts "- Salary per month: #{salary*1.4}"
        elsif @department == "ba"
            puts "- Salary per month: #{salary*1.2}"
        else
            puts "- Salary per month: #{salary}"
        end 
        
        #show allowance
        distance_allowance = 150
        puts "- Allowance (#{distance_allowance}/1km): #{distance_allowance * @distance}"

        #show OT project name
        if @project != ""
            puts "- OT in Project: #{@project}" 
        end
        
        #show OT salary
        ot_salary = 50
        if @project != ""
            puts "- OT salary (#{ot_salary}/1h): #{ot_salary * @time}"
        end


    end
 
end

#Nhập tên
print "Input Name: "
name = gets.chomp

#Nhập mã nhân viên
print "Input Staff id: "
staff_id = gets.chomp

#Nhập bộ phận
while department = "" do
    print "Input Department (QA/ Dev/ BA/ HK): "
    department = gets.chomp

    if department.downcase == "qa"
        department = department
        print "OT in project: "
        project = gets.chomp
        print "OT time: "
        time = gets.chomp.to_i
        break

    elsif department.downcase == "dev"
        department = department
        print "OT in project: "
        project = gets.chomp
        print "OT time: "
        time = gets.chomp.to_i
        break

    elsif department.downcase == "ba"
        department = department
        break

    elsif department.downcase == "hk"
        department = department
        break

    else 
        puts "Department is only QA or Dev or BA or HK"
    end
    
end

#Nhập khoảng cách (Hỏi)
# while distance = "" do
#     print "Input Distance: "
#     distance = gets.chomp

#     if distance.class == Integer
#         distance = distance.to_i
#         break
#     end

# end

print "Input Distance: "
distance = gets.chomp.to_i

    


a = Staff.new(name, staff_id, department, distance, project, time)
puts "\n"
puts "Staff Information:"
a.show_info





#Nhập Department = Ba / Hk đang lỗi


 
 

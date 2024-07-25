# Khoi tao lop People
class People
    def initialize (name, age)
        @name = name
        @age = age
    end

# a. Hãy định nghĩa 1 method để hiển thị thông tin đối tượng của Class People
    def show_info
        puts @name
        puts @age
        puts "\n"
    end

# b. Hãy định nghĩa các Accessor và setter để có thể truy cập và set giá trị cho thuộc tính của đối tượng
    def set_info (name, age)
        @name = name
        @age = age
    end

end

# Khởi tạo 2 đối tượng từ class People
people_1 = People.new("Anh Vu", 18)
people_2 = People.new("Hy Loa", 28)


# Hiển thị thông tin của 2 đối tượng vừa khởi tạo
people_1.show_info
people_2.show_info


# Thay đổi thông tin của đối tượng 2 và hiển thị thông tin của đối tượng 2 sau khi đã thay đổi
people_2.set_info("Hoa Ly", 38)
people_2.show_info
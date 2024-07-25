# Module gần giống Class
# Chỉ khác ở chỗ:
# - KO thể tạo đối tượng
# - KO thể kế thừa

#Tạo 1 module chứa phương thức xin_chao
module HelloWorld
    def xin_chao
        puts "Anh Vũ xin chào"
    end

    def tam_biet
        puts "Anh Vũ tạm biệt"
    end
end


#Include: Sau khi INCLUDE module vào trong class thì các phương thức trong module sẽ được xem là INSTANCE METHOD trong class
class A
    include HelloWorld
end

print "Include: "
a = A.new       #Khởi tạo đối tượng
a.xin_chao      #Dùng đối tượng để gọi method


#Extend: Sau khi EXTEND module vào trong class thì các phương thức trong module sẽ được xem là CLASS METHOD trong class
class B
    extend HelloWorld
end

print "Extend: "
B.tam_biet      #KO cần khởi tạo đối tượng, dùng class B để gọi method



#Module as Namespace
module Gym
    class Push
        def up
            puts "40 cái"
        end
    end

    class Run
        def distance
            puts "32 km"
        end
    end
end

a = Gym::Push.new
a.up        # => 40 cái

b = Gym::Run.new
b.distance  # => 32 km


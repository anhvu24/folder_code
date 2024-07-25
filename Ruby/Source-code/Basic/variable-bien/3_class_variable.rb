# Class variable - Biến lớp

class Dog
 
    def initialize(so_luong_chan)
      @@leg = so_luong_chan
    end
   
    def show_leg
      puts @@leg
    end
   
end
   
dog1 = Dog.new(4) #Khởi tạo đối tượng "dog1"
dog1.show_leg # 4
   
dog2 = Dog.new(10) #Khởi tạo đối tượng "dog2"
dog2.show_leg # 10
   
dog1.show_leg # 10


# Như ví dụ trên ta thấy biến @@leg đã bị thay đổi sau khi đối tượng "dog2" được tạo.
# Khác với instance variable, class variable sẽ được dùng chung cho tất cả các đối tượng của lớp đó.
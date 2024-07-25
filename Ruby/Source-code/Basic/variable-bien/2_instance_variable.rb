# Instance variable - Biến đối tượng

class Nguoi
    def initialize(ten)
      @name = ten
    end
   
    def show
      puts @name
    end
end
   
nguoi_1 = Nguoi.new("Quoc") #Khởi tạo đối tượng "nguoi_1"
nguoi_1.show # Quoc
  
nguoi_2 = Nguoi.new("Minh") #Khởi tạo đối tượng "nguoi_2"
nguoi_2.show # Minh

nguoi_1.show # Quoc


# Ở ví dụ trên ta thấy instance variable chỉ thuộc riêng lẻ cho mỗi đối tượng
# phạm vi sử dụng của nó là toàn bộ trong một lớp.


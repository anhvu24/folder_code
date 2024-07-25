#Các cách khai báo 1 array
a1 = Array.new                       # => 0 phần tử
a2 = Array.new(5)                    # => 5 phần tử ko có giá trị
a3 = Array[]                         # => 0 phần tử 
a4 = Array[1,2,3,4]                  # => 4 phần tử có giá trị
a5 = [1, 2, 3, 5, 1, 2, "anh vũ"]    # => 7 phần tử có giá trị


#Kiểm tra độ dài của array bằng method .length hoặc .size
a1 = Array.new  
a5 = [1, 2, 3, 5, 1, 2, "anh vũ"] 
puts a1.length
puts a5.size


#Truy cập vào các phần tử trong mảng (Có index -> tìm giá trị)
a5 = [1, 2, 3, 5, 1, 2, "anh vũ"] 
puts a5[6]
puts a5.first       # => in ra giá trị đầu của mảng
puts a5.last        # => in ra giá trị cuối của mảng


#Tìm giá trị index của 1 phần tử (Có giá trị -> tìm index)
a5 = [1, 2, 3, 5, 1, 2, "anh vũ"] 
puts a5.index("anh vũ")
puts a5.index(5)


#Mảng lồng nhau (Nested Array)
nested = [1, 2, 3, ["uyên", 5, 4]]
p nested


#Mảng lồng bên trong có chỉ số index là 3, nếu muốn truy cập vào phần tử thứ 1 của mảng lồng đó
nested = [1, 2, 3, ["uyên", 5, 4]]
puts nested[3][0]
puts nested[3][1]


#---------------------#
#--Thêm phần tử mảng--#
#---------------------#

#Cách 1: Gọi đến index tiếp theo, sau đó gán giá trị 
a1 = [1, 4, 5, 6]
a1[4] = "a1_thêm"
p a1
#NOTE: Nếu gọi đến index đã tồn tại, nó sẽ thay đổi luôn giá trị của phần tử tại index đó



#Cách 2: Dùng phương thức .push(_giá trị_)
a2 = [2, "hi", 5, 1]
a2.push("a2_thêm", 1)
p a2



#Cách 3: Dùng cú pháp riêng dành cho mảng là <<
a3 = Array["a", "b", "c"]
a3 << 3 
p a3



#Cách 4: Dùng phương thức .insert
a4 = [1, 2, 30, 4]
a4.insert 3, "vu"       # => thêm "vu" vào vị trí index = 3
p a4



#----------------------#
#---Xóa phần tử mảng---#
#----------------------#

#Cách 1: Xóa phần tử đầu: .shift
a1 = [1, 4, 5, 6]
a1.shift
p a1



#Cách 2: Xóa phần tử cuối: .pop
a2 = [2, "hi", 5, 1]
a2.pop
p a2 



#Cách 3: Xóa phần tử với giá trị: .delete(_giá trị_)
a3 = Array["a", "b", "c"]
a3.delete("b")
p a3



#Cách 4: Xóa phần tử với index: .delete_at(_index_)
a4 = [3, 1, 5 , 7, 8]
a4. delete_at(1)
p a4



#Cách 5: Dùng toán tử trừ (-) để loại bỏ giá trị trùng của các mảng
p [1, 2, 3, 5] - [5, 2]

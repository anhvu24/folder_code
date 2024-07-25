#If you didn't use !, print my_array returns the original array.
my_array = [3, 4, 8, 7, 1, 6, 5, 9, 2]
p my_array.sort     #[1, 2, 3, 4, 5, 6, 7, 8, 9]
p my_array          #[3, 4, 8, 7, 1, 6, 5, 9, 2]

#Sắp xếp mặc định sẽ là từ nhỏ đến lớn
my_array = [3, 4, 8, 7, 1, 6, 5, 9, 2]
p my_array.sort!    #[1, 2, 3, 4, 5, 6, 7, 8, 9]
p my_array          #[1, 2, 3, 4, 5, 6, 7, 8, 9]


#Sắp xếp ASC hay DESC
books = ["Nha Gia Kim", "Dac Nhan Tam", "Cach Nghi De Thanh Cong", "Cuoc Song Khong Gioi Han"]
p books.sort! {|a, b| a <=> b}      #ASC
p books.sort! {|a, b| b <=> a}      #DESC


#Sắp xếp theo length, ...
books = ["Nha Gia Kim", "Dac Nhan Tam", "Cach Nghi De Thanh Cong", "Cuoc Song Khong Gioi Han"]
p books.sort! {|a, b| a.length <=> b.length}  
# Viết chương trình RUby để chèn vào 1 chuỗi vào bên trong 1 chuỗi string đã có. Với điều kiện chuỗi đầu tiên sẽ nằm ở giữa chuỗi thứ 2
# Ví dụ:
# "ub" và "ry" => ruby
# Pyonz" và "th" => Pythonz
puts "Bài 1"

a = "ry"
b = "ub"
c = a.insert(a.length/2, b)    
puts c
puts "\n"


# 2. Viết chương trình Ruby để loại bỏ các ký tự space (khoảng trắng) trong chuỗi có sẵn
# Ví du:
# "Hi Hi    Hi" => "HiHiHi"
puts "Bài 2"

hihi = "Hi Hi    Hi"
puts hihi.delete(" ")
puts "\n"


# 3. Viết một chương trình Ruby để loại bỏ một chuỗi con khỏi một chuỗi được chỉ định.
# Ví dụ: "Ruby on Rails" => mong muốn xóa "on Rails" => thì kết quả hiển thị sẽ chỉ là Ruby
puts "Bài 3"

ac = "Ruby on Rails"
bc = ac.slice("Ruby")
puts bc







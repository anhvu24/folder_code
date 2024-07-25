# Các phương thức cơ bản

#1. Đổi kiểu String --> Integer với .to_i
puts "123".to_i         # => 123
puts "123-hello".to_i   # => 123
puts "hello".to_i       # => 0


#2. Làm tròn kiểu dữ liệu float với method .round
a = 4.89
b = 4.25
c = 3.141526

puts a.round            # => 5
puts b.round            # => 4
puts c.round(1)         # => 3.1
puts c.round(2)         # => 3.14
puts c.round(3)         # => 3.142


#3. Kiểm tra số chẵn lẻ sử dụng .even? và .odd? (even: chẵn, odd: lẻ)
puts 4.even?
puts 5.even?
puts 2.odd?
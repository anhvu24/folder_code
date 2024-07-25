#Các cách khai báo 1 hash
a = Hash.new                            # => hash rỗng
b = Hash.new("anhvu")                   # => hash có giá trị mặc định là "anhvu"
c = Hash["b1" => 100, b2: 200]
d = {}                                  # => hash rỗng
e = {:d1 => 5, :d2 => "vu", :d3 => 12}  # => khai báo như này cho dễ hiểu =))
f = {e1: 4, e2: 5, e3: "anh vu"}

#NOTE:
#Hash lưu dữ liệu dưới dạng Key - Value
#Key cỏ thể là String, Integer, Symbol
ha = {"str" => "thu uyên", 11 => 123, :sym => 321}


#Adding a key/value pair to a hash looks like this:
numbers = {}
numbers["one"] = 1
puts numbers
puts 3 + numbers["one"]
# prints out "4"



#Lấy giá trị: .select
grades = { alice: 100,
    bob: 92,
    chris: 95,
    dave: 97
}
puts grades.select { |name, grade| grade <  97 }     # => { :bob => 92, :chris => 95 }
puts grades.select { |k, v| k == :alice }            # => { :alice => 100 }
  


#Lấy giá trị theo KEY 
ha = {"str" => "thu uyên", 11 => 123, :sym => 321}
p ha["str"]     # => "thu uyên"
p ha[11]        # => 123
p ha[:sym]      # => 321    
p ha["aaa"]     # => Gọi tới KEY ko tồn tại -> Kết qả trả về là nil



#Lấy tất cả KEY trong hash: .keys
ha = {"str" => "thu uyên", 11 => 123, :sym => 321}
puts ha.keys



#Lấy tất cả VALUE trong hash: .values
ha = {"str" => "thu uyên", 11 => 123, :sym => 321}
puts ha.values



#Xóa tất cả các cặp KEY - VALUE trong hash: .clear
ha = {"str" => "thu uyên", 11 => 123, :sym => 321}
ha.clear
puts ha



#Xóa phần tử khi biết KEY: .delete(_key_)
ha = {"str" => "thu uyên", 11 => 123, :sym => 321}
ha.delete(11)
puts ha



#Xóa phần tử đầu: .shift
ha = {"str" => "thu uyên", 11 => 123, :sym => 321}
ha.shift
puts ha



#Kiểm tra một hash có rỗng hãy không: .empty?
ha = {"str" => "thu uyên", 11 => 123, :sym => 321}
ha_rong = {}
p ha.empty?                 # => false
p ha_rong.empty?            # => true



#Kiểm tra sự tồn tại của KEY: .include?(_key_)
ha = {"str" => "thu uyên", 11 => 123, :sym => 321}
p ha.include?(11)           # => true
p ha.include?(:symmmm)      # => false



#Gộp Hash: .merge
ha1 = {:a => 12, "ten" => "anh vũ"}
ha2 = {:tuoi => 20}
p ha2.merge ha1



#So sánh Hash: ==
x = {a: 1, b: 2}
y = {a: 1, b: 2}
z = {:a => 1, :b => 3}

p x == y                    # => true 
p x == z                    # => false







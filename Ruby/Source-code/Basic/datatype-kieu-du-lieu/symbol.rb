# Symbols make good hash keys for a few reasons:
# 1. They’re immutable, meaning they can’t be changed once they’re created;
# 2. Only one copy of any symbol exists at a given time, so they save memory;
# 3. Symbol-as-keys are faster than strings-as-keys because of the above two reasons.

a = "anh vu"
b = "anh vu"
puts a.object_id    # => 60
puts b.object_id    # => 80

c = :thuuyen
d = :thuuyen
puts c.object_id    # => 1066908
puts d.object_id    # => 1066908


#Chuyển Symbol --> String: .to_s
name = :vu
puts "name là: #{name.class}"                         # => Symbol

name_to_string = name.to_s
puts "name_to_string là: #{name_to_string.class}"     # => String
puts "name vẫn là: #{name.class}"                     # => Symbol


#Chuyển String --> Symbol: .to_sym hoặc .intern
name = "vu"
puts "name là: #{name.class}"                         # => String

name_to_symbol = name.to_sym
puts "name_to_string là: #{name_to_symbol.class}"     # => Symbol
puts "name vẫn là: #{name.class}"                     # => String
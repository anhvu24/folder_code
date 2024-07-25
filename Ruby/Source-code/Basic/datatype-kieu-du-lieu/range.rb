#Khai báo
a = (1..5)      #phạm vi từ 1 đến 5
b = (1...5)     #phạm vi từ 1 đến 4



#Chuyển Range -> Array: .to_a
p (1...5).to_a          # => [1, 2, 3, 4]
p ("a".."g").to_a       # => ["a", "b", "c", "d", "e", "f", "g"]



#Phương thức .step()
a = (1..6)      
p a.step(1).to_a        # => [1, 2, 3, 4, 5, 6]
p a.step(2).to_a        # => [1, 3, 5]

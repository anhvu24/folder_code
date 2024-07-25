# 1. cho mảng hiện tại, hãy tìm cách hiển thị như result mong muốn:
# Input: ["Ruby", "Android", "PHP", "Java", "QA", "BrSe"]
# Output:
# 1. Ruby
# 2. Android
# 3. PHP
# 4. Java
# 5. QA
# 6. BrSE

a = ["Ruby", "Android", "PHP", "Java", "QA", "BrSe"]
i = 0
while i < a.size do
    puts "#{i + 1}. #{a[i]}"
    i = i + 1
end
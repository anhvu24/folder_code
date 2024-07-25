# 2. cho mảng hiện tại, hãy tìm cách hiển thị như result mong muốn:
# Input: ["ruby", "android", "PHP", "java", "QA", "brSe"]
# Output: ["Ruby", "Android", "PHP", "Java", "Qa", "Brse"]

a = ["ruby", "android", "PHP", "java", "QA", "brSe"]
i = 0
while i < a.size do
    if a[i] == "ruby"
        a[i] = "Ruby"
    
    elsif a[i] == "android"
        a[i] = "Android"
   
    elsif a[i] == "PHP"
        a[i] = "PHP"

    elsif a[i] == "java"
        a[i] = "Java"

    elsif a[i] == "QA"
        a[i] = "Qa"

    elsif a[i] == "brSe"
        a[i] = "Brse"
    end
   i = i + 1
end

p a
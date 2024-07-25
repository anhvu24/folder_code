#Break
i = 1
while i <= 10
  puts i
  i += 1
  break if i == 5         #nếu đk if thỏa mãn thì dừng luôn vòng lặp
end


#Next
for i in 1..5 do
  puts i
  next if i % 2 == 0      #nếu đk if thỏa mãn thì các câu lệnh nằm dưới sẽ ko được thực hiện, chúng ta đi đến lần lặp tiếp theo của vòng lặp
  puts "a"
  puts "b"
end




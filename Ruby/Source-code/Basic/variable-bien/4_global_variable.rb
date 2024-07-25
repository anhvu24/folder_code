# Global variable - Biến toàn cục

$a = "anh vu"
 
def doi_ten
    $a = "hoa ly"
    puts "doi ten: #{$a}"
end
 
doi_ten # hoa ly
puts $a # hoa ly


#Ta thấy, khi giá trị của biến toàn cục thay đổi ở trong phương thức, thì sự thay đổi này ảnh hưởng ra tới bên ngoài phương thức
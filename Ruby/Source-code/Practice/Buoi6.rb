# Bài tập Practice Module:  
# Định nghĩa 4 class gồm: Vịt, Ngựa, Car và tàu thủy
# Khởi tạo 1 module Thông tin vận tốc với 2 method với yêu cầu như bên dưới:
#   Method 1- Hiển thị vận tốc chạy trung bình của từng loại class: Vịt: 10km/h, Ngựa: 50km/h, Car: 90km/h và Tàu thủy là 150km/h
#   Method 2- Hiển thị vận tốc chạy của từng loại đối tượng như bên dưới:
#       Đối tượng khởi tạo từ Class Car: BWM - vận tốc chạy là 140km/h, Kia morning - chạy với vận tốc 80km/h
#       Đối tượng khởi tạo từ class Vịt: Vịt nhà - vận tốc chạy là 3km/h, vịt trời - vận tốc chạy là 15km/h
#       Đối tượng khởi tạo từ class tàu thủy: Tàu du lịch - vận tốc chạy là 50km/h, tàu chở hàng - vận tốc chạy là 200km/h
# 1. Hãy tạo các class, module và đối tượng như mô tả bên trên
# 2. Hiển thị các thông tin về vận tốc của từng đối tượng và vận tốc trung bình

module ThongTinVanToc
    
    def van_toc_chay_trung_binh(vttb)
        puts vttb
    end

    def van_toc_chay(tv)
        puts tv
    end

end

class XeHoi
    include ThongTinVanToc
    extend ThongTinVanToc
end

class Vit
    include ThongTinVanToc
    extend ThongTinVanToc
end

class TauThuy
    include ThongTinVanToc
    extend ThongTinVanToc
end

#Thông tin xe hơi
print "Vận tốc trung bình xe hơi: "
XeHoi.van_toc_chay_trung_binh("90km/h")

print "Vận tốc xe BWM: "
bmv = XeHoi.new
bmv.van_toc_chay("140km/h")

print "Vận tốc xe KIA: "
kia = XeHoi.new
kia.van_toc_chay("80km/h")


#Thông tin vịt
print "Vận tốc trung bình của vịt: "
Vit.van_toc_chay_trung_binh("10km/h")

print "Vận tốc vịt nhà: "
vit_nha = Vit.new
vit_nha.van_toc_chay("3km/h")

print "Vận tốc vịt trời: "
vit_troi = Vit.new
vit_troi.van_toc_chay("15km/h")


#Thông tin tàu thủy
print "Vận tốc trung bình của tàu thủy: "
TauThuy.van_toc_chay_trung_binh("150km/h")

print "Vận tốc tàu du lịch: "
tau_du_lich = Vit.new
tau_du_lich.van_toc_chay("50km/h")

print "Vận tốc tàu chở hàng: "
tau_cho_hang = Vit.new
tau_cho_hang.van_toc_chay("200km/h")
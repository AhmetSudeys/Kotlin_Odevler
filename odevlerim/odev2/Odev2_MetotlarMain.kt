package com.ahmetsudeys.kotlinogreniyorum.odevlerim.odev2

import com.ahmetsudeys.kotlinogreniyorum.odevlerim.odev2.Odev2_Metotlar

fun main() {

    //nesneyi oluşturalım
    var nesne = Odev2_Metotlar()

    //soru-1 kullanımı
    var sonuc1 = nesne.Donustur(25.0)
    println("Fahrenheit Dönüşümü Yapılmıştır --> $sonuc1 F")


    //soru-2 kullanımı
    nesne.CevreHesapla(12,8)


    //soru-3 kullanımı
    val faktoriyel = nesne.FaktoriyelHesapla(5)
    println("Girilen sayının faktöriyeli: $faktoriyel")


    //soru-4 kullanımı
    val sonuc2= nesne.HarfHesaplaA("Bilgisayar")
    println("Kelimenizdeki 'a' harfi sayısı: $sonuc2")


    //soru-5 kullanımı
    nesne.IcAcilarToplaminiHesapla(3)


    //soru-6 kullanımı
    val para = nesne.MaasHesapla(30)
    println("Net Ücretiniz: $para")


    //soru-7 kullanımı
    nesne.UcretHesapla(55)

}
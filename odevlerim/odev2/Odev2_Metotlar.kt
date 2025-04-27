package com.ahmetsudeys.kotlinogreniyorum.odevlerim.odev2

class Odev2_Metotlar {

    //soru-1
    fun Donustur(derece:Double) : Double {
        val fahrenhiet = (derece * 1.8) + 32
        return fahrenhiet
    }


    //soru-2
    fun CevreHesapla(kenar1:Int, kenar2:Int) {
        val cevre = (2*kenar1) + (2*kenar2)
        println("Dikdörtgenin çevresi: $cevre cm")
    }


    //soru-3
    fun FaktoriyelHesapla(sayi:Int) : Int {
        var sonuc = 1
            for (i in 1..sayi) {
            sonuc = sonuc * i
        }
        return sonuc
    }


    //soru-4
    fun HarfHesaplaA(kelime:String) : Int {
        var sayac = 0
        for(i in kelime){
            if(i == 'a') {
                sayac++
            }
        }
        return sayac
    }


    //soru-5
    fun IcAcilarToplaminiHesapla(kenarSayisi:Int){
        println("İç Açılar Toplamı: " + (kenarSayisi-2) * 180 + " derece")
    }


    //soru-6
    fun MaasHesapla(gunSayisi:Int) : Int {
        var ucret = 0
        var saat = gunSayisi * 8
        if (saat > 160) {
            ucret = (160 * 10) + (saat-160) * 20
        }else {
            ucret = 10 * saat
        }
        return ucret
    }


    //soru-7
    fun UcretHesapla(kota:Int){
        if(kota<=50){
            println("Fatura Ücretiniz: 100 TL")
        }else{
            println("Fatura Ücretiniz: ${100 + ((kota-50)*4)} TL")
        }
    }


}
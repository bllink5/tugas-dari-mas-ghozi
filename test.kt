import java.util.*

fun main(args: Array<String>){
    print("Silahkan Isi Nama Anda : ")
    val nama = readLine()?.capitalize()

    when(nama) {
        "Abri"-> println("Wirausaha")
        "Dio" -> println("Jaringan")
        "Taufiq" -> println("Geodesi")
        else -> println("Anda Tidak Terdaftar!!")
    }
}
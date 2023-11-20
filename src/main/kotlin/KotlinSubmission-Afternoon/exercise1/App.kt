package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName: String = "Anggi"
    val lastName: String = "Novita Sari Harahap"
    val age: Number = 21
    val isSingle: Boolean = false

    println("Nama Depan: $firstName")
    println("Nama Belakang: $lastName")
    println("Umur: $age")
    println("Status: ${if (isSingle) "Single" else "Tidak Single"}")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID: $groupId")
    println("Anggota Group: $groupMember")
    println("Sesi: $session")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val daftarAnggota = listOf("Muhammad yahya ayyas", "Nurfaizi", "Anggi Novita Sari Harahap","Siti Wahyuni","Sella Agistya","Restu adil","Bobbysetiadi","Ricky Ageng","Apri","Muhammad Alfatih","Ahmad")
    val nama = daftarAnggota[2]

    return listOf(nama)
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Nisya","Praayoga")
    val countOfGroup = arrayOf<String>(
        "Muhammad yahya ayyas",
        "Nurfaizi",
        "Anggi Novita Sari Harahap",
        "Siti Wahyuni",
        "Sella Agistya",
        "Restu adil",
        "Bobbysetiadi",
        "Ricky Ageng",
        "Apri",
        "Muhammad Alfatih",
        "Ahmad"
    )

    return mentor.size + countOfGroup.size
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("13", listOf("Muhammad yahya ayyas", "Nurfaizi", "Anggi Novita Sari Harahap","Siti Wahyuni","Sella Agistya","Restu adil","Bobbysetiadi","Ricky Ageng","Apri","Muhammad Alfatih","Ahmad"), "Afternoon")

}
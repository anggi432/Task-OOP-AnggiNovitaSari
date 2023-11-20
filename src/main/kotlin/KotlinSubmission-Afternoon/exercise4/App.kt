package id.infinitelearning.KotlinSubmission.exercise4


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

    fun main() {
        val numSatu = 10
        val numDua = 0

        try {
            val result = numSatu / numDua
            println("Hasil pembagian: $result")
        } catch (e: ArithmeticException) {
            println("Terjadi kesalahan: Pembagian oleh nol tidak dapat dilakukan")

        }
    }

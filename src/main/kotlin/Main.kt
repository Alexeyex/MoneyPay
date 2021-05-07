import java.util.*

const val COMMISSION_IN_PERCENT = 0.75
const val MIN_COMMISSION_IN_KOPECKS = 3500


fun main() {
    val sc = Scanner(System.`in`)
    print("Введите сумму в копейках: ")
    val amount = sc.nextInt()
    var totalCommission:Double = amount*COMMISSION_IN_PERCENT/100
    if (totalCommission < MIN_COMMISSION_IN_KOPECKS) {
        totalCommission = MIN_COMMISSION_IN_KOPECKS.toDouble()
    }
    println("Ваша комиссия составит: $totalCommission копеек")
}
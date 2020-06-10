import java.util.*

fun main(args:Array<String>){
    var baseList: ArrayList<Int> = arrayListOf(0,0,0,-1,-1)
    var offset:Int = 2
    var discount:Int = 50
    var readLength:Int =4
    var priceList: ArrayList<Int> = arrayListOf()
    //проверка,в массив,для подсчёта скидки добавляются только числа больше 0 и не null
    if(baseList!=null && baseList.size>0){
        for(i in baseList.indices){
            if(baseList[i]>0 && baseList[i]!=null){
                priceList.add(baseList.get(i))
            }
        }
    }else println("массив пустой")
    //проверка на выпадание из массива
    if(offset+readLength-1 > priceList.size){
        readLength = priceList.size-1
        offset = 0
    }
    if(priceList!=null && priceList.size>0){
        var num = discont(priceList,offset,discount,readLength)
        for(i in num.indices){
            println(num[i])
        }
    }else println("базовый массив цен пустой")

}
fun discont(price:ArrayList<Int>,offset:Int,discount:Int,readLength:Int): Array<Int>{
    var numbers: Array<Int> = Array(readLength,{0})
    var t = 0
    for (i in offset..offset+readLength-1) {
        if (i >= offset && i < readLength + offset) {
            numbers[t] = Math.floor((price[i] - (price[i] * discount / 100)).toDouble()).toInt()
            t += 1
        }
    }
    return numbers
}

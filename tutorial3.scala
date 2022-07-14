import math.Pi
object tutorial3{
    def main(args: Array[String])={
        args(0) match{
            case "q1" =>    def area(r:Double):Double = Pi*r.toDouble*r.toDouble
                            // call the function with r = 55
                            printf("Area of a disk with radius 5 : %.2f\n", area(5))


            case "q2" =>    def tofahrenheit(c:Double):Double = c*1.80 + 32.00
                            // call the function with c = 35
                            printf("Fahrenheit value of 35 Celsius is : %.2f\n", tofahrenheit(35))


            case "q3" =>    def volume(r:Double):Double = 4.toDouble/3.toDouble*Pi*r*r*r
                            // call the function with r = 5
                            printf("volume of a sphere with radius 5 : %.2f\n", volume(5))


            case "q4" =>    def covercost(copy:Int):Double = copy.toDouble*24.95
                            def discount(price:Double):Double = price*.4
                            def shipingcost(copy:Int):Double = if(copy>50) (3 + (copy-50)*.75).toDouble else 3.toDouble
                            def wholesalecost(copy:Int):Double = covercost(copy) - discount(covercost(copy)) + shipingcost(copy)
                            // call the function with copy = 60
                            printf("Total wholesale cost for 60 copies : %.2f\n",wholesalecost(60))


            case "q5" =>    def easy(x:Int):Int = x*8
                            def temp(x:Int):Int = x*7
                            // call necessory combinations of functions.
                            printf("Total running time : %d\n",easy(2)+temp(3)+easy(2))   }
    }
}
package com.example.vmstrings


object String_Manipulation {
     val EMP= "This field is required"
     val EQUALS = "This is palindrome"
     val ERR = "This is not a palindrome"

    fun isPrime(n: Int): Boolean {
        if (n <= 1) return false
        for (i in 2 until n) if (n % i === 0) return false
        return true
    }

    fun prime_index(input: String):String{

        val n = input.length

        var output:String = " "

        for (i in 1..n) if (!isPrime(i)){
            val b: String = input[i-1].toString()
            val c = output
            output=c+b
            println(output)
        }

        return output

        }


    fun isPalindrome(input: String): String {
        val reverse = StringBuffer(input).reverse().toString()
        if(input.isEmpty()){
            return EMP
        }
        if(input == reverse) {
            return EQUALS +" \n"+"Output string is  - "+prime_index(input)


        }else {
            return ERR
        }

    }

}


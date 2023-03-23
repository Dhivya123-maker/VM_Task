package com.example.vmstrings


object String_Manipulation {
     val empty= "This field is required"
     val palindrome = "This is palindrome"
     val not_palindrome = "This is not a palindrome"

    fun prime(n: Int): Boolean {
        if (n <= 1) return false
        for (i in 2 until n) if (n % i === 0) return false
        return true
    }

    fun primeIndex(input: String):String{

        val n = input.length

        var output:String = " "

        for (i in 1..n) if (!prime(i)){
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
            return empty
        }
        if(input == reverse) {
            return palindrome +" \n"+"Output string is  - "+primeIndex(input)


        }else {
            return not_palindrome +" \n"+"Output string is  - "+primeIndex(input)
        }

    }

}


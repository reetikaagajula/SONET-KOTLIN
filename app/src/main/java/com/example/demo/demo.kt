package com.example.demo

fun main() {
   /*var sum : Int = 0;
    var input: String
    do{
        print("Enter value");
        input = readLine()!!
        sum += input.toInt();
    }while(input != "0")
    print(sum);*/
    var input:Int
    input = 4
    //var x:Int = input.toInt()
    for (item in (1..input-1))
        print("$item"+"@")
    print(input)
}
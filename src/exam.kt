
//Given the string, check if it is a palindrome.
fun checkPalindrome(inputString: String): Boolean {
    var result : Boolean = true

    for ( i in inputString.length - 1 downTo 0){
        if (inputString[i] != inputString[inputString.length - 1 - i]){
            result = false
            break
        }
    }
    return result
}
/*For inputString = "aabaa", the output should be
checkPalindrome(inputString) = true;
For inputString = "abac", the output should be
checkPalindrome(inputString) = false;
For inputString = "a", the output should be
checkPalindrome(inputString) = true.*/
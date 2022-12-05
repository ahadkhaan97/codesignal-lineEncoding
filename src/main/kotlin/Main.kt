fun main() {
    print(solution("abbcabb"))
}

fun solution(s: String): String {
    var encodedString = ""
    var tempCount = 1
    for (i in 0 until s.length - 1) {
        if (s[i] == s[i + 1]) {
            tempCount++
        } else {
            if (tempCount > 1)
                encodedString += tempCount
            encodedString += s[i]
            tempCount = 1
        }
    }
    if (tempCount > 1)
        encodedString += tempCount
    encodedString += s[s.length - 1]

    return encodedString
}
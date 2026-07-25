fun main(args: Array<String>){
    var a: Int = 10
    var b: Int = 12

    //La condition if
    val resultatSi = if (a > b) {
        a++
        a
    } else {
        b++
        b
    }
    println("Resultat de Si: $resultatSi")

    //La condition when
    val apiResponse: Int = 209

    fun isSuccess(apiResponse: Int): Boolean = apiResponse == 200 || apiResponse == 201 || apiResponse == 202
    fun isError(apiResponse: Int): Boolean = apiResponse == 400 || apiResponse == 404

    when {
        isSuccess(apiResponse)  -> print("SUCCESS")
        isError(apiResponse) -> print("ERROR")
        else -> print("UNKNOWN")
    }
print("\n")
    val apiResponse_2: ApiResponse = ApiResponse.OK
    when {
        ApiResponse.OK == apiResponse_2 -> print("OK")
        ApiResponse.UNAUTHORIZED == apiResponse_2 -> print("UNAUTHORIZED")
        ApiResponse.NOT_FOUND == apiResponse_2 -> print("NOT_FOUND")
        ApiResponse.FORBIDDEN == apiResponse_2 -> print("FORBIDDEN")
        ApiResponse.UNKNOWN == apiResponse_2 -> print("UNKNOWN")
    }

    print("\n")

    val numberToFind: Int = 0

    when (numberToFind) {
        in 0..29 -> print("Le nombre est entre 0 et 29")
        in 30..59 ->print("Le nombre est entre 30 et 59")
        in 60..100 -> print("Le nombre est entre 60 et 100")
        else -> print("Le  nombre est plus grand que 100")
    }

}

//Enum

enum class ApiResponse(val code: Int) {
    OK(200),
    NOT_FOUND(404),
    UNAUTHORIZED(401),
    FORBIDDEN(403),
    UNKNOWN(0);
}
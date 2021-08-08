class AuthRepository(val authApi : AuthApi) {

    suspend fun login(credentials : Credentials){
        try{
            //Authentication 
            authApi.signin(credentials)
        }catch(e : Exception){
            //Saving error logs
            val file = File("logs")
            file.appendText {
                text = e.message
            }
        }
    }
}
class AuthRepository(val authApi : AuthApi, val logger : Logger) {

    suspend fun login(credentials : Credentials){
        try{
            //Authentication 
            authApi.signin(credentials)
        }catch(e : Exception){
            //calling logger to do stuff
            logger.log(e)
        }
    }
}

class Logger{


    fun log(e : Exception){
        //Saving error logs
        val file = File("logs")
        file.appendText {
            text = e.message
        }
    }
}
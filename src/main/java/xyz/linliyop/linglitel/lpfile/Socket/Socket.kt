package xyz.linliyop.linglitel.lpfile.Socket

import xyz.linliyop.linglitel.lpfile.BaseAppliaction
import xyz.linliyop.linglitel.lpfile.Config.Config
import java.io.*
import java.net.Socket

class Socket {
    var socket : Socket? = null
    var output: OutputStreamWriter? = null
    var input: InputStreamReader? = null

    fun startContect(ip : String, port : Int){
        try{
            socket = Socket(ip, port)
            socket?.soTimeout = 5000
             input = InputStreamReader(socket?.getInputStream())
            output = OutputStreamWriter(socket?.getOutputStream())
        }catch (e :IOException){e.printStackTrace()}
    }
    fun checkServerStatus(): Boolean? {
        return socket?.isConnected
    }
    fun reciveFileCacheList(json : String){
        val name = "cache"
        if(!Config().checkConfig(name)){Config().createConfig(name)}
        // input json
        File(BaseAppliaction.context.filesDir.path + File.separatorChar + "Server" + File.separatorChar + name + ".json").writeText(json)
    }
    fun login(password : String){
        client(password) //send password,if checkServerStatus true ,that it can start
    }

    fun client(message : String) : String {
        try {
            message.toByteArray()
            output?.write(message)
            output?.flush()
        }
        catch (e : IOException){}
            val inmessage = CharArray(1024)
            val a = input!!.read(inmessage)
            if (a <= -1) {
                return "null"
            }
            return String(inmessage, 0, a)
        }
}


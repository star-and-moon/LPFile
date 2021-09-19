package xyz.linliyop.linglitel.lpfile.Config

import com.google.gson.Gson
import xyz.linliyop.linglitel.lpfile.BaseAppliaction
import java.io.File

class Config {
    fun checkConfig(name : String): Boolean {
        val configpath = BaseAppliaction.context.filesDir.path + File.separatorChar + "Server" + File.separatorChar + name + ".json"
        return File(configpath).exists()
    }
    fun createConfig(name : String){
        val configpath = BaseAppliaction.context.filesDir.path + File.separatorChar + "Server" + File.separatorChar + name + ".json"
        File(configpath).createNewFile()
    }
    fun writeConfig(name : String){}
    fun deleteConfig(name: String){}
    fun readFileConfig(json : String, value : String): String {
        // get file info from json,should give json string and vaule,output the file info
        var FileInfo = Gson().fromJson(json, FileInfo::class.java)
        when (value) {
            "id" -> return FileInfo.id
            "name" -> return FileInfo.name
            "lasttime" -> return FileInfo.lasttime
            "permissoin" -> return FileInfo.permissoin
            "type" -> return FileInfo.type
            "suffix" -> return FileInfo.suffix
            "size" -> return FileInfo.size
            "owner" -> return FileInfo.owner
            "sha256" -> return FileInfo.sha256
            else -> return "error"
        }
    }
}
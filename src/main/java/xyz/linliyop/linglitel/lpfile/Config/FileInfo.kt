package xyz.linliyop.linglitel.lpfile.Config

data class FileInfo(
    val id : String,
    val name : String,
    val lasttime : String,
    val permissoin : String,
    val type : String,
    val suffix : String,
    val size : String,
    val owner : String,
    var sha256 : String
)

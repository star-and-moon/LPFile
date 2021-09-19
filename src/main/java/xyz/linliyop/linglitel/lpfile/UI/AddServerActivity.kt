package xyz.linliyop.linglitel.lpfile.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import xyz.linliyop.linglitel.lpfile.R
import xyz.linliyop.linglitel.lpfile.databinding.ActivityAddServerBinding

class AddServerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityAddServerBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_add_server)
        setContentView(binding.root)
        binding.addServerSure.setOnClickListener {
            var server_name = binding.serverName.text.toString()
            var server_address = binding.serverAddress.text.toString()
            var server_password = binding.serverPassword.text.toString()
        }
    }
}
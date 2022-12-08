package guri.projects.quizzyy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart : Button = findViewById(R.id.btnStart)
        val etView : EditText = findViewById(R.id.etName)


        btnStart.setOnClickListener{

            if(etView.text.isEmpty())
            {
                Toast.makeText(this, "Name field is Empty", Toast.LENGTH_LONG).show()
            }
            else
            {
                val intent = Intent(this, QuizQuestion::class.java)
                intent.putExtra(Constants.USER_NAME, etView.text.toString())

                startActivity(intent)
                finish()
            }
        }
    }
}
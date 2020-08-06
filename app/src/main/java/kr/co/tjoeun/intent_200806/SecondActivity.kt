package kr.co.tjoeun.intent_200806

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

//       세컨 액티비티 들어오자마자 > 바로 첨부된 값을 받아서 > 텍스트뷰에 반영
        val receivedMessage = intent.getStringExtra("message")
        receivedMessageTxt.text = receivedMessage
    }
}

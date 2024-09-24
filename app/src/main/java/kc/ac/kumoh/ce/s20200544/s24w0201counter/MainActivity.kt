package kc.ac.kumoh.ce.s20200544.s24w0201counter

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kc.ac.kumoh.ce.s20200544.s24w0201counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding  // 항상 초기화를 해줘야한다. / lateinit var : 나중에 초기화할께(late로 나중에 하기)
                                                    // ActivityMainBinding는 타입 형태다. activity_main.xml -> ActivityMainBinding
                                                    // sanake case (소문자로만) 을 pascal case(앞글자만 대문자로) 바꿔서 뒤에 binding을 붙인다.
    private var count = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        main = ActivityMainBinding.inflate(layoutInflater) //
//        setContentView(R.layout.activity_main)
        setContentView(main.root)

        main.btnAdd.setOnClickListener { //camel case(뒤에 문자 대문자로) 로 표시한다. btn_add -> btnAdd
            //main.txtCount.text = "눌렸습니다"
            main.txtCount.text = "${++count}"
        }

        main.btnSub.setOnClickListener { //감소
            if (count > 0)
                main.txtCount.text = "${--count}"
        }

        main.btnReset.setOnClickListener { // 초기화
            count = 0
            main.txtCount.text = "$count"
        }
        
//        enableEdgeToEdge()
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->  이부분은 아마도 필요없어서 주석처리하는것같다.
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}
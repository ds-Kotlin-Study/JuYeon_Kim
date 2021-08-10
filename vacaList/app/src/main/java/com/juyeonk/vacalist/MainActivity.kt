package com.juyeonk.vacalist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var WordNoteBookList = arrayListOf<WordNoteBook>(
        WordNoteBook("TOEIC", "not check"),
        WordNoteBook("토익스피킹", "not check"),
        WordNoteBook("토플", "not check"),
        WordNoteBook("오픽", "not check")
    )

    override fun onCreate(savedInstanceState: Bundle?) { // 액티비티의 실행 시작 지점점
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val item = arrayOf("사과", "배", "딸기", "키위")
//        // context란 한 액티비티의 모든 정보를 담고 있다.
//        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)

        val Adapter = WordNoteBookAdapter(this, WordNoteBookList)
        listView.adapter = Adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, WordDayListActivity::class.java) // 다음 화면으로 이동하기 위한 인텐트 객체 생성
            //intent.putExtra("msg", )
            startActivity(intent)
        }

    }
}
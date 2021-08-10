package com.juyeonk.vacalist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.listView
import kotlinx.android.synthetic.main.activity_word_day_list.*

class WordDayListActivity : AppCompatActivity() {

    var wordDayList = arrayListOf<WordDayList>(
        WordDayList("Day1", "not checked"),
        WordDayList("Day2", "not checked"),
        WordDayList("Day3", "not checked"),
        WordDayList("Day4", "not checked")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word_day_list)

        val Adapter = WordDayListAdapter(this, wordDayList)
        listViewWordDay.adapter = Adapter

//        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
//
//        }
    }
}
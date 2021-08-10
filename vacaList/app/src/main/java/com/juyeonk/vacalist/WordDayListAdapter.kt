package com.juyeonk.vacalist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class WordDayListAdapter(val context: Context, val wordDayList: ArrayList<WordDayList>) : BaseAdapter(){
    override fun getCount(): Int {
        return wordDayList.size
    }

    override fun getItem(position: Int): Any {
        return wordDayList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertview: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.list_item_word_day_list, null)

        val day = view.findViewById<TextView>(R.id.tv_day)
        val dayChecked = view.findViewById<TextView>(R.id.tv_isChecked)

        val dayList = wordDayList[position]

        day.text = dayList.day
        dayChecked.text = dayList.isChecked

        return view;
    }

}
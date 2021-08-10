package com.juyeonk.vacalist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class WordNoteBookAdapter (val context: Context, val wordNoteBookList: ArrayList<WordNoteBook>) : BaseAdapter(){
    override fun getCount(): Int {
        return wordNoteBookList.size
    }

    override fun getItem(position: Int): Any {
        return wordNoteBookList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertview: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.list_item_word_note_book, null)

        val name = view.findViewById<TextView>(R.id.tv_name)
        val isChecked = view.findViewById<TextView>(R.id.tv_check)

        val wnb = wordNoteBookList[position]

        name.text = wnb.name
        isChecked.text = wnb.isChecked

        return view;
    }

}
package com.example.testrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val notes = NotesSource().loadNotes()

        val notesRecyclerView = findViewById<RecyclerView>(R.id.note_recycler_view)
        notesRecyclerView.adapter = NoteRecyclerViewAdapter(this, notes)
    }
}
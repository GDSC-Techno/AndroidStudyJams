package com.example.testrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NoteRecyclerViewAdapter(private val context: Context, private val notes: List<Note>) :
    RecyclerView.Adapter<NoteRecyclerViewAdapter.NoteViewHolder>() {

    class NoteViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val titleTextView: TextView = view.findViewById(R.id.note_title)
        val descriptionTextView: TextView = view.findViewById(R.id.note_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.note_view, parent, false)

        return NoteViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val note = notes[position]
        holder.titleTextView.text = context.resources.getString(note.titleResourceId)
        holder.descriptionTextView.text = context.resources.getString(note.descriptionResourceId)
    }

    override fun getItemCount(): Int {
        return notes.size
    }

}
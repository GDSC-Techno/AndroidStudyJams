package com.example.testrecyclerview

class NotesSource {

    fun loadNotes(): List<Note> {
        return listOf<Note>(
            Note(R.string.note_1_title, R.string.note_1_description),
            Note(R.string.note_2_title, R.string.note_2_description),
            Note(R.string.note_3_title, R.string.note_3_description),
            Note(R.string.note_4_title, R.string.note_4_description),
            Note(R.string.note_5_title, R.string.note_5_description),
            Note(R.string.note_6_title, R.string.note_6_description)
        )
    }

}
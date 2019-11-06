package com.example.notesapp.data.provider

import androidx.lifecycle.LiveData
import com.example.notesapp.data.Note
import com.example.notesapp.data.NoteResult

interface RemoteDataProvider {
    fun subscribeToAllNotes() : LiveData<NoteResult>
    fun getNoteById(id: String) : LiveData<NoteResult>
    fun saveNote(note: Note) : LiveData<NoteResult>
}
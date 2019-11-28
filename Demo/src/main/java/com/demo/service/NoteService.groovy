package com.demo.service

import com.demo.entity.Note

interface NoteService {
	
	//List of notes
	List<Note> getAllNotes();
	//get one note
	Note getNote(int id);
	//AddNotes
	Void addNote(Note note);
	//Edit Notes
	Note editNote(int id);
	//DeleteNotes
	void deleteNote(int id);
}

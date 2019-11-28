package com.demo.dao

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

import com.demo.entity.Note

@Repository
interface NoteDao extends JpaRepository<Note,Integer>{

	// No need to define public

//	//List of notes
//	List<Note> getAllNotes();
//	//get one note
//	Note getNote(int id);
//	//AddNotes
//	Void addNote(Note note);
//	//Edit Notes
//	Note editNote(int id);
//	//DeleteNotes
//	void deleteNote(int id);

}

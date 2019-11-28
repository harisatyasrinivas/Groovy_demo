package com.demo.service

import javax.transaction.Transactional

import org.springframework.beans.factory.annotation.Autowired

import com.demo.dao.NoteDao
import com.demo.entity.Note

@Transactional
class NoteServiceImpl implements NoteService {
	
	@Autowired
	private final NoteDao noteDao;

	@Override
	List<Note> getAllNotes() {
		return noteDao.findAll();
	}

	@Override
	Note getNote(int id) {
		return noteDao.findById(id);
	}

	@Override
	public Void addNote(Note note) {
		noteDao.save(note);
	}

	@Override
	public Note editNote(int id) {
		Note note = noteDao.getOne(id);
		noteDao.save(note);
		return note;
	}

	@Override
	public void deleteNote(int id) {
		Note note = noteDao.getOne(id);
		noteDao.delete(note);
		
	}
}

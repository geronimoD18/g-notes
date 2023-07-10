package com.example.notesbyg

import android.app.TabActivity
import android.content.Intent
import android.os.Bundle
import android.widget.TabHost

class MainActivity : TabActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabHost: TabHost = findViewById(android.R.id.tabhost)
        tabHost.setup()

        // Pestaña "Agregar nota"
        val addNoteTabSpec: TabHost.TabSpec = tabHost.newTabSpec("Add Note")
        addNoteTabSpec.setIndicator("Agregar nota")
        addNoteTabSpec.setContent(R.id.tab_add_note)
        tabHost.addTab(addNoteTabSpec)

        // Pestaña "Ver notas"
        val viewNotesTabSpec: TabHost.TabSpec = tabHost.newTabSpec("View Notes")
        viewNotesTabSpec.setIndicator("Ver notas")
        viewNotesTabSpec.setContent(R.id.tab_view_notes)
        tabHost.addTab(viewNotesTabSpec)

        // Pestaña "Editar notas"
        val editNotesTabSpec: TabHost.TabSpec = tabHost.newTabSpec("Edit Notes")
        editNotesTabSpec.setIndicator("Editar notas")
        editNotesTabSpec.setContent(R.id.tab_edit_notes)
        tabHost.addTab(editNotesTabSpec)
    }
}

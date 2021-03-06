package com.gonichiwa.view;

import javax.swing.*;
import java.awt.event.*;
import java.util.EventListener;
import java.util.HashMap;
import java.awt.*;
import javax.swing.filechooser.*;


public class MindMapMenuBar extends JMenuBar {

	
	
	
	private JMenuItem neww,open,save,saveas,close,export,undo,redo,apply,change;


	public MindMapMenuBar() {
		createMenu();
	}
	
	//filemenu
	public void addNewwListener(ActionListener l) {
		neww.addActionListener(l);
	}
	public void addOpenListener(ActionListener l) {
		open.addActionListener(l);
	}
	public void addSaveListener(ActionListener l) {
		save.addActionListener(l);
	}
	public void addSaveasListener(ActionListener l) {
		saveas.addActionListener(l);
	}
	public void addCloseListener(ActionListener l) {
		close.addActionListener(l);
	}
	
	//editmenu
	public void addUndoListener(ActionListener l) {
		undo.addActionListener(l);
	}public void addRedoListener(ActionListener l) {
		redo.addActionListener(l);
	}
	public void addApplyListener(ActionListener l) {
		apply.addActionListener(l);	
	}
	public void addChangeListener(ActionListener l) {
		change.addActionListener(l);
	}
	//viewmenu (delete)
	
	public void createMenu() {
		
		
		//FileMenu
		JMenu fileMenu = new JMenu("File");
		String[] fileItemTitle = {"New", "Open", "Save", "Save As..", "Close", "Export To.."};


		neww = new JMenuItem(fileItemTitle[0]);
		open = new JMenuItem(fileItemTitle[1]);
		save = new JMenuItem(fileItemTitle[2]);
		saveas = new JMenuItem(fileItemTitle[3]);
		close = new JMenuItem(fileItemTitle[4]);
	
		fileMenu.add(neww);
		fileMenu.add(open);
		fileMenu.add(save);
		fileMenu.add(saveas);
		fileMenu.add(close);
		
		//EditMenu
		JMenu editMenu = new JMenu("Edit");
		JMenuItem[] editItem = new JMenuItem[5];
		String[] editItemTitle = { "Undo", "Redo", "Delete", "Apply", "Change"};


		apply = new JMenuItem(editItemTitle[3]);
		change = new JMenuItem(editItemTitle[4]);
		
		editMenu.add(apply);
		editMenu.add(change);
		
		//ViewMenu(delete)
		
		this.add(fileMenu);
		this.add(editMenu);
		//this.add(viewMenu);
		
		/*
		setJMenuBar(menuBar);
		*/
	}

}

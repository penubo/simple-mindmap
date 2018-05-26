package com.gonichiwa.view;

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.QuadCurve2D;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MindMapGraphView extends JPanel {
	private ArrayList<MindMapNodeView> nodes;
	public MindMapGraphView(int width, int height) {
		this.setLayout(null);
		this.setPreferredSize(new Dimension(width, height));
		nodes = new ArrayList<MindMapNodeView>();
	}
	
	public void addNode(MindMapNodeView node) {
		nodes.add(node);
		add(node);
		this.repaint();
	}
	
	public void removeNode(MindMapNodeView node) {
		nodes.remove(node);
		remove(node);
	}
	
	public void clearNodes() {
		nodes.clear();
		this.removeAll();
	}
	
	public void addMouseListenerToNodes(MouseListener l) {
		for(MindMapNodeView node : nodes) 
			node.addMouseListener(l);
	}
	
	public void addMouseMotionListenerToNodes(MouseMotionListener l) {
		for(MindMapNodeView node : nodes) 
			node.addMouseMotionListener(l);
	}
	
//	public void paint(Graphics g) {
//		Graphics2D g2d = (Graphics2D) g;
//		QuadCurve2D q2 = new QuadCurve2D.Float();
//		g2d.setStroke(new BasicStroke(4));
//		
//		// is that ok for each NodeView to have parent information? 
//		// isn't that domain logic? or is it view logic?
//		for(MindMapNodeView node : nodes) {
//			if(node.hasParent()) {
//				q2.setCurve(node.getLocation(), new Point(400, 0), node.getParentLocation());
//				g2d.draw(q2);
//			}
//		}
//	}
}





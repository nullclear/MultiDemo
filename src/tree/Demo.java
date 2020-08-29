package tree;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeWillExpandListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.ExpandVetoException;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

public class Demo {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("root");
		DefaultMutableTreeNode subnode1 = new DefaultMutableTreeNode("1");
		DefaultMutableTreeNode subnode2 = new DefaultMutableTreeNode("2");
		DefaultMutableTreeNode subnode11 = new DefaultMutableTreeNode("1.1");
		DefaultMutableTreeNode subnode12 = new DefaultMutableTreeNode("1.1");
		DefaultMutableTreeNode subnode21 = new DefaultMutableTreeNode("2.1");
		root.add(subnode1);
		root.add(subnode2);
		subnode1.add(subnode11);
		subnode1.add(subnode12);
		subnode2.add(subnode21);

		JTree tree = new JTree(root);
		f.getContentPane().add(tree);

		TreeSelectionModel model = tree.getSelectionModel();
		model.setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		tree.setShowsRootHandles(true);
		tree.putClientProperty("JTree.lineStyle", "None");
		
		ImageIcon leaficon = new ImageIcon("src/3.png");
		leaficon.setImage(leaficon.getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT));
		
		ImageIcon openicon = new ImageIcon("src/1.png");
		openicon.setImage(openicon.getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT));
		
		ImageIcon closedicon = new ImageIcon("src/2.png");
		closedicon.setImage(closedicon.getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT));

		DefaultTreeCellRenderer render = (DefaultTreeCellRenderer) tree.getCellRenderer();
		render.setLeafIcon(leaficon);
		render.setOpenIcon(openicon);
		render.setClosedIcon(closedicon);
		
		tree.addTreeSelectionListener(new TreeSelectionListener() {

			@Override
			public void valueChanged(TreeSelectionEvent e) {
				JTree t = (JTree) e.getSource();
				if (!t.isSelectionEmpty()) {
					TreePath paths[] = t.getSelectionPaths();
					for (TreePath path : paths) {
						Object obj[] = path.getPath();
						System.out.println(obj[obj.length - 1]);
					}
				}
			}
		});
		
		tree.addTreeWillExpandListener(new TreeWillExpandListener() {
			
			@Override
			public void treeWillExpand(TreeExpansionEvent e) throws ExpandVetoException {
				TreePath path=e.getPath();
				DefaultMutableTreeNode node=(DefaultMutableTreeNode) path.getLastPathComponent();
				System.out.println(node+"将要被展开");
			}
			
			@Override
			public void treeWillCollapse(TreeExpansionEvent e) throws ExpandVetoException {
				TreePath path=e.getPath();
				DefaultMutableTreeNode node=(DefaultMutableTreeNode) path.getLastPathComponent();
				System.out.println(node+"将要被折叠");
			}
		});
		f.setSize(800, 600);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}

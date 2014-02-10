/**
 * 
 */
package nl.avans.festivalplanner.view.panels;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

import nl.avans.festivalplanner.utils.Enums.Text;
import nl.avans.festivalplanner.view.ApplicationView;
import nl.avans.festivalplanner.view.Panel;

/**
 * @author Jordy Sipkema
 * 
 */
public class InfoPanel extends Panel
{
	/*
	 * WARNING: This method is for debug-purposes only.
	 * The usage of this method is restricted to testing this class only!
	 */
	

	private static final long serialVersionUID = 2879106751679669257L;
	
	private JButton _saveButton = new JButton(Text.Save.toString());
	private JButton _cancelButton = new JButton(Text.Cancel.toString());

	/**
	 * Creates a new InfoPanel. This panel is used to display and edit the
	 * festival data.
	 */
	public InfoPanel()
	{
		super(new FlowLayout());
		initialize();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nl.avans.festivalplanner.view.Panel#getPanel()
	 */
	@Override
	public Panel getPanel()
	{
		return this;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		
	}
	
	private void initialize()
	{
		add(_saveButton);
		add(_cancelButton);
	}



}
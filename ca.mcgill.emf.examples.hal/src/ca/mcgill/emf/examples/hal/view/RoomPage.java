package ca.mcgill.emf.examples.hal.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.Set;

import javax.swing.*;
import javax.swing.table.*;

import ca.mcgill.emf.examples.hal.controller.HalController;
import ca.mcgill.emf.examples.hal.controller.ToActuator;
import ca.mcgill.emf.examples.hal.controller.ToRoom;
import ca.mcgill.emf.examples.hal.controller.ToSensor;

public class RoomPage extends JFrame {
	
	private static final long serialVersionUID = -4426310869335015542L;
	
	// UI elements
	private JLabel errorMessage = new JLabel();
	// Room
	private JComboBox<String> roomsList = new JComboBox<String>(new String[0]);
	private JButton showRoomButton = new JButton();
	private JButton deleteRoomButton = new JButton();
	private JButton clearRoomButton = new JButton();
	private JLabel roomNameLabel = new JLabel();
	private JLabel roomNameText = new JLabel();
	private JLabel newRoomNameLabel = new JLabel();
	private JTextField newRoomNameTextField = new JTextField();
	private JButton addRoomButton = new JButton();
	private JButton addUpdateRoomButton = new JButton();
	// Device
	private JLabel removeDeviceLabel = new JLabel();
	// Sensor
	private JTable sensorTable = new JTable();
	private JScrollPane sensorScrollPane = new JScrollPane(sensorTable);
	private JComboBox<String> sensorTypesList = new JComboBox<String>(new String[0]);
	private JButton deleteSensorTypeButton = new JButton();
	private JLabel newSensorTypeLabel = new JLabel();
	private JTextField newSensorTypeTextField = new JTextField();
	private JButton addSensorTypeButton = new JButton();
	private JLabel newSensorNameLabel = new JLabel();
	private JTextField newSensorNameTextField = new JTextField();
	private JButton addSensorButton = new JButton();
	private JLabel newSensorPeriodLabel = new JLabel();
	private JTextField newSensorPeriodTextField = new JTextField();
	private JLabel newSensorIsActiveLabel = new JLabel();
	private JCheckBox newSensorIsActiveCheckBox = new JCheckBox();
	// Actuator
	private JTable actuatorTable = new JTable();
	private JScrollPane actuatorScrollPane = new JScrollPane(actuatorTable);
	private JComboBox<String> actuatorTypesList = new JComboBox<String>(new String[0]);
	private JButton deleteActuatorTypeButton = new JButton();
	private JLabel newActuatorTypeLabel = new JLabel();
	private JTextField newActuatorTypeTextField = new JTextField();
	private JButton addActuatorTypeButton = new JButton();
	private JLabel newActuatorNameLabel = new JLabel();
	private JTextField newActuatorNameTextField = new JTextField();
	private JButton addActuatorButton = new JButton();
	private JLabel newActuatorIsActiveLabel = new JLabel();
	private JCheckBox newActuatorIsActiveCheckBox = new JCheckBox();

	// data elements
	private String error = null;
	// Room's devices
	private DefaultTableModel sensorsDtm;
	private DefaultTableModel actuatorsDtm;
	private String sensorColumnNames[] = {"Sensor", "Type", "Active", "Period (s)"};
	private String actuatorColumnNames[] = {"Actuator", "Type", "Active"};
	private static final int HEIGHT_DEVICES_TABLE = 100;

	public RoomPage() {
		initComponents();
		refreshData(null);
	}

	/** This method is called from within the constructor to initialize the form.
	 */
	@SuppressWarnings("serial")
	private void initComponents() {
		// elements for error message
		errorMessage.setForeground(Color.RED);
		
		// elements for room
		initializeButton(showRoomButton, "Show", this::showRoomsButtonActionPerformed);
		initializeButton(deleteRoomButton, "Delete", this::deleteRoomButtonActionPerformed);
		initializeButton(clearRoomButton, "Clear", this::clearRoomButtonActionPerformed);
		roomNameLabel.setText("Room Name:");
		roomNameText.setText("");
		newRoomNameLabel.setText("New Room Name:");
		initializeButton(addRoomButton, "Add", this::addRoomButtonActionPerformed);
		initializeButton(addUpdateRoomButton, "Update", this::addUpdateRoomButtonActionPerformed);
		
		// elements for room's devices
		removeDeviceLabel.setText("Select a row in the table and hit the delete key to remove a device");
		
		// elements for room's sensors
		this.add(sensorScrollPane);
		Dimension d = sensorTable.getPreferredSize();
		sensorScrollPane.setPreferredSize(new Dimension(d.width, HEIGHT_DEVICES_TABLE));
		sensorScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		sensorTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// enable delete key in table to remove a row (device)
		InputMap inputMap = sensorTable.getInputMap(JComponent.WHEN_FOCUSED);
		ActionMap actionMap = sensorTable.getActionMap();
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0), "delete");
		actionMap.put("delete", new AbstractAction() {
			public void actionPerformed(ActionEvent deleteEvent) {
		    	devicesTableDeleteKeyActionPerformed(deleteEvent, true);
		    }
		});
		initializeButton(deleteSensorTypeButton, "Delete", this::deleteSensorTypeButtonActionPerformed);
		newSensorTypeLabel.setText("New Sensor Type:");
		initializeButton(addSensorTypeButton, "Add Type", this::addSensorTypeButtonActionPerformed);
		newSensorNameLabel.setText("New Sensor Name:");
		initializeButton(addSensorButton, "Add Sensor", this::addSensorButtonActionPerformed);
		newSensorPeriodLabel.setText("Sensor Period (seconds):");
		newSensorIsActiveLabel.setText("Active");
		
		// elements for room's actuators
		this.add(actuatorScrollPane);
		Dimension d2 = actuatorTable.getPreferredSize();
		actuatorScrollPane.setPreferredSize(new Dimension(d2.width, HEIGHT_DEVICES_TABLE));
		actuatorScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		actuatorTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// enable delete key in table to remove a row (device)
		InputMap inputMap2 = actuatorTable.getInputMap(JComponent.WHEN_FOCUSED);
		ActionMap actionMap2 = actuatorTable.getActionMap();
		inputMap2.put(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0), "delete");
		actionMap2.put("delete", new AbstractAction() {
			public void actionPerformed(ActionEvent deleteEvent) {
		    	devicesTableDeleteKeyActionPerformed(deleteEvent, false);
		    }
		});
		initializeButton(deleteActuatorTypeButton, "Delete", this::deleteActuatorTypeButtonActionPerformed);
		newActuatorTypeLabel.setText("New Actuator Type:");
		initializeButton(addActuatorTypeButton, "Add Type", this::addActuatorTypeButtonActionPerformed);
		newActuatorNameLabel.setText("New Actuator Name:");
		initializeButton(addActuatorButton, "Add Actuator", this::addActuatorButtonActionPerformed);
		newActuatorIsActiveLabel.setText("Active");

		// global settings and listeners
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("HAL System: Room Management");

		// horizontal line elements
		JSeparator horizontalLine = new JSeparator();

		// layout
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		layout.setHorizontalGroup(
				layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup()
						.addComponent(errorMessage)
						.addGroup(layout.createSequentialGroup()
								.addComponent(roomsList, 200, 200, 400)
								.addComponent(showRoomButton)
								.addComponent(deleteRoomButton)
								.addComponent(clearRoomButton)
								)
						.addComponent(horizontalLine)
						.addGroup(layout.createSequentialGroup()
								.addComponent(roomNameLabel)
								.addComponent(roomNameText))
						.addGroup(layout.createSequentialGroup()
								.addComponent(newRoomNameLabel)
								.addComponent(newRoomNameTextField, 200, 200, 400)
								.addComponent(addRoomButton)
								.addComponent(addUpdateRoomButton)
								)	
						.addComponent(removeDeviceLabel)
						.addComponent(sensorScrollPane)
						.addGroup(layout.createSequentialGroup()
								.addComponent(sensorTypesList, 200, 200, 400)
								.addComponent(deleteSensorTypeButton)
								)
						.addGroup(layout.createSequentialGroup()
								.addComponent(newSensorTypeLabel)
								.addComponent(newSensorTypeTextField, 200, 200, 400)
								.addComponent(addSensorTypeButton)
								)
						.addGroup(layout.createSequentialGroup()
								.addComponent(newSensorNameLabel)
								.addComponent(newSensorNameTextField, 200, 200, 400)
								.addComponent(addSensorButton)
								)
						.addGroup(layout.createSequentialGroup()
								.addComponent(newSensorPeriodLabel)
								.addComponent(newSensorPeriodTextField, 50, 50, 100)
								.addComponent(newSensorIsActiveLabel)
								.addComponent(newSensorIsActiveCheckBox)
								)
						.addComponent(actuatorScrollPane)
						.addGroup(layout.createSequentialGroup()
								.addComponent(actuatorTypesList, 200, 200, 400)
								.addComponent(deleteActuatorTypeButton)
								)
						.addGroup(layout.createSequentialGroup()
								.addComponent(newActuatorTypeLabel)
								.addComponent(newActuatorTypeTextField, 200, 200, 400)
								.addComponent(addActuatorTypeButton)
								)
						.addGroup(layout.createSequentialGroup()
								.addComponent(newActuatorNameLabel)
								.addComponent(newActuatorNameTextField, 200, 200, 400)
								.addComponent(addActuatorButton)
								)
						.addGroup(layout.createSequentialGroup()
								.addComponent(newActuatorIsActiveLabel)
								.addComponent(newActuatorIsActiveCheckBox)
								)
						)
				);

		layout.setVerticalGroup(
				layout.createParallelGroup()
				.addGroup(layout.createSequentialGroup()
						.addComponent(errorMessage)
						.addGroup(layout.createParallelGroup()
								.addComponent(roomsList)
								.addComponent(showRoomButton)
								.addComponent(deleteRoomButton)
								.addComponent(clearRoomButton)
								)
						.addComponent(horizontalLine)
						.addGroup(layout.createParallelGroup()
								.addComponent(roomNameLabel)
								.addComponent(roomNameText))
						.addGroup(layout.createParallelGroup()
								.addComponent(newRoomNameLabel)
								.addComponent(newRoomNameTextField)
								.addComponent(addRoomButton)
								.addComponent(addUpdateRoomButton)
								)
						.addComponent(removeDeviceLabel)
						.addComponent(sensorScrollPane)
						.addGroup(layout.createParallelGroup()
								.addComponent(sensorTypesList)
								.addComponent(deleteSensorTypeButton)
								)
						.addGroup(layout.createParallelGroup()
								.addComponent(newSensorTypeLabel)
								.addComponent(newSensorTypeTextField)
								.addComponent(addSensorTypeButton)
								)
						.addGroup(layout.createParallelGroup()
								.addComponent(newSensorNameLabel)
								.addComponent(newSensorNameTextField)
								.addComponent(addSensorButton)
								)
						.addGroup(layout.createParallelGroup()
								.addComponent(newSensorPeriodLabel)
								.addComponent(newSensorPeriodTextField)
								.addComponent(newSensorIsActiveLabel)
								.addComponent(newSensorIsActiveCheckBox)
								)
						.addComponent(actuatorScrollPane)
						.addGroup(layout.createParallelGroup()
								.addComponent(actuatorTypesList)
								.addComponent(deleteActuatorTypeButton)
								)
						.addGroup(layout.createParallelGroup()
								.addComponent(newActuatorTypeLabel)
								.addComponent(newActuatorTypeTextField)
								.addComponent(addActuatorTypeButton)
								)
						.addGroup(layout.createParallelGroup()
								.addComponent(newActuatorNameLabel)
								.addComponent(newActuatorNameTextField)
								.addComponent(addActuatorButton)
								)
						.addGroup(layout.createParallelGroup()
								.addComponent(newActuatorIsActiveLabel)
								.addComponent(newActuatorIsActiveCheckBox)
								)
						)
				);
		
		pack();
	}

	/** This method is called each time the page needs to be updated to the latest data.
	 *  An empty page is shown if null is passed into the method.
	 */
	//TODO
	private void refreshData(String roomName) {
		// error
		errorMessage.setText(error);
		if (error == null || error.length() == 0) {
			// retrieve the room
			ToRoom foundRoom = null;
			if (roomName != null) {
				foundRoom = HalController.getRoom(roomName);
			}
			// populate room list
			roomsList.removeAllItems();
			int index = 0, foundIndex = -1;
			for (String rName : HalController.getRooms()) {
				roomsList.addItem(rName);
				if (rName.equals(foundRoom == null ? null : foundRoom.getName())) {
					foundIndex = index;
				}
				index++;
			};
			// enable groups list UI elements only if at least one group exist
			// rooms
			roomsList.setEnabled(index > 0);
			roomsList.setSelectedIndex(foundIndex);
			showRoomButton.setEnabled(index > 0);
			deleteRoomButton.setEnabled(index > 0);
			// sensor types
			Set<String> sensorTypes = foundRoom == null ? new HashSet<String>() : HalController.getSensorTypes();
			sensorTypesList.setEnabled(!sensorTypes.isEmpty());
			deleteSensorTypeButton.setEnabled(!sensorTypes.isEmpty());
			newSensorNameTextField.setEnabled(!sensorTypes.isEmpty());
			addSensorButton.setEnabled(!sensorTypes.isEmpty());
			newSensorPeriodTextField.setEnabled(!sensorTypes.isEmpty());
			newSensorIsActiveCheckBox.setEnabled(!sensorTypes.isEmpty());
			populateSensorList(sensorTypes);
			// actuator types
			Set<String> actuatorTypes = foundRoom == null ? new HashSet<String>() : HalController.getActuatorTypes();
			actuatorTypesList.setEnabled(!actuatorTypes.isEmpty());
			deleteActuatorTypeButton.setEnabled(!actuatorTypes.isEmpty());
			newActuatorNameTextField.setEnabled(!sensorTypes.isEmpty());
			addActuatorButton.setEnabled(!sensorTypes.isEmpty());
			newActuatorIsActiveCheckBox.setEnabled(!sensorTypes.isEmpty());
			populateActuatorList(actuatorTypes);
			// populate other UI elements depending on whether a room was found or not
			if (foundIndex == -1) {
				foundRoom = null;
				// room
				roomNameText.setText("");
				// room's devices
				populateSensorsTable(null);
				populateActuatorsTable(null);
				// wipe these fields out
				newRoomNameTextField.setText("");
				newSensorTypeTextField.setText("");
				newSensorNameTextField.setText("");
				newActuatorTypeTextField.setText("");
				newActuatorNameTextField.setText("");
			} else {
				// room
				roomNameText.setText(foundRoom.getName());
				newRoomNameTextField.setText(foundRoom.getName());
				// room's devices
				populateSensorsTable(foundRoom);
				populateActuatorsTable(foundRoom);
			}
			enableDisableUiFields(foundIndex != -1);
			enableDisableUiFields2(foundIndex != -1 && !sensorTypes.isEmpty());
			enableDisableUiFields3(foundIndex != -1 && !actuatorTypes.isEmpty());
			
			Dimension d = sensorTable.getPreferredSize();
			sensorScrollPane.setPreferredSize(new Dimension(d.width, HEIGHT_DEVICES_TABLE));
			Dimension d2 = actuatorTable.getPreferredSize();
			actuatorScrollPane.setPreferredSize(new Dimension(d2.width, HEIGHT_DEVICES_TABLE));
		}

		// this is needed because the size of the window changes depending on whether an error message is shown or not
		pack();
	}

	/** The following ...ActionPerformed methods first call the Controller and then refresh the page with the desired room.
	 */
	
	private void populateSensorList(Set<String> sensorTypes) {
		sensorTypesList.removeAllItems();
		for(String st : sensorTypes) {
			boolean exists = false;
			 for (int index = 0; index < sensorTypesList.getItemCount() && !exists; index++) {
			   if (st.equals(sensorTypesList.getItemAt(index).toString())) {
			     exists = true;
			   }
			 }
			 if (!exists) {
				 sensorTypesList.addItem(st);
			 }
		}
	}
	
	private void populateActuatorList(Set<String> actuatorTypes) {
		actuatorTypesList.removeAllItems();
		for(String at : actuatorTypes) {
			boolean exists = false;
			 for (int index = 0; index < actuatorTypesList.getItemCount() && !exists; index++) {
			   if (at.equals(actuatorTypesList.getItemAt(index).toString())) {
			     exists = true;
			   }
			 }
			 if (!exists) {
				 actuatorTypesList.addItem(at);
			 }
		}
	}
	
	private void addRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = HalController.addRoom(newRoomNameTextField.getText());
		refreshData(newRoomNameTextField.getText());
	}
	
	private void clearRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = null;
		refreshData(null);
	}
	
	private void deleteRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		if (roomsList.getSelectedIndex() != -1) {
			String roomName = (String) roomsList.getSelectedItem();
	        int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete room " + roomName + "?", 
	        		"Confirm Deletion",	JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (choice == 0) {
				error = HalController.deleteRoom(roomName);
				refreshData(null);
			}
		}
	}
	
	private void showRoomsButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = null;
		refreshData((String) roomsList.getSelectedItem());
	}
	
	private void addUpdateRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = HalController.updateRoomName(roomNameText.getText(), newRoomNameTextField.getText());
		refreshData(newRoomNameTextField.getText());
	}
	
	private void devicesTableDeleteKeyActionPerformed(java.awt.event.ActionEvent evt, boolean sensorInsteadOfActuator) {
		if(sensorInsteadOfActuator) {
			if (sensorTable.getSelectedRow() != -1) {
				String deviceName = (String) sensorTable.getModel().getValueAt(sensorTable.getSelectedRow(), 0);
		        int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete device " + deviceName + "?", 
		        		"Confirm Deletion",	JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if (choice == 0) { 
					error = HalController.deleteDevice(roomNameText.getText(), deviceName);
					refreshData(roomNameText.getText());
				}
			}
		} else {
			if (actuatorTable.getSelectedRow() != -1) {
				String deviceName = (String) actuatorTable.getModel().getValueAt(actuatorTable.getSelectedRow(), 0);
		        int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete device " + deviceName + "?", 
		        		"Confirm Deletion",	JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if (choice == 0) { 
					error = HalController.deleteDevice(roomNameText.getText(), deviceName);
					refreshData(roomNameText.getText());
				}
			}
		}

	}
	
	private void deleteSensorTypeButtonActionPerformed(ActionEvent actionevent) {
		error = HalController.deleteDeviceType(sensorTypesList.getSelectedItem().toString());
		refreshData(roomNameText.getText());
	}
	
	private void addSensorTypeButtonActionPerformed(ActionEvent actionevent) {
		String sensorType = newSensorTypeTextField.getText();
		error = HalController.addSensorType(sensorType);
		refreshData(roomNameText.getText());
	}

	private void deleteActuatorTypeButtonActionPerformed(ActionEvent actionevent) {
		error = HalController.deleteDeviceType(actuatorTypesList.getSelectedItem().toString());
		refreshData(roomNameText.getText());
	}

	private void addActuatorTypeButtonActionPerformed(ActionEvent actionevent) {
		String actuatorType = newActuatorTypeTextField.getText();
		error = HalController.addActuatorType(actuatorType);
		refreshData(roomNameText.getText());
	}
	
	private void addSensorButtonActionPerformed(java.awt.event.ActionEvent evt) {
		String period = newSensorPeriodTextField.getText();
		if (period.trim().length() == 0) {
			error = HalController.addSensor(
				newSensorNameTextField.getText(),
				(String) sensorTypesList.getSelectedItem(),
				newSensorIsActiveCheckBox.isSelected(),
				roomNameText.getText()
			);
		} else {
			try {
				float periodNum = Float.parseFloat(period);
				error = HalController.addSensor(
					newSensorNameTextField.getText(),
					(String) sensorTypesList.getSelectedItem(),
					newSensorIsActiveCheckBox.isSelected(),
					roomNameText.getText(),
					periodNum
			);
			} catch (NumberFormatException e) {
				error = "Invalid number for period";
			}
		}
		refreshData(roomNameText.getText());
	}
	
	private void addActuatorButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = HalController.addActuator(
				newActuatorNameTextField.getText(),
				(String) actuatorTypesList.getSelectedItem(),
				newActuatorIsActiveCheckBox.isSelected(),
				roomNameText.getText());
		refreshData(roomNameText.getText());
	}

	/** The following methods are helper methods to simplify the methods.
	 */
	private void initializeButton(JButton button, String text, ActionListener actionListener) {
		button.setText(text);
		button.addActionListener(actionListener);
	}

	private void populateSensorsTable(ToRoom foundRoom) {
		sensorsDtm = new DefaultTableModel(0, 0);
		sensorsDtm.setColumnIdentifiers(sensorColumnNames);
		sensorTable.setModel(sensorsDtm);
		if (foundRoom != null) {
			for (ToSensor s : foundRoom.getSensors()) {
				Object[] obj = {s.getName(), s.deviceType(), s.isActive(), s.getMeasurementPeriodInSeconds()};
				sensorsDtm.addRow(obj);
			}
		}
	}
	
	private void populateActuatorsTable(ToRoom foundRoom) {
		actuatorsDtm = new DefaultTableModel(0, 0);
		actuatorsDtm.setColumnIdentifiers(actuatorColumnNames);
		actuatorTable.setModel(actuatorsDtm);
		if (foundRoom != null) {
			for (ToActuator a : foundRoom.getActuators()) {
				Object[] obj = {a.getName(), a.deviceType(), a.isActive()};
				actuatorsDtm.addRow(obj);
			}
		}
	}
	
	private void enableDisableUiFields(boolean enable) {
		clearRoomButton.setEnabled(enable);
		addRoomButton.setEnabled(!enable);
		addUpdateRoomButton.setEnabled(enable);
	}
	
	private void enableDisableUiFields2(boolean enable) {
		newSensorNameTextField.setEnabled(enable);
		addSensorButton.setEnabled(enable);
	}
	
	private void enableDisableUiFields3(boolean enable) {
		newActuatorNameTextField.setEnabled(enable);
		addActuatorButton.setEnabled(enable);
	}
}
<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.control.Button?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.control.Tab?>
<?import javafx.scene.control.TabPane?>
<?import javafx.scene.control.TableColumn?>
<?import javafx.scene.control.TableView?>
<?import javafx.scene.control.TextField?>
<?import javafx.scene.control.TreeView?>
<?import javafx.scene.layout.AnchorPane?>

<TabPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0" tabClosingPolicy="UNAVAILABLE" xmlns="http://javafx.com/javafx/8.0.171" xmlns:fx="http://javafx.com/fxml/1">
  <tabs>
    <Tab text="Personal Information">
      <content>
        <AnchorPane minHeight="0.0" minWidth="0.0" prefHeight="180.0" prefWidth="200.0">
               <children>
                  <TreeView prefHeight="372.0" prefWidth="600.0" />
                  <Label layoutX="14.0" layoutY="6.0" text="Name" />
                  <Label layoutX="16.0" layoutY="36.0" text="Date of Birth" />
                  <Label layoutX="16.0" layoutY="68.0" text="Account Type" />
               </children></AnchorPane>
      </content>
    </Tab>
      <Tab text="Loans">
        <content>
          <AnchorPane minHeight="0.0" minWidth="0.0" prefHeight="180.0" prefWidth="200.0">
               <children>
                  <TableView layoutX="-2.0" layoutY="-2.0" prefHeight="374.0" prefWidth="600.0">
                    <columns>
                      <TableColumn prefWidth="484.0" text="Loan Description" />
                      <TableColumn minWidth="0.0" prefWidth="115.0" text="Balance Due" />
                    </columns>
                  </TableView>
               </children>
            </AnchorPane>
        </content>
      </Tab>
    <Tab text="Security">
      <content>
        <AnchorPane minHeight="0.0" minWidth="0.0" prefHeight="180.0" prefWidth="200.0">
               <children>
                  <Button layoutX="245.0" layoutY="209.0" mnemonicParsing="false" text="Change Password" />
                  <Label layoutX="77.0" layoutY="14.0" prefHeight="49.0" prefWidth="466.0" text="Click the button below to change your password once apporpriate fields are filled out" />
                  <TextField layoutX="226.0" layoutY="102.0" text="Enter Current Password" />
                  <TextField layoutX="226.0" layoutY="150.0" text="Enter New Password" />
               </children></AnchorPane>
      </content>
    </Tab>
  </tabs>
</TabPane>

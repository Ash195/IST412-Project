<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.control.Button?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.control.TableColumn?>
<?import javafx.scene.control.TableView?>
<?import javafx.scene.control.TextField?>
<?import javafx.scene.layout.AnchorPane?>
<?import javafx.scene.layout.VBox?>
<?import javafx.scene.text.Font?>

<AnchorPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0" xmlns="http://javafx.com/javafx/8.0.171" xmlns:fx="http://javafx.com/fxml/1" fx:controller="javafx.Addincome">
   <children>
      <VBox layoutX="33.0" layoutY="14.0" prefHeight="42.0" prefWidth="498.0">
         <children>
            <Label prefHeight="33.0" prefWidth="493.0" text="Are you sure you would like to close your account?">
               <font>
                  <Font name="System Bold Italic" size="18.0" />
               </font></Label>
         </children>
      </VBox>
      <Button fx:id="Back" layoutX="471.0" layoutY="360.0" mnemonicParsing="false" onAction="#BackToMainPage" text="Back to main page" />
      <TextField fx:id="categoryTextField" layoutX="191.0" layoutY="286.0" prefHeight="25.0" prefWidth="183.0" promptText="Enter the category" text="Enter your password to confirm" />
      <Button layoutX="230.0" layoutY="335.0" mnemonicParsing="false" onAction="#NewIncome" text="Delete Account" />
      <TableView fx:id="tableView" layoutX="75.0" layoutY="66.0" prefHeight="200.0" prefWidth="393.0">
        <columns>
          <TableColumn fx:id="categoryColumn" onEditCommit="#changeCategoryCellEvent" prefWidth="141.3333282470703" text="Loan History Dates" />
          <TableColumn fx:id="AmountColumn" onEditCommit="#changeAmountCellEvent" prefWidth="135.3333740234375" text="Amount" />
        </columns>
      </TableView>
   </children>
</AnchorPane>

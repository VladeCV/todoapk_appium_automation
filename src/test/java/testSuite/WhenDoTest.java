package testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class WhenDoTest extends TestBase {

    @Test
    public void verifyCreateTask() {
        String nameTask = "Task " + new Date().getTime();
        mainActivity.addTaskButton.clickControl();
        taskFormActivity.titleTextBox.setText(nameTask);
        taskFormActivity.notesTextBox.setText("esto es una nota creada");
        taskFormActivity.saveButton.clickControl();
        Assertions.assertTrue(mainActivity.isTaskDisplayedInList(nameTask));
    }

}

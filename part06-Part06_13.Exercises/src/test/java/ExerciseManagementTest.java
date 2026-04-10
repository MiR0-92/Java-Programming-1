import static org.junit.Assert.*;

import org.junit.*;

public class ExerciseManagementTest {
    private ExerciseManagement management;

    @Before
    public void initialization() {
        this.management = new ExerciseManagement();
    }

    @Test
    public void isExerciseListEmpty() {
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addingExercisesGrowsByOne() {
        management.add("test");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList() {
        management.add("test");
        assertTrue(management.exerciseList().contains("test"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("test1");
        management.markedAsCompleted("test1");
        assertTrue(management.isCompleted("test1"));
    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("test2");
        management.markedAsCompleted("test2");
        assertFalse(management.isCompleted("test2"));
    }
}

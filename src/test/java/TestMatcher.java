import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.hamcrest.Matchers.arrayWithSize;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.Matchers.isEmptyString;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Every.everyItem;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestMatcher {


    @Test
    public void ts_01_check_Array_hasSize() {
        List<Integer> scores = Arrays.asList(99, 100, 101, 105);
        assertThat(scores, hasSize(4));

    }
    @Test
    public void ts_02_check_Array_hasItems() {
        List<Integer> scores = Arrays.asList(99, 100, 101, 105);
        assertThat(scores, hasItems(100, 101));
    }
    @Test
    public void ts_03_check_Array_everyItem_greaterThan() {
        List<Integer> scores = Arrays.asList(99, 100, 101, 105);
        assertThat(scores, everyItem(greaterThan(90)));
    }
    @Test
    public void ts_04_check_Array_everyItem_lessThan() {
        List<Integer> scores = Arrays.asList(99, 100, 101, 105);
        assertThat(scores, everyItem(lessThan(200)));
    }
    @Test
    public void ts_05_check_String_isEmptyString() {
        // String
        assertThat("", isEmptyString());
    }
    @Test
    public void ts_06_check_String_isEmptyOrNullString() {
        // String
        assertThat(null, isEmptyOrNullString());
    }
    @Test
    public void ts_07_check_Array_arrayWithSize() {
        // Array
        Integer[] marks = { 1, 2, 3 };
        assertThat(marks, arrayWithSize(3));

    }
    @Test
    public void ts_08_check_Array_arrayContainingInAnyOrder() {
        // Array
        Integer[] marks = { 1, 2, 3 };
        assertThat(marks, arrayContainingInAnyOrder(2, 3, 1));
    }



}
